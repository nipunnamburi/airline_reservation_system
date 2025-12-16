package com.airline_reservation_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airline_reservation_system.model.User;

public interface UserRepository extends JpaRepository<User, String> { }
