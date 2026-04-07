package com.example.experiment_7.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/profile")
    public String profile() {
        return "Welcome, authenticated user";
    }
}