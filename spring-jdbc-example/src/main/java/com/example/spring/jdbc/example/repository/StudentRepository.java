package com.example.spring.jdbc.example.repository;

import com.example.spring.jdbc.example.model.Student;

import java.util.List;

public interface StudentRepository {
    Student findById(int id);

    boolean save(String name);
}
