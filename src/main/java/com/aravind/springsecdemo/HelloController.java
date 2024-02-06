package com.aravind.springsecdemo;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;





@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest request) {
        return "Hello World" + request.getSession().getId();
    }
    
    @GetMapping("about")
    public String getMethodName(HttpServletRequest request) {
        return "Aravind Here" + request.getSession().getId();
    }
    

    
}
