package com.practica.form.springvalidacionanotaciones.app.controllers;

import com.practica.form.springvalidacionanotaciones.app.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping({"", "/", "/formulario"})
public class IndexController {

    @GetMapping("/form")
    public String index(Customer customer, Model model) {
        model.addAttribute("title", "Customer form");
        model.addAttribute("customer", customer);
        return "form";
    }

    @PostMapping("/form")
    public String procesar(@Valid Customer customer, BindingResult result, Model model) {
        model.addAttribute("title", "Customer data");
        if (result.hasErrors()) {
            return "form";
        }
        model.addAttribute("customer", customer);
        return "datos";
    }


}



