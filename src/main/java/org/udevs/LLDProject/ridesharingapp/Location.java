package org.udevs.LLDProject.ridesharingapp;

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
        return Math.sqrt((dx*dx)+(dy*dx));

        //Haversine formula ->shortest distance between two points on a sphere.
    }

//    public void setLatitude(Double latitude) {
//        this.latitude = latitude;
//    }
//
//    public void setLongitude(Double longitude) {
//        this.longitude = longitude;
//    }
}
