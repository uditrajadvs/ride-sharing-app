package org.udevs.LLDProject.ridesharingapp.strategy;

import org.junit.jupiter.api.Test;
import org.udevs.LLDProject.ridesharingapp.model.Bike;
import org.udevs.LLDProject.ridesharingapp.model.Car;
import org.udevs.LLDProject.ridesharingapp.model.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StandardFareStrategyTest {

    private final FareStrategy fareStrategy =
            new StandardFareStrategy();

    @Test
    void shouldCalculateBikeFare() {
        Vehicle bike = new Bike("KA01AB1234");

        double fare = fareStrategy.calFareByStrategy(bike, 10.0);

        assertEquals(200.0, fare);
    }

    @Test
    void shouldCalculateCarFare() {
        Vehicle car = new Car("KA01AB1234");

        double fare = fareStrategy.calFareByStrategy(car, 10.0);

        assertEquals(250.0, fare);
    }

    @Test
    void shouldReturnZeroFareWhenDistanceIsZero() {
        Vehicle bike = new Bike("KA01AB1234");

        double fare = fareStrategy.calFareByStrategy(bike, 0.0);

        assertEquals(0.0, fare);
    }

    @Test
    void shouldReturnPositiveFare() {
        Vehicle bike = new Bike("KA01AB1234");

        double fare = fareStrategy.calFareByStrategy(bike, -5.0);

        assertTrue(fare > 0);
    }
}