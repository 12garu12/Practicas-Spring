package com.spring.spring_clase_validacionyformato_de_fecha.app.controllers;


import com.spring.spring_clase_validacionyformato_de_fecha.app.domain.model.Customer;
import com.spring.spring_clase_validacionyformato_de_fecha.app.validation.CustomerValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.core.convert.support.ConvertingPropertyEditorAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class FormController {

    @Autowired
    private CustomerValidation validation;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(validation);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, "birthday", new CustomDateEditor(dateFormat, true));
    }

    @GetMapping("/form")
    public String form(Customer customer, Model model) {
        model.addAttribute("title", "Customer Form");
        model.addAttribute("customer", customer);
        return "form";
    }

    @PostMapping("/form")
    public String process(@Valid Customer customer, BindingResult result, Model model) {
        model.addAttribute("title", "Customer Data");
        if (result.hasErrors()) return "form";
        model.addAttribute("customer", customer);
        return "data";
    }


}
