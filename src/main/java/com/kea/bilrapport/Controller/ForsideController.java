package com.kea.bilrapport.Controller;

import com.kea.bilrapport.Model.DataRegistrering;
import com.kea.bilrapport.Repository.DataRegistreringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
/*
@Controller
@RequestMapping("/forside")
@CrossOrigin(origins = "http://localhost:63342") // Tillader anmodninger fra frontend URL
public class ForsideController {

    @Autowired
    private DataRegistreringRepository dataRegistreringRepository;

    @GetMapping()
    public String hentAlleDataRegistreringer(Model model) {
        List<DataRegistrering> registreringer = dataRegistreringRepository.findAll();
        model.addAttribute("antalDataRegistreringer", registreringer.size()); // Opdateret attributnavn
        return "forside";
    }
}
*/