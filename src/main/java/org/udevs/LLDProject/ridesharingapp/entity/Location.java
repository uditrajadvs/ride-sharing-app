package org.udevs.LLDProject.ridesharingapp.entity;

public class Location {

    private Double longitude;
    private Double latitude;

    public Location(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double calDist(Location l){
        //Euclidean Distance
        double dx = this.latitude-l.latitude;
        double dy = this.longitude-l.longitude;
        return Math.sqrt((dx*dx)+(dy*dy));

        //Haversine formula ->shortest distance between two points on a sphere.
    }
}
