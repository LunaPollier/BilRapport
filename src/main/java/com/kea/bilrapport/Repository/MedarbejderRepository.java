package com.kea.bilrapport.Repository;
import com.kea.bilrapport.Model.Medarbejder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.kea.bilrapport.Model.Medarbejder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MedarbejderRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Medarbejder findByUsername(String username) {
        String query = "SELECT * FROM medarbejder WHERE username = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{username}, (rs, rowNum) -> {
            Medarbejder medarbejder = new Medarbejder();
            medarbejder.setUsername(rs.getString("username"));
            medarbejder.setPassword(rs.getString("password"));
            // Set other properties as needed
            return medarbejder;
        });
    }
}
