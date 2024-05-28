package com.kea.bilrapport.Controller;

import com.kea.bilrapport.Model.nylejeaftale;
import com.kea.bilrapport.Repository.BilabonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
/*

@Controller
public class Bilabonnementcontroller {

    @Autowired
    private BilabonnementRepository bilabonnementRepository;

    @GetMapping("/")
    public String index() {
        return "redirect:/Lejeaftale";
    }

    @GetMapping("/Lejeaftale")
    public String showLejeaftale(Model model) {
        // tilføj alle lejeaftaler til viewmodel, så de kan bruges af Thymeleaf i HTML
        List<nylejeaftale> lejeaftaler = bilabonnementRepository.findAll();
        model.addAttribute("lejeaftaler", lejeaftaler);
        return "Lejeaftale";
    }

    @GetMapping("/create")
    public String showCreate() {
        // vis create-siden
        return "createLejeaftale";
    }

    @PostMapping("/create")
    public String createLejeaftale(@RequestParam("fornavn") String fornavn,
                                   @RequestParam("efternavn") String efternavn,
                                   @RequestParam("stelnummer") String stelnummer,
                                   @RequestParam("bilmodel") String bilmodel,
                                   @RequestParam("bilmærke") String bilmærke,
                                   @RequestParam("startLejeperiode") Date startLejeperiode,
                                   @RequestParam("pris") double pris,
                                   @RequestParam("slutLejeperiode") Date slutLejeperiode)
    {

        nylejeaftale lejeaftale = new nylejeaftale(fornavn, efternavn, stelnummer, bilmodel, bilmærke, startLejeperiode, slutLejeperiode, pris);
        lejeaftale.setId(Integer.parseInt("id")); // Husk at sætte ID for opdateringen
        bilabonnementRepository.update(lejeaftale);
        // Tilbage til oversigten
        return "redirect:/Lejeaftale";
    }

    @GetMapping("/delete/{id}")
    public String deleteLejeaftale(@PathVariable("id") int deleteId) {
        // Slet lejeaftale fra repository
        bilabonnementRepository.deleteById(deleteId);
        // Returner til oversigten
        return "redirect:/Lejeaftale";
    }
}
*/