package com.kea.bilrapport.Controller;

import com.kea.bilrapport.Model.DataRegistrering;
import com.kea.bilrapport.Repository.DataRegistreringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;

@Controller
public class HomeController {


        @Autowired
        private DataRegistreringRepository dataRegistreringRepository;

        // Redirect fra roden til /forside
        @GetMapping("/")
        public RedirectView redirectToHome() {
            return new RedirectView("/forside");
        }

        @GetMapping("/dataregistreringer")
        public String visDataregistrering() {
            return "dataregistrering";
        }

        @GetMapping("/skade")
        public String visSkade() {
            return "skade";
        }

        @GetMapping("/kundeOversigt")
        public String visKundeOversigt() {
            return "kundeOversigt";
        }

        @GetMapping("/forside")
        public String visForside(Model model) {
            // Fetcher data fra repository
            List<DataRegistrering> dataRegistreringList = dataRegistreringRepository.findAll();

            // Beregner aktive lejede biler
            int antalAktiveLejeaftaler = dataRegistreringList.size();

            // Beregner den samlede pris for antal lejede biler
            double totalPris = dataRegistreringList.stream()
                    .filter(data -> data.getPrice() != null) // Tjek at getPrice ikke returnerer null
                    .mapToDouble(DataRegistrering::getPrice)
                    .sum();

            // Tilføjer atributter til model
            model.addAttribute("antalAktiveLejeaftaler", antalAktiveLejeaftaler);
            model.addAttribute("totalPris", totalPris);

            return "forside";
        }
    }


