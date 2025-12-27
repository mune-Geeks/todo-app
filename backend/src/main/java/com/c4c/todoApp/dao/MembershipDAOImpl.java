package com.c4c.todoApp.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {

    @Override
    public void addAccount() {
        IO.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

}
