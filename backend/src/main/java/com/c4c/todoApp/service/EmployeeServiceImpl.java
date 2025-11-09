package com.c4c.todoApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c.todoApp.dao.EmployeeDAO;
import com.c4c.todoApp.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {


    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        this.employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        // TODO Auto-generated method stub
        return employeeDAO.findAll();
    }

}
