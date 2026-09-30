package org.udevs.LLDProject.ridesharingapp.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    @Test
    void shouldReturnCorrectLatitude() {
        Location location =new Location(12.9352, 77.6245);

       assertEquals(12.9352, location.getLatitude());
    }

    @Test
    void shouldReturnCorrectLongitude() {
        Location location = new Location(12.9352, 77.6245);

      assertEquals(77.6245, location.getLongitude());
    }

    @Test
    void shouldReturnZeroDistanceForSameLocation() {
        Location location = new Location(12.9352, 7.6245);

        assertEquals(0.0, location.calDist(location), 0.001);
    }

    @Test
    void shouldCalculateDistanceCorrectly() {
        Location location1 = new Location(0.0, 0.0);
        Location location2 = new Location(3.0, 4.0);

        double distance = location1.calDist(location2);

        assertEquals(5.0, distance, 0.001);
    }

    @Test
   void distanceShouldBeSymmetric(){
        Location location1 = new Location(10.0, 20.0);
        Location location2 = new Location(15.0, 25.0);

        double distance1 = location1.calDist(location2);
        double distance2 = location2.calDist(location1);

       assertEquals(distance1, distance2, 0.001);
    }

    @Test
    void distanceShouldAlwaysBePositive(){
        Location location1 = new Location(20.0, 50.0);
        Location location2 = new Location(10.0, 30.0);

        double distance = location1.calDist(location2);

        assertTrue(distance> 0);
    }
}
