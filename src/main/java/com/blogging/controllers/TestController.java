package com.blogging.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Tag(name = "Test Controller")
public class TestController {

    @GetMapping
    public String sayHello(){
        return "Welcome to Random Blogging :)";
    }

    @GetMapping("welcome")
    public String sayWellcome(){
        return "Welcome to Random Blogging again:)";
    }
}
