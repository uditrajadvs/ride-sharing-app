package org.udevs.LLDProject.ridesharingapp;

abstract class User {
    protected String name;
    protected String email;
    protected Location location;

    public User(String name, String email, Location location) {
        this.name = name;
        this.email = email;
        this.location = location;
    }

    abstract void notify(String msg);
}
