package org.udevs.LLDProject.ridesharingapp;

public abstract class Vehicle {

    protected String numberPalte;

    public Vehicle(String numberPalte) {
        this.numberPalte = numberPalte;
    }


    //fare per KM
    public abstract double getFarePerKM();

}
