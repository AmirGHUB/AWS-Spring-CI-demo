package com.aws.awsspringcidemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public String greetUser() {
        return "Hello user";
    }

    @GetMapping("/greet/{username}")
    public String greetuserByName(@PathVariable("username") String username) {
        if (!username.isBlank()) {
            return "Hello " + username;
        } else {
            return "Invalid name entered.";
        }
    }
}
