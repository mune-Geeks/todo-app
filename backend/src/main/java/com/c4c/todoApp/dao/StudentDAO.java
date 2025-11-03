package com.c4c.todoApp.dao;

import com.c4c.todoApp.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    void update(Student theStudent);
}
