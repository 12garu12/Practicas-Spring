package com.mipractica.pruebaspringform.app.model;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class Usuario {

    @NotEmpty(message = "El campo First name no debe estar vacío.")
    private String firstname;

    @NotEmpty(message = "El campo Last name no debe estar vacío.")
    private String lastname;

    @NotEmpty
    @Email(message = "El campo Email no tiene el formato correcto")
    private String email;

    @NotEmpty(message = "El campo Pasword no debe estar vacío.")
    private String password;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
