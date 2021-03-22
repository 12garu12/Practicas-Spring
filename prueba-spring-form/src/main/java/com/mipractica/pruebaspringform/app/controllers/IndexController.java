package com.mipractica.pruebaspringform.app.controllers;


import com.mipractica.pruebaspringform.app.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class IndexController {

    @GetMapping("/vistaform")
    public String indexForm(Usuario usuario, Model model) {
        model.addAttribute("titulo", "Formulario de inscripcion");
        model.addAttribute("usuario", usuario);
        return "formulario";
    }

    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model) {
        model.addAttribute("titulo", "Resultado con los valores procesados");

        if (result.hasErrors()) {
            return "formulario";
        }

        model.addAttribute("usuario", usuario);
        return "resultado";
    }

}
