package com.c4c.todoApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.todoApp.entity.Employee;
import com.c4c.todoApp.service.EmployeeService;


@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    // quick and dirty: inject employee dao directly into controller
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
         this.employeeService = theEmployeeService;
    }

    // expose "/employees" and return list of employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}
