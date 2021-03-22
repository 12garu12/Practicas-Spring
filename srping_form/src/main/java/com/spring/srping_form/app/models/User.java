package com.spring.srping_form.app.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

public class User {

    @NotBlank(message = "Por favor rellene el campo First name")
    private String firstname;

    @NotEmpty
    private String password;

    @NotEmpty
    private List<Role> roles;




    /*   GETTERS AND SETTERS -------------------------------------------------------------------------------------------*/

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
