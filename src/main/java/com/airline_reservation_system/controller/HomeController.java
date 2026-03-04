package com.airline_reservation_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Home Page
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Flight Search Page
    @GetMapping("/search")
    public String searchPage() {
        return "search";
    }

    // Booking Page
    @GetMapping("/booking")
    public String bookingPage() {
        return "booking";
    }

    // Booking Success Page
    @GetMapping("/booking/success")
    public String bookingSuccessPage() {
        return "booking-success";
    }

    // Admin Dashboard Page
    @GetMapping("/admin")
    public String adminPage() {
        return "admin-dashboard";
    }

    // Login Page
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    // Logout Redirect
    @GetMapping("/logout-success")
    public String logoutSuccess() {
        return "logout-success";
    }
}