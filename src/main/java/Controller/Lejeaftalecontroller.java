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

    @PostMapping("/opret")
    public String opretLejeaftale(@ModelAttribute Lejeaftale lejeaftale, Model model) {
        // Gem lejeaftalen i databasen eller udfør anden relevant logik
        // Her kan du indsætte din kode til at gemme lejeaftalen i databasen
        // f.eks. ved hjælp af en serviceklasse eller et repository

        // Eksempel: lejeaftaleService.gemLejeaftale(lejeaftale);

        // Tilføj lejeaftalen til modellen, hvis du vil vise den på bekræftelsessiden
        model.addAttribute("lejeaftale", lejeaftale);

        // Returner navnet på HTML-filen til bekræftelsessiden
        return "opret-lejeaftale-success";
    }


    // GET-mapping for at vise en bekræftelsesside efter vellykket oprettelse af lejeaftalen
    @GetMapping("/opret-success")
    public String visOpretSuccessSide() {
        return "opret-lejeaftale-success"; // Returnerer navnet på HTML-filen for bekræftelsessiden
    }

    private class Lejeaftale {
    }
}

