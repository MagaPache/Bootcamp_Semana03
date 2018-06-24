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
public class Wind {
    
    private Integer chill;
    private Integer direction;
    private Integer speed;

    public Integer getChill() {
        return chill;
    }

    public void setChill(Integer chill) {
        this.chill = chill;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Wind() {
        this.chill = 0;
        this.direction = 0;
        this.speed = 0;
    }

    public Wind(Integer chill, Integer direction, Integer speed) {
        this.chill = chill;
        this.direction = direction;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Wind{" + "chill=" + chill + ", direction=" + direction + ", speed=" + speed + '}';
    }
    
    
    
}
