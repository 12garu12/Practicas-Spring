package com.test.spring_validacion_anotaciones.app.controllers;


import com.test.spring_validacion_anotaciones.app.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/form")
    public String form(Usuario usuario, Model model) {
        model.addAttribute("title", "User form");
        model.addAttribute("usuario", usuario);
        return "form";
    }

    @PostMapping("/form")
    public String process(@Valid Usuario usuario, BindingResult result, Model model) {
        model.addAttribute("title", "User data");
        if (result.hasErrors()) {
            return "form";
        }
        model.addAttribute("usuario", usuario);
        return "data";
    }


}
