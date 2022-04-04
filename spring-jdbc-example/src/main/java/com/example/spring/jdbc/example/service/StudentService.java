package com.example.spring.jdbc.example.service;

import com.example.spring.jdbc.example.model.Student;

import java.util.List;

public interface StudentService {
    Student getStudent(int id);

    boolean saveStudent(String name);

}
