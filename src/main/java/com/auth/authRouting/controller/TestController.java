package com.auth.authRouting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth/employees")
public class TestController {

    @GetMapping("/list")
    public List<String> getEmpList(){
        return List.of("Calin","Radu","Alex");
    }
}