package be.thomasmore.party.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/", "/home"})
    public String home(Model model){
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model){
        String myName = "Noah Jockmans";
        String myCity = "Muizen";
        String myStreet = "Laurierlaan 2";
        model.addAttribute("myCity", myCity);
        model.addAttribute("myName", myName);
        model.addAttribute("myStreet", myStreet);
        return "about";
    }

}
