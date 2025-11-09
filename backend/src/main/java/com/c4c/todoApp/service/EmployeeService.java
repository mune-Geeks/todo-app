package com.c4c.todoApp.service;

import java.util.List;

import com.c4c.todoApp.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
