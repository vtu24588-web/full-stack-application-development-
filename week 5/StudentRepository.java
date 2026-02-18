package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByDepartment(String department);

    List<Student> findByAge(int age);

    List<Student> findByAgeGreaterThan(int age);

    List<Student> findByDepartmentAndAge(String department, int age);
}
