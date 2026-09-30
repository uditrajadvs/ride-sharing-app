package org.udevs.LLDProject.ridesharingapp.model;

import org.udevs.LLDProject.ridesharingapp.entity.Location;
import org.udevs.LLDProject.ridesharingapp.model.User;

public class Passenger extends User {
    public Passenger(String name, String email, Location location) {
        super(name, email, location);
    }

    @Override
    public void notify(String msg) {
        System.out.println(msg);
    }
}
