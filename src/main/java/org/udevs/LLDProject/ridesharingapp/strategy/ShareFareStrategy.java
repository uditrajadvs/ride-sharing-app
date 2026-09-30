package org.udevs.LLDProject.ridesharingapp.strategy;

import org.udevs.LLDProject.ridesharingapp.model.Vehicle;

public class ShareFareStrategy implements FareStrategy {
    @Override
    public double calFareByStrategy(Vehicle vehicle, double distance) {
        return Math.abs(vehicle.getFarePerKM()*distance*(0.5));
    }
}
