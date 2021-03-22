package com.spring.spring_demo_project.appp.domain.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Country {


    private Integer id;

    @NotEmpty
    private String codigo;

    private String name;


    public Country(Integer id, String codigo, String name) {
        this.id = id;
        this.codigo = codigo;
        this.name = name;
    }

    public Country() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
