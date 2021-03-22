package com.test.spring_validacion_anotaciones.app.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(
        validatedBy = {AnotacionValidation.class}
)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StringValidation {

    String message() default "El campo no es valido.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
