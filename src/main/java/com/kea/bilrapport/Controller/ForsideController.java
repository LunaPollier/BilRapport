package com.kea.bilrapport.Controller;

import com.kea.bilrapport.Model.Medarbejder;
import com.kea.bilrapport.Repository.MedarbejderRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ForsideController {

    @Autowired
    private MedarbejderRepository medarbejderRepository;

    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @GetMapping("/register")
    public String register() {
        return "register";
    }


    @PostMapping("/login")
    public String loginUser(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpSession session,
                            Model model) {
        Medarbejder medarbejder = medarbejderRepository.findByUsername(username);
        if (medarbejder != null && medarbejder.getPassword().equals(password)) {
            session.setAttribute("medarbejder", medarbejder);
            return "redirect:/dataregistrering"; // Redirect to data registration page after successful login
        }
        model.addAttribute("error", "Invalid username or password");
        return "login";
    }

    @GetMapping("/forside")
    public String forside(HttpSession session) {
        if (session.getAttribute("medarbejder") == null) {
            return "redirect:/dataregistrering";
        }
        return "forside";
    }

}
