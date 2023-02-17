package be.thomasmore.party.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

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
    @GetMapping("/pay")
    public String pay(Model model){
        LocalDate currentDate = LocalDate.now();
        LocalDate currentDatePlusDertig = LocalDate.now().plusDays(30);
        model.addAttribute("currentDate", currentDate);
        model.addAttribute("currentDatePlusDertig", currentDatePlusDertig);
        return "pay";
    }

}
