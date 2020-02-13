package com.example.springbasicapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {
    @GetMapping("/")
        public String home() {
         return("<h1>hello World<h1>");
    }

    @GetMapping("user")
    public String user() {
        return("<h1>hello user<h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return("<h1> hello admin<h1>");
    }
}
