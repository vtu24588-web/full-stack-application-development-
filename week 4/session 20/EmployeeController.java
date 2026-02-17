package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/employee")
    public String getEmployee(Model model) {

        model.addAttribute("id", 101);
        model.addAttribute("name", "Vamsi Tarun");
        model.addAttribute("department", "AI & ML");
        model.addAttribute("salary", 50000);

        return "employee";   // refers to employee.jsp
    }
}
