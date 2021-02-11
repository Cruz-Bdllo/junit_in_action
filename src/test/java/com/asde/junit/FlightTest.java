package com.asde.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {

    @Test
    void testPassengerJoinsFlight() {
        Passenger passenger = new Passenger("123-456-789",
                "John Smith", "US");
        Flight flight = new Flight("JM1995", 1);
        passenger.joinsFlight(flight);

        assertEquals(flight, passenger.getFlight());
        assertEquals(1, flight.getPassengersSize());
    } // end case

    @Test
    void testFlightCreation() {
        Flight flight = new Flight("JM1995", 20);
        assertNotNull(flight);
    } // end case

    @Test
    void testInvalidFlightNumber() {
        assertThrows(RuntimeException.class, () ->
                new Flight("e3ss12", 20));
    } // end case

} // end class test