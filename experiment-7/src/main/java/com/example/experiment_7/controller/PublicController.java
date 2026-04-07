package com.example.experiment_7.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public")
public class PublicController {

    @GetMapping("/hello")
    public String hello() {
        return "This is a public endpoint";
    }
}