package com.spring.springdemo.app.validation;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DataValidationValidator implements ConstraintValidator<DataValidation, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null || !StringUtils.hasText(s)) return false;
        return true;
    }
}
