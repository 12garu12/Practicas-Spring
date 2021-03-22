package com.spring.spring_demo_project.appp.controllers;

import com.spring.spring_demo_project.appp.domain.models.Country;
import com.spring.spring_demo_project.appp.domain.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        model.addAttribute("title", "User Data");
        if (result.hasErrors()) {
            return "form";
        }
        model.addAttribute("user", user);
        return "data";
    }

    @ModelAttribute("Countries")
    public List<Country> countries() {
        List<Country> countriesList = Arrays.asList(
                new Country(1, "ES", "España"),
                new Country(2, "CO", "Colombia"),
                new Country(3, "CL", "Chile"),
                new Country(4, "AR", "Argentina"),
                new Country(5, "PE", "Peru")
        );
        return countriesList;
    }


}
