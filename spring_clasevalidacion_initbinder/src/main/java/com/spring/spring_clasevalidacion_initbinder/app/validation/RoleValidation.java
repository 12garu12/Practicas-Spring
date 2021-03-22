package com.spring.spring_clasevalidacion_initbinder.app.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(
        validatedBy = {RoleValiationValidacion.class}
)
public @interface RoleValidation {

    String message() default "Por favor escoja los roles de usuario";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
