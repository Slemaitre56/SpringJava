package com.mbc.photos.shop.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {
    @PostMapping("/sign-up")
    public String signUp() {
        // à implémenter
        return "OK !";
    }
}
