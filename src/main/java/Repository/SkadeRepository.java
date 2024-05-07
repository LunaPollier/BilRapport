package Repository;
import Klasser.Skade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SkadeRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SkadeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save (Skade skade) {
        String sql = "INSERT INTO skade (bil_id, beskrivelse, pris) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, skade.getBilId(), skade.getBeskrivelse(), skade.getPris());
    }
}
