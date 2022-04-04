package com.example.spring.jdbc.example.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private int id;
    private String name;
    private String address;

    public Student(int id) {
        this.id = id;
    }
}
