package com.spring.spring_clasevalidacion_initbinder.app.validation;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class RoleValiationValidacion implements ConstraintValidator<RoleValidation, List<String>> {

    @Override
    public boolean isValid(List<String> roles, ConstraintValidatorContext constraintValidatorContext) {
        if (roles == null || roles.size() == 0) return false;
        return true;
    }
}
