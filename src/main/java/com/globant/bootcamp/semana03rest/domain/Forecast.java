/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globant.bootcamp.semana03rest.domain;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Forecast {
    
    private Integer code;
    private Date date;
    private String day;
    private Integer high;
    private Integer low;
    private String text;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Forecast() {   
        this.code = 0;
        this.date = new Date();
        this.day = "";
        this.high = 0;
        this.low = 0;
        this.text = "";
       
    }

    public Forecast(Integer code, Date date, String day, Integer high, Integer low, String text) {
        this.code = code;
        this.date = date;
        this.day = day;
        this.high = high;
        this.low = low;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Forecast{" + "code=" + code + ", date=" + date + ", day=" + day + ", high=" + high + ", low=" + low + ", text=" + text + '}';
    }
    
    
}
