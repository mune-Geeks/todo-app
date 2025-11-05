package com.c4c.todoApp.dao;

import java.util.List;

import com.c4c.todoApp.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    void delete(Integer id);

    List<Student> findAll();
}
