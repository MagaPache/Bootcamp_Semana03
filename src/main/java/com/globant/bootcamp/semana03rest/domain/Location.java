/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globant.bootcamp.semana03rest.domain;

/**
 *
 * @author Usuario
 */
public class Location {
    
    private String city;
    private String country;
    private String region;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Location() {
        this.city = "";
        this.country = "";
        this.region = "";
    }

    public Location(String city, String country, String region) {
        this.city = city;
        this.country = country;
        this.region = region;
    }

    @Override
    public String toString() {
        return "Location{" + "city=" + city + ", country=" + country + ", region=" + region + '}';
    }
    
    
    
}
