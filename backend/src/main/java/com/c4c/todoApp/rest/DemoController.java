package com.c4c.todoApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.todoApp.common.Coach;



@RestController
public class DemoController {

    // define a private field for the Coach
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(
        @Qualifier("cricketCoach") Coach theCoach,
        @Qualifier("cricketCoach") Coach theAnotherCoach) {
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    // expose a "/" endpoint
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


    @GetMapping("/check")
    public String chek() {
        return "compare the two coach beans: " + (myCoach == anotherCoach);
    }
    
}
