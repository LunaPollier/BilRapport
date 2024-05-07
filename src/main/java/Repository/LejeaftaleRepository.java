package Repository;

import Klasser.Lejeaftale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LejeaftaleRepository {

    private static JdbcTemplate jdbcTemplate;

    @Autowired
    public LejeaftaleRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public static void save(Lejeaftale lejeaftale) {
        String sql = "INSERT INTO lejeaftale (kunde_navn, bil_model, leje_start_dato, leje_slut_dato) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, lejeaftale.getKundeNavn(), lejeaftale.getBilModel(), lejeaftale.getLejeStartDato(), lejeaftale.getLejeSlutDato());
    }
}