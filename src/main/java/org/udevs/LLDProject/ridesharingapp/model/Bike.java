package org.udevs.LLDProject.ridesharingapp.model;

public class Bike extends Vehicle {
    public Bike(String numberPalte) {
        super(numberPalte);
    }

    @Override
    public double getFarePerKM() {
        return 20;
    }
    
}
