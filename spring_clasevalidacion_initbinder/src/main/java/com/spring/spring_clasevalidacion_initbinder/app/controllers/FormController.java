package com.spring.spring_clasevalidacion_initbinder.app.controllers;

import com.spring.spring_clasevalidacion_initbinder.app.domain.models.Pais;
import com.spring.spring_clasevalidacion_initbinder.app.domain.models.User;
import com.spring.spring_clasevalidacion_initbinder.app.editors.EditarStringMayuscula;
import com.spring.spring_clasevalidacion_initbinder.app.editors.PaisEditor;
import com.spring.spring_clasevalidacion_initbinder.app.services.IPaisService;
import com.spring.spring_clasevalidacion_initbinder.app.validation.UserValidation;
import org.hibernate.validator.cfg.context.ReturnValueConstraintMappingContext;
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
import java.util.*;

@Controller
public class FormController {

    @Autowired
    private IPaisService paisService;

    @Autowired
    private PaisEditor paisEditor;

    @Autowired
    private UserValidation userValidation;


    @ModelAttribute("listaRoles")
    public List<String> listaRoles() {
        List<String> roles = new ArrayList<>();
        roles.add("ROLE_ADMIN");
        roles.add("ROLE_USER");
        roles.add("ROLE_MODERATOR");

        return roles;
    }

    @ModelAttribute("listaRolesMap")
    public Map<String, String> listaRolesMap() {
        Map<String, String> roles = new HashMap<>();
        roles.put("ROLE_ADMIN", "Administrador");
        roles.put("ROLE_USER", "Usuario");
        roles.put("ROLE_MODERATOR", "Moderador");
        return roles;
    }


    @ModelAttribute("listaPaises")
    public List<Pais> listaPaises() {
        return paisService.listaPaises();
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(userValidation);

        binder.registerCustomEditor(String.class, "lastname", new EditarStringMayuscula());
        binder.registerCustomEditor(Pais.class, "pais", paisEditor);

    }


    @GetMapping("/form")
    public String form(User user, Model model) {
        model.addAttribute("title", "User Form");
        model.addAttribute("user", user);
        return "form";
    }

    @PostMapping("/form")
    public String process(@Valid User user, BindingResult result, Model model) {
        model.addAttribute("title", "User Data");
        if (result.hasErrors()) return "form";
        model.addAttribute("user", user);
        return "data";
    }

}
