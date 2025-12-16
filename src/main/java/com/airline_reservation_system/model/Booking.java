package com.airline_reservation_system.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;
    private int passengerAge;
    private String gender;
    private String idProof;
    private int seats;
    private double totalPrice;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;
}
