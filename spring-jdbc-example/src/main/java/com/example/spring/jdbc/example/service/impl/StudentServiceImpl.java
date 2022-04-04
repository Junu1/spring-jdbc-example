package com.example.spring.jdbc.example.service.impl;

import com.example.spring.jdbc.example.model.Student;
import com.example.spring.jdbc.example.repository.StudentRepository;
import com.example.spring.jdbc.example.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getStudent(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public boolean saveStudent(String name) {
        boolean success = studentRepository.save(name);
        return success;
    }
}
