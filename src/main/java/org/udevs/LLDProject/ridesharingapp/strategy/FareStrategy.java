package org.udevs.LLDProject.ridesharingapp.strategy;

import org.udevs.LLDProject.ridesharingapp.model.Vehicle;

public interface FareStrategy {

    double calFareByStrategy(Vehicle vehicle, double distance);
}
