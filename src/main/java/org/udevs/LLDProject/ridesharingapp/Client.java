package org.udevs.LLDProject.ridesharingapp;

import org.udevs.LLDProject.ridesharingapp.entity.Location;
import org.udevs.LLDProject.ridesharingapp.model.*;
import org.udevs.LLDProject.ridesharingapp.service.RideMatchingService;
import org.udevs.LLDProject.ridesharingapp.strategy.LuxuryFareStrategy;
import org.udevs.LLDProject.ridesharingapp.strategy.StandardFareStrategy;

public class Client {
    public static void main(String[] args) {
        Location l1 = new Location(22.3455, 50.4345);
        Location l2 = new Location(12.9352, 50.6245);
        Location l3 = new Location(13.0352, 52.6175);
        Location l4 = new Location(15.0352, 51.6175);

        Vehicle bike = new Bike("BH048493");
        Vehicle car1 = new Car("KA018493");
        Vehicle car2 = new Car("BR018493");

        Driver d1 = new Driver("Psk", "psk.d@gmail.com", l1, bike);
        Driver d2 = new Driver("abc", "abc.d@gmail.com", l2, car1);
        Driver d3 = new Driver("Dps", "Dps.d@gmail.com", l3, car2);

        Passenger passenger = new Passenger("UD", "ud.p@gmail.com", l4);

        RideMatchingService rideService = new RideMatchingService();
        rideService.addDriverToSystem(d1);
        rideService.addDriverToSystem(d2);
        rideService.addDriverToSystem(d3);

//        rideService.requestRide(passenger, -20.0, new StandardFareStrategy());
        rideService.requestRide(passenger, 20.0, new LuxuryFareStrategy());
    }
}

