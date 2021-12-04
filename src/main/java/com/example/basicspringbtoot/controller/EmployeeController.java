package com.example.basicspringbtoot.controller;

import org.springframework.web.bind.annotation.*;
@RestController
public class EmployeeController {

    @GetMapping("/test")
    public String getEmployee() throws Exception {
        return "Initial Azure message ";
    }
}
