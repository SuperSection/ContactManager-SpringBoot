package org.supersection.SmartContactManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("home")
    public String home(Model model) {
        System.out.println("Home page handler");
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("address", "Super Street");
        model.addAttribute("github", "https://github.com/SuperSection/ContactManager-SpringBoot.git");
        return "home";
    }
}
