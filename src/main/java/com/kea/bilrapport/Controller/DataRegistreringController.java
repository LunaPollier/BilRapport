package com.kea.bilrapport.Controller;

import com.kea.bilrapport.Klasser.DataRegistrering;
import com.kea.bilrapport.Repository.DataRegistreringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dataregistrering")
@CrossOrigin(origins = "http://localhost:63342") // Tillader anmodninger fra din frontend URL
public class DataRegistreringController {

    private final DataRegistreringRepository dataRegistreringRepository;

    @Autowired
    public DataRegistreringController(DataRegistreringRepository dataRegistreringRepository) {
        this.dataRegistreringRepository = dataRegistreringRepository;
    }

    @GetMapping
    public List<DataRegistrering> hentAlleDataRegistreringer() {
        return dataRegistreringRepository.findAll();
    }

    @GetMapping("/{stelNummer}")
    public DataRegistrering hentDataRegistreringEfterStelNummer(@PathVariable String stelNummer) {
        return dataRegistreringRepository.findById(stelNummer)
                .orElseThrow(() -> new RuntimeException("DataRegistrering ikke fundet med stelnummer: " + stelNummer));
    }

    @PostMapping("/opret-lejeaftale")
    public DataRegistrering opretLejeAftale(@RequestBody DataRegistrering dataRegistrering) {
        return dataRegistreringRepository.save(dataRegistrering);
    }

    @DeleteMapping("/{stelNummer}")
    public void sletDataRegistrering(@PathVariable String stelNummer) {
        dataRegistreringRepository.deleteById(stelNummer);
    }
}
