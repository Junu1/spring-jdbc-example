package com.example.spring.jdbc.example.repository.impl;

import com.example.spring.jdbc.example.model.Student;
import com.example.spring.jdbc.example.repository.StudentRepository;
import com.example.spring.jdbc.example.repository.rowmapper.StudentRowMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Student findById(int id) {
        String sql = "SELECT id,name FROM student where id=?";
        List<Student> students = jdbcTemplate.query(sql, new StudentRowMapper(), id);
        return students.get(0);
    }

    @Override
    public boolean save(String name) {
        String sql = "INSERT INTO student(name) VALUES(?)";
        int inserted = jdbcTemplate.update(sql, name);
        log.info("inserted:" + inserted);
        if (inserted > 0) {
            return true;
        } else {
            return false;
        }
    }
}
