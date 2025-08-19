package com.example.Actuator_example.controller;

import com.example.Actuator_example.helper.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {
    @Autowired
    private Student student;
    @GetMapping("/get-data")
    public Map<String, String>  getData(){
        return Map.of("Name","Ritik Garg");

    }
}
