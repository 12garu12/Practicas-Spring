package com.spring.spring_clase_validacionyformato_de_fecha.app.validation;

import com.spring.spring_clase_validacionyformato_de_fecha.app.domain.model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class CustomerValidation implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Customer.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname", "Validation.customer.firstname");
        ValidationUtils.rejectIfEmpty(errors, "password", "Validation.customer.password");
    }
}
