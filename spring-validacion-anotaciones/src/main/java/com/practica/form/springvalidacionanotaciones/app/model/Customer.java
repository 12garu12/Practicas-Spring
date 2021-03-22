package com.practica.form.springvalidacionanotaciones.app.model;

import javax.validation.constraints.NotBlank;

public class Customer {

    @NotBlank
    private String name;

    @NotBlank
    private String lastname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
