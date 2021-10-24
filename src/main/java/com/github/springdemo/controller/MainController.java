package com.github.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String main(){
        return "Hello, guest";
    }

    @GetMapping("/{name}")
    public String hello(@PathVariable String name){
        return "Hello, " + name;
    }

}
