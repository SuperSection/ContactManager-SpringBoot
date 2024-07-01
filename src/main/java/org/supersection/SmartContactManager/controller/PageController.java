package org.supersection.SmartContactManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class PageController {

    @GetMapping
    public String home(Model model) {
        System.out.println("Home page handler");
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("address", "Super Street");
        model.addAttribute("github", "https://github.com/SuperSection/ContactManager-SpringBoot.git");
        return "home";
    }
}
