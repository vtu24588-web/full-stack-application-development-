package com.example.demo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    // CREATE
    @PostMapping("/bulk")
    public List<Student> createMultipleStudents(@RequestBody List<Student> students) {
        return repository.saveAll(students);
    }

    // READ ALL
    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return repository.findById(id).orElse(null);
    }

    // FILTER BY DEPARTMENT
    @GetMapping("/department/{dept}")
    public List<Student> getByDepartment(@PathVariable String dept) {
        return repository.findByDepartment(dept);
    }

    // FILTER BY AGE
    @GetMapping("/age/{age}")
    public List<Student> getByAge(@PathVariable int age) {
        return repository.findByAge(age);
    }

    // FILTER AGE GREATER
    @GetMapping("/age/greater/{age}")
    public List<Student> getByAgeGreater(@PathVariable int age) {
        return repository.findByAgeGreaterThan(age);
    }

    // FILTER DEPARTMENT + AGE
    @GetMapping("/filter/{dept}/{age}")
    public List<Student> getByDeptAndAge(
            @PathVariable String dept,
            @PathVariable int age) {
        return repository.findByDepartmentAndAge(dept, age);    
    }
    @GetMapping("/page")
    public Page<Student> getStudentsByPage(
            @RequestParam int page,
            @RequestParam int size) {

        Pageable pageable = PageRequest.of(page, size);
        return repository.findAll(pageable);
    }
    @GetMapping("/sort")
    public List<Student> sortStudents(
            @RequestParam String field) {

        return repository.findAll(Sort.by(Sort.Direction.ASC, field));
    }
    @GetMapping("/page-sort")
    public Page<Student> getStudentsWithPaginationAndSorting(
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String field) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(field));
        return repository.findAll(pageable);
    }


}
