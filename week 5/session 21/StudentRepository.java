package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insertStudent(Student student) {
        String sql = "INSERT INTO student VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                student.getId(),
                student.getName(),
                student.getEmail(),
                student.getDepartment());
    }
}
