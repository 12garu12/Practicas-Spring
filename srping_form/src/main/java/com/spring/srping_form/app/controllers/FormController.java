package com.spring.srping_form.app.controllers;


import com.spring.srping_form.app.editors.RoleEditor;
import com.spring.srping_form.app.models.Role;
import com.spring.srping_form.app.models.User;
import com.spring.srping_form.app.services.IRoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class FormController {

    @Autowired
    private RoleEditor roleEditor;

    @Autowired
    private IRoleServices roleServices;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Role.class, "roles", roleEditor);
    }


    @ModelAttribute("listaRoles")
    public List<Role> listaRoles() {
        return roleServices.ListarRoles();
    }

    @GetMapping("/form")
    public String form(User user, Model model) {
        model.addAttribute("title", "Formulario de usuarios");
        model.addAttribute("user", user);
        return "form";
    }

    @PostMapping("/form")
    public String process(@Valid User user, BindingResult result, Model model) {
        model.addAttribute("title", "Datos del usuario");
        if (result.hasErrors()) {
            return "form";
        }
        model.addAttribute("user", user);
        return "data";
    }

}
