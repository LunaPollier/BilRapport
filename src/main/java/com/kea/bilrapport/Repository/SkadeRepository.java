package com.kea.bilrapport.Repository;
import com.kea.bilrapport.Model.Skade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SkadeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Skade> findAll() {
        String sql = "SELECT * FROM skade";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Skade.class));
    }

    public void save(Skade skade) {
        String sql = "INSERT INTO skade (stelnummer, bil_id, beskrivelse, pris) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, skade.getStelnummer(), skade.getBilId(), skade.getBeskrivelse(), skade.getPris());
    }

    public Skade findById(Long id) {
        String sql = "SELECT * FROM skade WHERE skade_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Skade.class), id);
    }

    public void update(Skade skade) {
        String sql = "UPDATE skade SET stelnummer = ?, bil_id = ?, beskrivelse = ?, pris = ? WHERE skade_id = ?";
        jdbcTemplate.update(sql, skade.getStelnummer(), skade.getBilId(), skade.getBeskrivelse(), skade.getPris(), skade.getSkadeId());
    }

    public void deleteById(Long id) {
        String sql = "DELETE FROM skade WHERE skade_id = ?";
        jdbcTemplate.update(sql, id);
    }
}
