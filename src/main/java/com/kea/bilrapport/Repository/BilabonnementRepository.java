package com.kea.bilrapport.Repository;

import com.kea.bilrapport.Model.nylejeaftale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BilabonnementRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<nylejeaftale> findAll() {
        final String GET_ALL_SQL = "SELECT * FROM nylejeaftale ORDER BY id";
        return jdbcTemplate.query(GET_ALL_SQL, new BeanPropertyRowMapper<>(nylejeaftale.class));
    }

    public void insert(nylejeaftale nylejeaftale) {
        final String INSERT_SQL = "INSERT INTO nylejeaftale (fornavn, efternavn, stelnummer, bilmodel, bilmærke, startLejeperiode, slutLejeperiode) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(INSERT_SQL,
                nylejeaftale.getFornavn(),
                nylejeaftale.getEfternavn(),
                nylejeaftale.getStelnummer(),
                nylejeaftale.getBilmodel(),
                nylejeaftale.getBilmærke(),
                nylejeaftale.getStartLejeperiode(),
                nylejeaftale.getSlutLejeperiode());
    }

    public nylejeaftale findById(int id) {
        final String FIND_BY_ID_SQL = "SELECT * FROM nylejeaftale WHERE id = ?";
        RowMapper<nylejeaftale> rowMapper = new BeanPropertyRowMapper<>(nylejeaftale.class);
        return jdbcTemplate.queryForObject(FIND_BY_ID_SQL, rowMapper, id);
    }

    public void deleteById(int id) {
        final String DELETE_BY_ID = "DELETE FROM nylejeaftale WHERE id = ?";
        jdbcTemplate.update(DELETE_BY_ID, id);
    }

    public void update(nylejeaftale nylejeaftale) {
        final String UPDATE_SQL = "UPDATE nylejeaftale SET fornavn = ?, efternavn = ?, stelnummer = ?, bilmodel = ?, bilmærke = ?, startLejeperiode = ?, slutLejeperiode = ? WHERE id = ?";
        jdbcTemplate.update(UPDATE_SQL,
                nylejeaftale.getFornavn(),
                nylejeaftale.getEfternavn(),
                nylejeaftale.getStelnummer(),
                nylejeaftale.getBilmodel(),
                nylejeaftale.getBilmærke(),
                nylejeaftale.getStartLejeperiode(),
                nylejeaftale.getSlutLejeperiode(),
                nylejeaftale.getId());
    }
}
