package com.test.spring_validacion_anotaciones.app.validation;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AnotacionValidation implements ConstraintValidator<StringValidation, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null || !StringUtils.hasText(value)) return false;
        return true;
    }
}
