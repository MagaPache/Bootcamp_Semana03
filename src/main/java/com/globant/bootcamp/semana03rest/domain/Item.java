/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globant.bootcamp.semana03rest.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Item {
    
    private Double lattitude;
    private Double longitude;
    private List<Forecast> forecast;

    public Double getLattitude() {
        return lattitude;
    }

    public void setLattitude(Double lattitude) {
        this.lattitude = lattitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }
        

    public Item() {   
        this.lattitude = 0.00;
        this.longitude = 0.00;
        this.forecast = new ArrayList<>();
        
    }

    public Item(Double lattitude, Double longitude, List<Forecast> forecast) {
        this.lattitude = lattitude;
        this.longitude = longitude;
        this.forecast = forecast;
    }

    @Override
    public String toString() {
        return "Item{" + "lattitude=" + lattitude + ", longitude=" + longitude + ", forecast=" + forecast + '}';
    }

    
    
    
    
}
