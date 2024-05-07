package Repository;
import Klasser.Skade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.Optional;

public interface SkadeRepositoryy {
    Optional<Skade> findById(Long skadeId);

    void save(Skade skade);
    // Andre metoder i dit repository...
}

