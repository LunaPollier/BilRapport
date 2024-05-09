package Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Opretcontroller {
    @GetMapping("/opret")
    public String showopretForm() {
        return "Opret";
    }

    @PostMapping("/submit-your-opret-path")
    public String submitSignupForm(@RequestParam("username") String username,
                                   @RequestParam("email") String email,
                                   @RequestParam("password") String password,
                                   @RequestParam("confirm-password") String confirmPassword) {

        System.out.println("Modtaget brugeroprettelsesdata:");
        System.out.println("Brugernavn: " + username);
        System.out.println("E-mail: " + email);
        System.out.println("Adgangskode: " + password);
        System.out.println("Bekræft adgangskode: " + confirmPassword);


        return "opret-success";
    }
}

