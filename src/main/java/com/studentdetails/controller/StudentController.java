package com.studentdetails.controller;

import com.studentdetails.model.Student;
import com.studentdetails.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> get() { return service.getAll(); }

    @PostMapping
    public Student add(@RequestBody Student s) { return service.save(s); }
}