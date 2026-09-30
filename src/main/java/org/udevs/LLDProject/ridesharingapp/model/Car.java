package org.udevs.LLDProject.ridesharingapp.model;

public class Car extends Vehicle {
    public Car(String numberPalte) {
        super(numberPalte);
    }

    @Override
    public double getFarePerKM() {
        return 25;
    }
}
