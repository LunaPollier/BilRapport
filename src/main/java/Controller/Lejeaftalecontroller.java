package Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/lejeaftaler")
public class Lejeaftalecontroller {


    @GetMapping("/opret")
    public String visOpretLejeaftaleForm(Model model) {
        model.addAttribute("lejeaftale", new Lejeaftale()); // Tilføjer en ny lejeaftale til modellen
        return "opret-lejeaftale"; // Returnerer navnet på HTML-filen, der indeholder formularen
    }

    // POST-mapping for at modtage og gemme den nye lejeaftale
    @PostMapping("/opret")
    public String opretLejeaftale(@ModelAttribute model.Lejeaftale lejeaftale) {
        // Gem lejeaftalen i databasen eller udfør anden relevant logik
        return "redirect:/lejeaftaler/opret-success"; // Redirect til en bekræftelsesside
    }

    // GET-mapping for at vise en bekræftelsesside efter vellykket oprettelse af lejeaftalen
    @GetMapping("/opret-success")
    public String visOpretSuccessSide() {
        return "opret-lejeaftale-success"; // Returnerer navnet på HTML-filen for bekræftelsessiden
    }

    private class Lejeaftale {
    }
}

