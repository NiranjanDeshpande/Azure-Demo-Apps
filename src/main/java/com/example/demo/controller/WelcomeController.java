package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class WelcomeController {
    @GetMapping(value = "/wmsg")
    public String welcomeMsg(@RequestParam("name") String name){
        String str="Welcome " + name + " to Rest Controller Demo App!" ;
        return str;
    }
}
