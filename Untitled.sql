CREATE DATABASE airline_db;

USE airline_db;

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL
);

CREATE TABLE flights (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    flight_number VARCHAR(20) UNIQUE NOT NULL,
    origin VARCHAR(50) NOT NULL,
    destination VARCHAR(50) NOT NULL,
    travel_date DATE NOT NULL,
    total_seats INT NOT NULL,
    available_seats INT NOT NULL,
    price DOUBLE NOT NULL
);

CREATE TABLE bookings (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT,
    flight_id BIGINT,
    seats_booked INT NOT NULL,
    booking_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (flight_id) REFERENCES flights(id)
);

INSERT INTO users (username, password, role)
VALUES ('admin', 'admin123', 'ADMIN');

INSERT INTO users (username, password, role)
VALUES ('user1', 'user123', 'USER');

INSERT INTO flights 
(flight_number, origin, destination, travel_date, total_seats, available_seats, price)
VALUES
('AI101', 'DEL', 'BLR', '2025-01-10', 180, 180, 5500),
('AI102', 'BLR', 'MUM', '2025-01-11', 150, 150, 4500),
('AI103', 'DEL', 'HYD', '2025-01-12', 200, 200, 4800);

