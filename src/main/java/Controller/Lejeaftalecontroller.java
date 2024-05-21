package Controller;
import Klasser.Lejeaftale;
import Klasser.LejeaftaleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


    @Controller
    @RequestMapping("/lejeaftaler")
    public class Lejeaftalecontroller {

        private final LejeaftaleService lejeaftaleService;

        @Autowired
        public Lejeaftalecontroller(LejeaftaleService lejeaftaleService) {
            this.lejeaftaleService = lejeaftaleService;
        }

        @GetMapping("/opret")
        public String visOpretLejeaftaleForm(Model model) {
            model.addAttribute("lejeaftale", new Lejeaftale());
            return "dataregistrering";
        }

        @PostMapping("/opret")
        public String opretLejeaftale(@ModelAttribute Lejeaftale lejeaftale, Model model) {
            lejeaftaleService.gemLejeaftale(lejeaftale); // Gem lejeaftalen ved hjælp af serviceklassen
            model.addAttribute("lejeaftale", lejeaftale);
            return "opret-lejeaftale-success"; // Retur stien uden ".html"
        }
    }

