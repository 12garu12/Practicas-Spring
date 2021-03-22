package com.spring.spring_clasevalidacion_initbinder.app.domain.models;


import com.spring.spring_clasevalidacion_initbinder.app.validation.RoleValidation;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class User {

    private String name;

    private String lastname;

    @NotNull(message = "El campo País no debe estar vacío")
    private Pais pais;

    @RoleValidation
    private List<String> roles;

    /***************************************************************************************************************/

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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
