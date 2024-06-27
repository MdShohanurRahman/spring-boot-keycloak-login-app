package com.example.login_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/")
    public String ping() {
        return "Hello World!";
    }

    @GetMapping("/customers")
    public Map<String, String> getDetails() {
        return Map.of("key1", "value1");
    }
}
