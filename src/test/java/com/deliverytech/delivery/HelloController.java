package com.deliverytech.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")  // Path explícito
    public String hello() {
        return "Olá, mundo!";
    }
}