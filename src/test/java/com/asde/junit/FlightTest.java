package com.asde.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {

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