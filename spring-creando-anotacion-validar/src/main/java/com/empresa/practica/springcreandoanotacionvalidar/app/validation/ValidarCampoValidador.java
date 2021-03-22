package com.empresa.practica.springcreandoanotacionvalidar.app.validation;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidarCampoValidador implements ConstraintValidator<ValidarCampo, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null || !StringUtils.hasText(value)) {
            return false;
        }
        return true;
    }
}
