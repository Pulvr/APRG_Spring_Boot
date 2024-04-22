package de.hawhamburg.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Annotation @controller muss sein, ansonsten findet spring den controller nicht
//Klassen und Methoden können heißen wie sie wollen

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("newsHeader", "Hallo");
        model.addAttribute("msg", 1);
        return "index";
    }

}
