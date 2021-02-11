package com.asde.junit;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class FlightWithPassengersTest {
    private Flight flight = new Flight("JM1995", 1);

    @Test
    void testAddRemovePassenger() throws IOException {
        Passenger passenger = new Passenger("12-34-56", "John Smith",
                "US");

        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengersSize());
        assertEquals(flight, passenger.getFlight());

        assertTrue(flight.removePassenger(passenger));
        assertEquals(0, flight.getPassengersSize());
    }

    @Test
    void testNumberOfSeats() {
        Passenger passenger = new Passenger("12-34-56", "John Smith",
                "US");
        assertTrue(flight.addPassenger(passenger));
        assertEquals(1, flight.getPassengersSize());

        assertThrows(RuntimeException.class,
                () -> flight.addPassenger(new Passenger("123-456",
                        "Michale Jonson", "GB")));
    } // end case

} // end class test
