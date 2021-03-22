package com.srping.springcustompropertieditorvalidacion.app.controllers;


import com.srping.springcustompropertieditorvalidacion.app.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormController {


    @GetMapping("/form")
    public String form(User user, Model model) {
        model.addAttribute("title", "Formulario del Banco");
        model.addAttribute("user", user);
        return "form";
    }

    @PostMapping("/form")
    public String process(@Valid User user, BindingResult result, Model model) {
        model.addAttribute("title", "Datos del Cliente");
        if (result.hasErrors()) return "form";
        model.addAttribute("user", user);
        return "data";
    }

}
