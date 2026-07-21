package com.edusphere.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/modules")
public class ModuleController {

    @GetMapping
    public List<Map<String, String>> modules() {
        return List.of(
            Map.of("name", "Admin", "description", "Manage teachers, students, classes, fees and reports"),
            Map.of("name", "Teacher", "description", "Mark attendance, upload homework and assignments"),
            Map.of("name", "Student", "description", "View attendance, results, fees and timetable"),
            Map.of("name", "Parent", "description", "Monitor child progress and payments")
        );
    }
}
