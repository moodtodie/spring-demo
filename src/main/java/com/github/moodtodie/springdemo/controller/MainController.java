package com.github.moodtodie.springdemo.controller;

import com.github.moodtodie.springdemo.entity.Student;
import com.github.moodtodie.springdemo.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private StorageService storageService;

    @GetMapping("/")
    public String main() {
        return "Hello, guest";
    }

    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        return "Hello, " + name;
    }

    @PostMapping("/add")
    public String addNewStudent(@RequestBody Student student) {
        return storageService.add(student) ? "New student has been added." : "Student ID already exists";
    }

    @GetMapping("/storage")
    public List<Student> storage() {
        return storageService.getStorage();
    }

}
