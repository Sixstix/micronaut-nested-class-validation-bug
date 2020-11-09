package com.example;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import javax.validation.Valid;

@Controller("/test")
public class TestController {

    @Post
    public void testNestedClassValidation(@Valid @Body SomeDto someDto) {}

}
