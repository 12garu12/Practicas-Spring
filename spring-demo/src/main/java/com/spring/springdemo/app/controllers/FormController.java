package com.spring.springdemo.app.controllers;

import com.spring.springdemo.app.domain.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FormController {

    @GetMapping("/form")
    public String form(User user, Model model) {
        model.addAttribute("title", "User form");
        model.addAttribute("user", user);
        return "form";
    }

    @PostMapping("/form")
    public String process(@Valid User user, BindingResult result, Model model) {
        model.addAttribute("title", "User data");
        if (result.hasErrors()) {
            return "form";
        }
        model.addAttribute("user", user);
        return "data";
    }

    @ModelAttribute("countries")
    public Map<String, String> countries() {
        Map<String, String> country = new HashMap<>();
        country.put("Es", "España");
        country.put("Mx", "Mexico");
        country.put("CL", "Chile");
        country.put("AR", "Argentina");
        return country;
    }


}
