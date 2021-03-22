package com.spring.spring_clasevalidacion_initbinder.app.domain.models;

import javax.validation.constraints.NotNull;

public class Pais {

    private Integer id;

    private String code;
    private String name;

    /*  Constructor  ------------------------------------------------------------------------------------------------------*/
    public Pais() {
    }

    public Pais(Integer id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    /*  Getter and setter -------------------------------------------------------------------------------------------------*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
