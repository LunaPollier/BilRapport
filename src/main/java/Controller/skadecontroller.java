package Controller;

import Klasser.Skade;
import Repository.SkadeRepository;
import org,springframework.web.bind.annotation.PathVariable

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/skade")
public class SkadeController {
    private SkadeRepository skadeRepository;

    public SkadeController(SkadeRepository skadeRepository) {
        this.skadeRepository = skadeRepository;
    }

    @PostMapping
    public String registrerSkade(@RequestBody Skade skade) {
        skadeRepository.save(skade);
        return "Skade registreret med succes.";
    }

    @GetMapping("/{skadeId}")
    public Skade hentSkade(@PathVariable Long skadeId) {
        return skadeRepository.findById(skadeId)
                .orElseThrow(() -> new SkadeNotFoundException(skadeId));
    }
}


