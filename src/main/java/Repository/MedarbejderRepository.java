package Repository;

import Klasser.Medarbejder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedarbejderRepository extends JpaRepository<Medarbejder, Long> {
    public class MedarbejderService {
        public Medarbejder hentMedarbejder(Long medarbejderId) {
        }

        public Medarbejder opretMedarbejder(Medarbejder medarbejder) {
        }
    }
    // Ingen metoder behøver at blive implementeret her, da JpaRepository allerede giver os
    // de grundlæggende CRUD-operationer (oprette, læse, opdatere, slette)
}

@Service
public class MedarbejderService {
    public Medarbejder opretMedarbejder(Medarbejder medarbejder) {
        // Implementer opretMedarbejder-logikken her
        return null;
    }

    public Medarbejder hentMedarbejder(Long medarbejderId) {
        // Implementer hentMedarbejder-logikken her
        return null;
    }
}












