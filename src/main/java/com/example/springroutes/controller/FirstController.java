package com.example.springroutes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String getDefault(){
        return "Default" ;
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Hello !" ;
    }

    @GetMapping("/bonjour")
    public String getBnj(){
        return "Bonjour !" ;
    }




}
