package com.example.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;

@Controller
public class UsersController {
    @Autowired
    private DataSource dataSource;

    @GetMapping("/showInfo")
     public String showInfo(){
        return "ok";
    }
}
