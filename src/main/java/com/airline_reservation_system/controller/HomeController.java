package com.airline_reservation_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Home Page
    @GetMapping("/")
    public String home() {
        return "index";   // Loads index.html
    }

    // Flight Search Page
    @GetMapping("/search")
    public String searchPage() {
        return "search";  // Loads search.html
    }

    // Booking Page
    @GetMapping("/booking")
    public String bookingPage() {
        return "booking";         // Loads booking.html
    }

    // Booking Success Page
    @GetMapping("/booking/success")
    public String bookingSuccessPage() {
        return "booking-success"; // Loads booking-success.html
    }

    // Admin Dashboard Page
    @GetMapping("/admin")
    public String adminPage() {
        return "admin-dashboard"; // Loads admin-dashboard.html
    }

    // Login Page
    @GetMapping("/login")
    public String loginPage() {
        return "login";           // Loads login.html
    }

    // Logout Redirect (Optional)
    @GetMapping("/logout-success")
    public String logoutSuccess() {
        return "logout-success";  // Create this if needed
    }
}
