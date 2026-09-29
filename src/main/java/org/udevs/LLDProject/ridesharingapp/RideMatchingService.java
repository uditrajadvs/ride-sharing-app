package org.udevs.LLDProject.ridesharingapp;

import java.util.ArrayList;
import java.util.List;

public class RideMatchingService {
    List<Driver> availableDrivers = new ArrayList<>();
    public void addDriverToSystem(Driver driver){
        availableDrivers.add(driver);
    }

    public void requestRide(Passenger passenger, Double distanceTravel, FareStartegy fareStartegy){
        if(availableDrivers.isEmpty()){
            passenger.notify("Drivers are not available");
            return;
        }
        //find nearest dirver
        Driver nearDriver = findNearestDriver(passenger.location);
        availableDrivers.remove(nearDriver);

        // passenger.notify("Ride schedule successfully" + nearestDriver);
        Ride ride = new Ride(passenger, nearDriver, distanceTravel, fareStartegy);

        passenger.notify("Ride schedued with fare + Rs" + ride.getFare());
        nearDriver.notify("You have a new ride request for " + ride.getFare());


        //Make a Time Delay and Change the Status of the Ride.
        ride.updateRideStatus(RideStatus.ONGOING);
        try {
            System.out.println("Ride is in progress...");
            Thread.sleep(5000); // 5 seconds delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Ride interrupted!");
        }

        //Make a time delay and Change the Status of the Ride as well driver become available.
        ride.updateRideStatus(RideStatus.COMPLETED);
        availableDrivers.add(nearDriver);


    }

    private Driver findNearestDriver(Location location){
        Driver assignedDriver = null;
        Double minDistace = Double.MAX_VALUE;
        for(Driver driver : availableDrivers){
            if(driver.location.calDist(location)<minDistace){
                minDistace=driver.location.calDist(location);
                assignedDriver = driver;
            }
        }
        return assignedDriver;
    }
}
