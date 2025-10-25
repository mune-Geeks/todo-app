package com.c4c.todoApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class FunRestController {

    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose "/" that returns "Hello World"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team: " + teamName;
    }
    


    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
    
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "ホームランを打て";
    }
    
    @GetMapping("/baseball")
    public String getBaseball() {
        return "ヒットを打て";
    }
}
