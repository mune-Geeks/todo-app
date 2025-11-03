package com.c4c.todoApp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.TypeCode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.todoApp.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class StudentDAOImpl implements StudentDAO {

    // define field for entitymanager
    private EntityManager entityManager;

    // Inject entitymanager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        // implementation code here
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);

        // return the results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery(
            "FROM Student WHERE lastName=:theData", Student.class);
            
        // set parameters
        theQuery.setParameter("theData", lastName);

        // return the results
        return theQuery.getResultList();
    }

}
