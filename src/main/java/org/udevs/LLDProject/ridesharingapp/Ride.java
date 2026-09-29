package org.udevs.LLDProject.ridesharingapp;

enum RideStatus{
    SCHEDULED, ONGOING, COMPLETED;
}
public class Ride {
    private Passenger passenger;
    private Driver driver;

    private RideStatus rideStatus;
    private double fare;
    private double distance;
    private FareStartegy fareStartegy;

    public Ride(Passenger passenger, Driver driver, double distance, FareStartegy fareStartegy) {
        this.passenger = passenger;
        this.driver = driver;
        this.distance = distance;
        this.fareStartegy = fareStartegy;
        this.rideStatus = RideStatus.SCHEDULED;
        this.fare = fareStartegy.calculateFare(driver.getVehicle(), distance);
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
                            "Dear " + passenger.name +
                            ", your destination has been reached successfully. " +
                            "Thank you for riding with us. Have a great day!"
            );
            driver.notify(
                    "Ride Completed ✅\n" +
                            "Dear " + driver.name +
                            ", you have successfully completed the trip. " +
                            "Thank you for your service and professionalism."
            );
        }else{
            passenger.notify(passenger.name + ", Your ride status is : " + rideStatus);
            driver.notify(driver.name +", Your ride status is : " + rideStatus);
        }
    }

    public double getFare(){
        return fare;
    }
}
