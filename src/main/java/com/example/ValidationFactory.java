package com.example;

import io.micronaut.validation.validator.constraints.ConstraintValidator;

import javax.inject.Singleton;

public class ValidationFactory {
    @Singleton
    ConstraintValidator<AlwaysFalse, Object> alwaysFalseValidator() {
        return (value, annotationMetadata, context) -> false;
    }
}
