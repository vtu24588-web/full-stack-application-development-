package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String email;

    private String department;

    private int age;

    public Student() {}

    public Student(String name, String email, String department, int age) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.age = age;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
