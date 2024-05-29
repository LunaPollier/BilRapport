package com.kea.bilrapport.Controller;

import com.kea.bilrapport.Model.Skade;
import com.kea.bilrapport.Repository.SkadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/skader")
@CrossOrigin(origins = "http://localhost:8080")
public class SkadeController {

    @Autowired
    private SkadeRepository skadeRepository;

    @GetMapping
    public String showSkader(Model model) {
        List<Skade> skader = skadeRepository.findAll();
        model.addAttribute("skader", skader);
        return "skadeListe"; // Opret en Thymeleaf-skabelon ved navn skadeListe.html
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("skade", new Skade());
        return "createSkade";  // Opret en Thymeleaf-skabelon ved navn createSkade.html
    }

    @PostMapping("/create")
    public Skade createSkade(@ModelAttribute Skade skade) {
        skadeRepository.save(skade);
       return skade;
    }


    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Skade skade = skadeRepository.findById(id);
        if (skade == null) {
            // Håndter tilfælde hvor skaden ikke findes
            return "redirect:/skader";
        }
        model.addAttribute("skade", skade);
        return "editSkade";  // Sørg for, at denne skabelon eksisterer
    }

    @PostMapping("/update/{id}")
    public String updateSkade(@PathVariable("id") Long id, @ModelAttribute Skade skade) {
        skade.setSkadeId(id);
        skadeRepository.update(skade);
        return "redirect:/skader";
    }

    @GetMapping("/delete/{id}")
    public String deleteSkade(@PathVariable("id") Long id) {
        skadeRepository.deleteById(id);
        return "redirect:/skader";
    }

}
