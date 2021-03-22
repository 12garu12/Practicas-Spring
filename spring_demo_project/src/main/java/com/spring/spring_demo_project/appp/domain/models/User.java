package com.spring.spring_demo_project.appp.domain.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;

public class User {

    @NotBlank
    private String firstname;

    @NotEmpty
    private String password;

    @NotBlank
    @Email
    private String email;

    @NotNull
    @Min(value = 18)
    @Max(value = 45)
    private Integer age;

    @NotNull(message = "El campo Birthday no debe ser nulo.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @Valid
    private Country country;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}
