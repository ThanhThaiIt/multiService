package com.example.multiservice.validator.constraints;

import java.lang.annotation.*;

import jakarta.validation.Constraint;

import com.example.multiservice.validator.DobValidator;
import com.nimbusds.jose.Payload;

@Target({
    ElementType.METHOD,
    ElementType.FIELD,
    ElementType.ANNOTATION_TYPE,
    ElementType.CONSTRUCTOR,
    ElementType.PARAMETER,
    ElementType.TYPE_USE
}) // location apply Annotation
@Retention(RetentionPolicy.RUNTIME) // when
@Constraint(validatedBy = {DobValidator.class})
public @interface DobConstraints {
    String message() default "Invalid date of birth";

    int min();

    int max();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
