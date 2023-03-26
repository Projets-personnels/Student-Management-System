package com.anurag.springboot.services;

import com.anurag.springboot.entities.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student saveStudent(Student student);
}
