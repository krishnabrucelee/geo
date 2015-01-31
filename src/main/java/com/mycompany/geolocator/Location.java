/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.geolocator;

/**
 *Location class used to locate the pointed places. 
 * @author intern
 */
class Location {

    static Location locator(String ip) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * to get the location address of a given place.
     */
    private String ip;
    
    /**
     * Obtain the Country Name.
     */
    private String countryName;
    
    /**
     * Obtain the current City from ipAddress.
     */
    private String city;
    
    /**
     * To obtain the state from the ipAddress.
     */
    private String state;
    
    /**
     * To get the Geographical latitude of the current city.
     */
    private Double latitude;
    
    /**
     * To get the Geographical longitude of the current city.
     */
    private Double longitude;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{" + "ip=" + ip + ", countryName=" + countryName + 
                ", city=" + city + ", state=" + state + ", latitude=" + latitude + 
                ", longitude=" + longitude + '}';
    }
    
    
}
