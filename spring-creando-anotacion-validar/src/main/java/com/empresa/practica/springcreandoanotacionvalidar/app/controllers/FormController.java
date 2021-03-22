package com.empresa.practica.springcreandoanotacionvalidar.app.controllers;

import com.empresa.practica.springcreandoanotacionvalidar.app.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/controller")
public class FormController {

    @GetMapping("/form")
    public String form(Cliente cliente, Model model) {
        model.addAttribute("title", "Customer Form");
        model.addAttribute("cliente", cliente);
        return "form";
    }

    @PostMapping("/form")
    public String process(@Valid Cliente cliente, BindingResult result, Model model) {
        model.addAttribute("title", "Customer data");

        if (result.hasErrors()) {
            return "form";
        }

        model.addAttribute("cliente", cliente);
        return "data";
    }
}
