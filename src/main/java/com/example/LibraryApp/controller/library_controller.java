package com.example.LibraryApp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class library_controller {

    @PostMapping("/")
    public String home(){
        return  "welcome to home page of library app";
    }

    @PostMapping("/add")
    public String add (){
        return "add library detiles";
    }

}
