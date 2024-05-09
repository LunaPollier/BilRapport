package Controller;

import Klasser.Skade;
import Repository.SkadeRepositoryy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skade")
public class Skadecontroller {
    private final SkadeRepositoryy skadeRepository;

    @Autowired
    public Skadecontroller(SkadeRepositoryy skadeRepository) {
        this.skadeRepository = skadeRepository;
    }

    @PostMapping
    public String registrerSkade(@RequestBody Skade skade) {
        skadeRepository.save(skade);
        return "Skade registreret med succes.";
    }

    @GetMapping("/{bilId}")
    public Skade hentSkade(@PathVariable Long bilId) {
        return skadeRepository.findById(bilId)
                .orElseThrow();
    }
}


