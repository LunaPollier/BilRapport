package com.kea.bilrapport.Repository;
import com.kea.bilrapport.Model.Skade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class SkadeRepository {

    private final JdbcTemplate jdbcTemplate;

    public SkadeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Skade> findAll() {
        String sql = "SELECT * FROM skade";
        return jdbcTemplate.query(sql, new SkadeRowMapper());
    }

    public Skade findById(Long id) {
        String sql = "SELECT * FROM skade WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new SkadeRowMapper(), id);
    }

    public void save(Skade skade) {
        String sql = "INSERT INTO skade (stelnummer, bil_id, beskrivelse, pris) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, skade.getStelnummer(), skade.getBilId(), skade.getBeskrivelse(), skade.getPris());
    }

    public void update(Skade skade) {
        String sql = "UPDATE skade SET stelnummer = ?, bil_id = ?, beskrivelse = ?, pris = ? WHERE id = ?";
        jdbcTemplate.update(sql, skade.getStelnummer(), skade.getBilId(), skade.getBeskrivelse(), skade.getPris(), skade.getId());
    }

    public void deleteById(Long id) {
        String sql = "DELETE FROM skade WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    private static class SkadeRowMapper implements RowMapper<Skade> {
        @Override
        public Skade mapRow(ResultSet rs, int rowNum) throws SQLException {
            Skade skade = new Skade();
            skade.setId(rs.getLong("id"));
            skade.setStelnummer(rs.getString("stelnummer"));
            skade.setBilId(rs.getLong("bil_id"));
            skade.setBeskrivelse(rs.getString("beskrivelse"));
            skade.setPris(rs.getDouble("pris"));
            return skade;
        }
    }
}
