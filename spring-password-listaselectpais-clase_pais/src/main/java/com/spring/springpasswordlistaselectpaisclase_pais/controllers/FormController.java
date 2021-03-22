package com.spring.springpasswordlistaselectpaisclase_pais.controllers;


import com.spring.springpasswordlistaselectpaisclase_pais.model.Pais;
import com.spring.springpasswordlistaselectpaisclase_pais.model.User;
import com.spring.springpasswordlistaselectpaisclase_pais.services.IPaisService;
import com.spring.springpasswordlistaselectpaisclase_pais.validation.FormValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

@Controller
public class FormController {

    @Autowired
    private FormValidation formValidation;

    @Autowired
    private IPaisService paisService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(formValidation);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }


    @GetMapping("/form")
    public String form(User user, Model model) {
        model.addAttribute("title", "User form");
        model.addAttribute("user", user);
        return "form";
    }

    @PostMapping("/form")
    public String process(@Valid User user, BindingResult result, Model model) {
        model.addAttribute("title", "User data");
        if (result.hasErrors()) return "form";
        model.addAttribute("user", user);
        return "data";
    }

    @ModelAttribute("listPaises")
    public List<Pais> listPaises() {
        return paisService.listarTodos();
    }

}
