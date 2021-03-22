package com.tes.springbootcreacionanotacion.app.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(
        validatedBy = {Validacion.class}
)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValideCampo {

    String message() default "El campo no debe estar vacío";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
