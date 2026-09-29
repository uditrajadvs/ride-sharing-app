package org.udevs.LLDProject.ridesharingapp;

public interface FareStartegy {

    double calculateFare(Vehicle vehicle, double distance);
}

class StandardFareStrategy implements FareStartegy{

    @Override
    public double calculateFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKM()*distance*(1);
    }
}

class ShareFareStartegy implements FareStartegy{

    @Override
    public double calculateFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKM()*distance*(0.5);
    }
}

class LuxuryFareStrategy implements FareStartegy{

    @Override
    public double calculateFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKM()*distance*(1.5);
    }
}
