package com.c4c.todoApp.dao;

import com.c4c.todoApp.entity.Instructor;
import com.c4c.todoApp.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);
}
