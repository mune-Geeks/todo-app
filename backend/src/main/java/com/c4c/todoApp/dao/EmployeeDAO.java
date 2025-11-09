package com.c4c.todoApp.dao;

import java.util.List;

import com.c4c.todoApp.entity.Employee;

public interface EmployeeDAO {

    List<Employee> findAll();
    
}
