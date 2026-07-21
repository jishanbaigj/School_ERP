package com.edusphere.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @GetMapping("/admin")
    public Map<String, Object> adminDashboard() {
        return Map.of(
            "totalStudents", 320,
            "totalTeachers", 28,
            "attendanceToday", 91.4,
            "feesCollected", 1250000,
            "pendingFees", 240000,
            "upcomingExams", 4
        );
    }

    @GetMapping("/student")
    public Map<String, Object> studentDashboard() {
        return Map.of(
            "attendance", 94,
            "homeworkPending", 2,
            "assignmentsPending", 1,
            "latestResult", "A-",
            "feesStatus", "Pending"
        );
    }
}
