package com.c4c.todoApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.todoApp.common.Coach;


@RestController
public class DemoController {

    // define a private field for the Coach
    private Coach myCoach;

    // define a constructor for dependency injection
    // @Autowired
    // public DemoController(Coach theCoach) {
    //     myCoach = theCoach;
    // }

    // @Autowired
    // public void setCoach(Coach theCoach) {
    //     myCoach = theCoach;
    // }

    @Autowired
    public void doSomeStuff(Coach theCoach) {
        myCoach = theCoach;
    }

    // expose a "/" endpoint
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
