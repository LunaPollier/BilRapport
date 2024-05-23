package com.kea.bilrapport.Controller;

import com.kea.bilrapport.Model.Skade;
import com.kea.bilrapport.Repository.SkadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skade")
@CrossOrigin(origins = "http://localhost:63342") // Tillader anmodninger fra din frontend URL
public class SkadeController {
    private final SkadeRepository skadeRepository;

    @Autowired
    public SkadeController(SkadeRepository skadeRepository) {
        this.skadeRepository = skadeRepository;
    }

    @PostMapping("/opret-skade")
    public Skade opretSkade(@RequestBody Skade skade) {
        return skadeRepository.save(skade);
    }

    @GetMapping("/{bilId}")
    public Skade hentSkade(@PathVariable Long bilId) {
        return skadeRepository.findById(bilId)
                .orElseThrow(() -> new RuntimeException("Skade ikke fundet med bilId: " + bilId));
    }
}
