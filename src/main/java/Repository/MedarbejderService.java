package Repository;

import Klasser.Medarbejder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedarbejderService {

    private final MedarbejderRepository medarbejderRepository;

    @Autowired
    public MedarbejderService(MedarbejderRepository medarbejderRepository) {
        this.medarbejderRepository = medarbejderRepository;
    }

    public Medarbejder opretMedarbejder(Medarbejder medarbejder) {

        // Gem medarbejderen i databasen
        return medarbejderRepository.save(medarbejder);
    }

    public Medarbejder hentMedarbejder(Long medarbejderId) {
        return medarbejderRepository.findById(medarbejderId).orElse(null);
    }
}
