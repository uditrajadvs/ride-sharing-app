package org.udevs.LLDProject.ridesharingapp.entity;

import org.udevs.LLDProject.ridesharingapp.model.Driver;
import org.udevs.LLDProject.ridesharingapp.model.Passenger;
import org.udevs.LLDProject.ridesharingapp.strategy.FareStrategy;

//enum RideStatus{
//    SCHEDULED, ONGOING, COMPLETED;
//}
public class Ride {
    private Passenger passenger;
    private Driver driver;

    private RideStatus rideStatus;
    private double fare;
    private double distance;
    private FareStrategy fareStrategy;

    public Ride(Passenger passenger, Driver driver, double distance, FareStrategy fareStrategy) {
        this.passenger = passenger;
        this.driver = driver;
        this.distance = distance;
        this.fareStrategy = fareStrategy;
        this.rideStatus = RideStatus.SCHEDULED;
        this.fare = fareStrategy.calFareByStrategy(driver.getVehicle(), distance);
    }

//    public void calfare(){
//        this.fare = fareStartegy.calculateFare(driver.getVehicle(), distance);
//    }

    public void updateRideStatus(RideStatus status){
        this.rideStatus=status;
        //Observer Pattern
        userNotify(rideStatus);
    }
    public void userNotify(RideStatus status){
        if(status == RideStatus.COMPLETED){
            passenger.notify(
                    "Ride Completed ✅\n" +
                            "Dear " + passenger.getName() +
                            ", your destination has been reached successfully. " +
                            "Thank you for riding with us. Have a great day!"
            );
            driver.notify(
                    "Ride Completed ✅\n" +
                            "Dear " + driver.getName() +
                            ", you have successfully completed the trip. " +
                            "Thank you for your service and professionalism."
            );
        }else{
            passenger.notify(passenger.getName() + ", Your ride status is : " + rideStatus);
            driver.notify(driver.getName() +", Your ride status is : " + rideStatus);
        }
    }

    public double getFare(){
        return fare;
    }
}
