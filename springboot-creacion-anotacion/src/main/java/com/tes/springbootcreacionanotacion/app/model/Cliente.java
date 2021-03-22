package com.tes.springbootcreacionanotacion.app.model;

import com.tes.springbootcreacionanotacion.app.validation.ValideCampo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Cliente {

    @ValideCampo
    private String name;

    @ValideCampo
    private String lastname;

    @ValideCampo
    @Email
    private String email;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
