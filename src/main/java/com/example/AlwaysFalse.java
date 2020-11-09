package com.example;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Constraint(validatedBy = { })
public @interface AlwaysFalse {

    String message() default "always false";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * Defines several constraints on the same element.
     */
    @Target(TYPE)
    @Retention(RUNTIME)
    @Documented
    @interface List {
        AlwaysFalse[] value();
    }
}
