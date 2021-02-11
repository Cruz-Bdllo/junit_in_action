package com.asde.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Test
    void testPassengerCreation() {
        Passenger passenger = new Passenger("123-456-789", "John Smith", "US");
        assertNotNull(passenger);
    } // end case

    @Test
    void testInvalidCountryCode() {
        assertThrows(RuntimeException.class, () ->
                new Passenger("123-456-789", "John Smith", "ASD"));
    } // end case

} // end class test