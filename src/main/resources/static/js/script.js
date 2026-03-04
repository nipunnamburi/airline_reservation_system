// ===============================
// Airline Reservation JS
// ===============================

// Flight search validation
function validateSearch() {

    const from = document.getElementById("from").value;
    const to = document.getElementById("to").value;
    const date = document.getElementById("date").value;

    if(from === "" || to === "" || date === ""){
        alert("Please fill all search fields.");
        return false;
    }

    if(from === to){
        alert("Departure and destination cannot be the same.");
        return false;
    }

    return true;
}


// Booking form validation
function validateBooking(){

    const name = document.getElementById("passengerName").value;
    const flight = document.getElementById("flightNumber").value;
    const seat = document.getElementById("seatNumber").value;

    if(name === "" || flight === "" || seat === ""){
        alert("Please fill all booking details.");
        return false;
    }

    alert("Booking Successful!");
    return true;
}


// Simple seat preview
function previewSeat(){

    const seat = document.getElementById("seatNumber").value;

    document.getElementById("seatPreview").innerHTML =
        "Selected Seat: <b>" + seat + "</b>";
}


// Login validation
function validateLogin(){

    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    if(username === "" || password === ""){
        alert("Please enter username and password.");
        return false;
    }

    return true;
}