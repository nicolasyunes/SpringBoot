package com.informatorio.emplmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @GetMapping ("/")
    public String hello(){
        return "hola mundo";
    }
}
