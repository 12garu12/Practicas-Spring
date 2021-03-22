package com.empresa.practica.springcreandoanotacionvalidar.app.model;


import com.empresa.practica.springcreandoanotacionvalidar.app.validation.ValidarCampo;

import javax.validation.constraints.NotBlank;

public class Cliente {

    @ValidarCampo()
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
