package com.example.javamireaprac14.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class baseController {

    @GetMapping("/home")
    public String home() {
        return "home.html";
    }
}
