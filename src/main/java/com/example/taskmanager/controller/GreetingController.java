package com.example.taskmanager.controller;

import com.example.taskmanager.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/api/v1/greeting")
    public String greet(@RequestParam(defaultValue = "Developer") String name) {
        return greetingService.greet(name);
    }
}
