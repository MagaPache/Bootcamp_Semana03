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
public class Atmosphere {
    
    private Integer humidity;
    private Double pressure;
    private Integer rising;
    private Double visibility;

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Integer getRising() {
        return rising;
    }

    public void setRising(Integer rising) {
        this.rising = rising;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public Atmosphere() {
    }

    public Atmosphere(Integer humidity, Double pressure, Integer rising, Double visibility) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.rising = rising;
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return "Atmosphere{" + "humidity=" + humidity + ", pressure=" + pressure + ", rising=" + rising + ", visibility=" + visibility + '}';
    }
    
    
    
}
