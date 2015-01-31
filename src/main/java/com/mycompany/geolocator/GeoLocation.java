
package com.mycompany.geolocator;

/**
 *
 * @author intern
 */
public class GeoLocation {
    
    public static void main(String[] args) {

        LocationTester locationTester = new LocationTester();

        Location locate = locationTester.locator("8.8.8.8");

        System.out.println(locate.toString());
    }
}
