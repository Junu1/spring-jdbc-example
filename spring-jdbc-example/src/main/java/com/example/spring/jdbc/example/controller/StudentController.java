package com.example.spring.jdbc.example.controller;

import com.example.spring.jdbc.example.model.Student;
import com.example.spring.jdbc.example.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        return ResponseEntity.ok(studentService.getStudent(id));

    }
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        studentService.saveStudent(student.getName());
        studentService.saveStudent(student.getAddress());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
