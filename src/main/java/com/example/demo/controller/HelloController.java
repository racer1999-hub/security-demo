package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/greet")
    public String greet(HttpServletRequest request){

        return "Hello Shivam! Welcome to Spring Security: "+ request.getSession().getId();
    }
}
