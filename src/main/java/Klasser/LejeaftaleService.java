package Klasser;
import Repository.LejeaftaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LejeaftaleService {

    private final LejeaftaleRepository lejeaftaleRepository;

    @Autowired
    public LejeaftaleService(LejeaftaleRepository lejeaftaleRepository) {
        this.lejeaftaleRepository = lejeaftaleRepository;
    }

    @Transactional
    public void gemLejeaftale(Lejeaftale lejeaftale) {
        lejeaftaleRepository.save(lejeaftale);
    }
}