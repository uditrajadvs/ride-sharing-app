package org.udevs.LLDProject.ridesharingapp.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.udevs.LLDProject.ridesharingapp.model.Bike;
import org.udevs.LLDProject.ridesharingapp.model.Driver;
import org.udevs.LLDProject.ridesharingapp.model.Passenger;
import org.udevs.LLDProject.ridesharingapp.model.Vehicle;
import org.udevs.LLDProject.ridesharingapp.strategy.StandardFareStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RideTest {

    private Ride ride;

    @BeforeEach
    void setUp() {

        Location driverLocation = new Location(12.0, 77.0);
        Location passengerLocation = new Location(13.0, 78.0);

        Vehicle bike = new Bike("KA01AB1234");

        Driver driver = new Driver("John", "john@test.com", driverLocation, bike);

        Passenger passenger = new Passenger("Alice", "alice@test.com", passengerLocation);

        ride = new Ride(passenger, driver, 10.0, new StandardFareStrategy());
    }

    @Test
    void createRideWithScheduledStatusTest() {
        assertEquals(RideStatus.SCHEDULED, ride.getRideStatus());
    }

    @Test
    void calculateFareCorrectlyForStandardStrategyTest() {
        assertEquals(200.0, ride.getFare());
    }

    @Test
    void updateRideStatusToOngoingTest() {
        ride.updateRideStatus(RideStatus.ONGOING);
        assertEquals(RideStatus.ONGOING, ride.getRideStatus());
    }

    @Test
    void updateRideStatusToCompletedTest() {
        ride.updateRideStatus(RideStatus.COMPLETED);
        assertEquals(RideStatus.COMPLETED, ride.getRideStatus());
    }
}