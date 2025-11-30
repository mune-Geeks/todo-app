package com.c4c.todoApp.dao;

import com.c4c.todoApp.entity.Instructor;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);
}
