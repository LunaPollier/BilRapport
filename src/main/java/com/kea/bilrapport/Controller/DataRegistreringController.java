package com.kea.bilrapport.Controller;

import com.kea.bilrapport.Model.DataRegistrering;
import com.kea.bilrapport.Repository.DataRegistreringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/dataregistrering")
@CrossOrigin(origins = "http://localhost:8080")
public class DataRegistreringController {

    private final DataRegistreringRepository dataRegistreringRepository;

    @Autowired
    public DataRegistreringController(DataRegistreringRepository dataRegistreringRepository) {
        this.dataRegistreringRepository = dataRegistreringRepository;
    }

    @GetMapping
    public String greeting(Model model) {
        return "dataregistrering"; // Thymeleaf template name (index.html)
    }

    @GetMapping("/data")
    @ResponseBody
    public ResponseEntity<List<DataRegistrering>> getDataRegistrering() {
        List<DataRegistrering> data = dataRegistreringRepository.findAll();
        return ResponseEntity.ok().body(data);
    }

    @GetMapping("/{stelNummer}")
    public String hentDataRegistreringEfterStelNummer(@PathVariable String stelNummer, Model model) {
        DataRegistrering dataRegistrering = dataRegistreringRepository.findById(stelNummer)
                .orElseThrow(() -> new RuntimeException("DataRegistrering ikke fundet med stelnummer: " + stelNummer));
        model.addAttribute("dataRegistrering", dataRegistrering);
        return "dataregistrering-detaljer"; // Return a view name for the details page
    }

    @PostMapping("/opret-lejeaftale")
    public String opretLejeAftale(@ModelAttribute DataRegistrering dataRegistrering) {
        dataRegistreringRepository.save(dataRegistrering);
        return "redirect:/dataregistrering";
    }


    @DeleteMapping("/{stelNummer}")
    public String sletDataRegistrering(@PathVariable String stelNummer) {
        dataRegistreringRepository.deleteById(stelNummer);
        return "redirect:/dataregistrering";
    }
    @GetMapping("/kundeOversigt")
    public String visKundeOversigt(Model model) {
        List<DataRegistrering> dataRegistreringList = dataRegistreringRepository.findAll();
        model.addAttribute("dataRegistreringList", dataRegistreringList);
        return "kundeOversigt";
    }
}
