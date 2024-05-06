import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilabonnementController {

    @GetMapping("/formular")
    public String visFormular(Model model) {
        model.addAttribute("user", new User()); // Tilføjer en tom bruger til modellen
        return "formular"; // Returnerer navnet på den HTML-fil, der indeholder formularen
    }

    @PostMapping("/opret-medarbejder")
    public String opretMedarbejder(User user) {
        // Implementér logikken til oprettelse af medarbejder her
        // Dette er blot et eksempel
        return "oprettet"; // Returnerer navnet på den HTML-fil, der viser en bekræftelsesside
    }
}
