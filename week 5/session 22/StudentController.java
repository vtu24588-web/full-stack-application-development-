package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        repository.save(student);
        return "Student Saved Successfully!";
    }

    @GetMapping("/all")
    public Object getAllStudents() {
        return repository.findAll();
    }
}
