package com.spring.spring_clasevalidacion_initbinder.app.validation;

import com.spring.spring_clasevalidacion_initbinder.app.domain.models.User;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


@Component
public class UserValidation implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "validacion.user.name");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastname", "validacion.user.lastname");

    }
}
