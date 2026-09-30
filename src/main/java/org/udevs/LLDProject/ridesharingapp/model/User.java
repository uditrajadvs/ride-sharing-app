package org.udevs.LLDProject.ridesharingapp.model;

import org.udevs.LLDProject.ridesharingapp.entity.Location;

public abstract class User {
    public String getName() {
        return name;
    }

    protected String name;
    protected String email;

    protected Location location;

    public User(String name, String email, Location location) {
        this.name = name;
        this.email = email;
        this.location = location;
    }
    public Location getLocation() {
        return location;
    }

    public abstract void notify(String msg);
}
