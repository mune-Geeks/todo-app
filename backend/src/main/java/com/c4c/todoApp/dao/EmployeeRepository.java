package com.c4c.todoApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.c4c.todoApp.entity.Employee;

// @RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code !!!
    
}
