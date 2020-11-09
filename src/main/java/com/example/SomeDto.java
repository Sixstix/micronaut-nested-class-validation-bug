package com.example;

import io.micronaut.core.annotation.Introspected;

import javax.validation.Valid;

@Introspected
public class SomeDto {
    @Valid
    private SomeNestedDto someNestedDto;

    public SomeNestedDto getSomeNestedDto() {
        return someNestedDto;
    }

    public void setSomeNestedDto(SomeNestedDto someNestedDto) {
        this.someNestedDto = someNestedDto;
    }

    @Introspected
    @AlwaysFalse
    public static class SomeNestedDto {}
}
