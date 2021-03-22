package com.srping.springcustompropertieditorvalidacion.app.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class User {

    @NotBlank(message = "El Campo Nombre no debe ir vacío")
    private String firsname;

    @NotNull(message = "El Campo # Targeta de Credito no debe ir vacío")
    private CreditCard creditCard;

//    Getters and Setters -------------------------------------------------------------------------------------------------------

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
