package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Returnerer navnet på din HTML-fil for login-siden
    }

    @PostMapping("/submit-your-login-path")
    public String submitLoginForm(@RequestParam("username") String username,
                                  @RequestParam("password") String password,
                                  Model model) {

        // Her kan du implementere logikken til at validere brugerens loginoplysninger
        // Du kan også tilføje logik til at tjekke brugernavn og adgangskode mod en database

        if (isValidLogin(username, password)) {
            // Hvis login er vellykket, kan du f.eks. viderestille brugeren til en velkomstsiden
            return "redirect:/welcome"; // Skift "welcome" til den faktiske URL for velkomstsiden
        } else {
            // Hvis login mislykkedes, kan du returnere login-siden med en fejlmeddelelse
            model.addAttribute("error", true);
            return "login";
        }
    }

    // En simpel metode til at validere brugerens loginoplysninger
    private boolean isValidLogin(String username, String password) {
        // Her kan du implementere din egen logik til at validere loginoplysninger
        // Dette er blot et simpelt eksempel
        return username.equals("admin") && password.equals("password");
    }
}
