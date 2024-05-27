package com.kea.bilrapport.Controller;

import com.kea.bilrapport.Model.DataRegistrering;
import com.kea.bilrapport.Repository.DataRegistreringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/dataregistrering")
@CrossOrigin(origins = "http://localhost:63342") // Tillader anmodninger fra frontend URL
public class DataRegistreringController {

    private final DataRegistreringRepository dataRegistreringRepository;

    @Autowired
    public DataRegistreringController(DataRegistreringRepository dataRegistreringRepository) {
        this.dataRegistreringRepository = dataRegistreringRepository;
    }


    @GetMapping("/dataregistrering")
    public String getDataRegistreringPage() {
        return "dataregistrering";
    }

    @GetMapping()
    public String hentAlleDataRegistreringer(Model model) {
        List<DataRegistrering> registreringer = dataRegistreringRepository.findAll();
        model.addAttribute("antalDataRegistreringer", registreringer.size()); // Opdateret attributnavn
        return "forside";
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
        return "redirect:/dataregistrering"; // Redirect to the list view after saving
    }

    @DeleteMapping("/{stelNummer}")
    public String sletDataRegistrering(@PathVariable String stelNummer) {
        dataRegistreringRepository.deleteById(stelNummer);
        return "redirect:/dataregistrering"; // Redirect to the list view after deleting
    }
}
