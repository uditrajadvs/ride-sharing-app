package org.udevs.LLDProject.ridesharingapp.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.udevs.LLDProject.ridesharingapp.entity.Location;
import org.udevs.LLDProject.ridesharingapp.model.Bike;
import org.udevs.LLDProject.ridesharingapp.model.Car;
import org.udevs.LLDProject.ridesharingapp.model.Driver;
import org.udevs.LLDProject.ridesharingapp.model.Passenger;
import org.udevs.LLDProject.ridesharingapp.strategy.LuxuryFareStrategy;
import org.udevs.LLDProject.ridesharingapp.strategy.ShareFareStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RideMatchingServiceTest {

    private RideMatchingService rideMatchingService;

    private Driver nearestDriver;
    private Driver farDriver;
    private Passenger passenger;

    @BeforeEach
    void setUp() {

        rideMatchingService = new RideMatchingService();

        nearestDriver = new Driver("John", "john@test.com",
                new Location(12.0, 77.0), new Bike("KA01AB1234"));

        farDriver = new Driver("Mike", "mike@test.com",
                new Location(50.0, 50.0), new Car("KA02AB1234"));

        passenger = new Passenger("Alice", "alice@test.com", new Location(13.0, 78.0));
    }

    @Test
    void addDriverToSystemTest() {

        rideMatchingService.addDriverToSystem(nearestDriver);

        assertEquals(1, rideMatchingService.availableDrivers.size());
    }

    @Test
    void makeAvailableAfterRideCompletionTest() {

        rideMatchingService.addDriverToSystem(nearestDriver);
        rideMatchingService.addDriverToSystem(farDriver);

        rideMatchingService.requestRide(passenger, 10.0, new LuxuryFareStrategy());

        assertEquals(2, rideMatchingService.availableDrivers.size());
    }

    @Test
    void assignDriverForSharedRideAndMakeAvailableAgain() {

        rideMatchingService.addDriverToSystem(nearestDriver);

        rideMatchingService.requestRide(passenger, 10.0, new ShareFareStrategy());

        assertEquals(1, rideMatchingService.availableDrivers.size());
    }
}