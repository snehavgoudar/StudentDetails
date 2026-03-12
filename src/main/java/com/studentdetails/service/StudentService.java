package com.studentdetails.service;

import com.studentdetails.model.Student;
import com.studentdetails.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private Studentrepository repository;

    public List<Student> getAll() { return repository.findAll(); }
    public Student save(Student s) { return repository.save(s); }
}