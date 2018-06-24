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
public class Weather {
    
    private Astronomy astronomy;
    private Atmosphere atmosphere;
    private Wind wind;
    private Location location;
    private Item item;

    public Astronomy getAstronomy() {
        return astronomy;
    }

    public void setAstronomy(Astronomy astronomy) {
        this.astronomy = astronomy;
    }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Weather() {
        this.astronomy = new Astronomy();
        this.atmosphere = new Atmosphere();
        this.wind = new Wind();
        this.location = new Location();
        this.item = new Item();
    }

    public Weather(Astronomy astronomy, Atmosphere atmosphere, Wind wind, Location location, Item item) {
        this.astronomy = astronomy;
        this.atmosphere = atmosphere;
        this.wind = wind;
        this.location = location;
        this.item = item;
    }
    
    public String getWeatherMock(){
        
        String mock = "{ \"location\": { \"city\": \"Cordoba\", \"country\": \"Argentina\", \"region\": \" CBA\" }, \"wind\": { \"chill\": \"45\", \"direction\": \"293\", \"speed\": \"7\" }, \"atmosphere\": { \"humidity\": \"61\", \"pressure\": \"970.0\", \"rising\": \"0\", \"visibility\": \"16.1\" }, \"astronomy\": { \"sunrise\": \"8:16 am\", \"sunset\": \"6:22 pm\" }, \"item\": { \"title\": \"Conditions for Cordoba, CBA, AR at 12:00 AM ART\", \"lat\": \"-31.403959\", \"long\": \"-64.197929\", \"link\": \"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-466861/\", \"pubDate\": \"Fri, 22 Jun 2018 12:00 AM ART\", \"condition\": { \"code\": \"29\", \"date\": \"Fri, 22 Jun 2018 12:00 AM ART\", \"temp\": \"46\", \"text\": \"Partly Cloudy\" }, \"forecast\": [{ \"code\": \"30\", \"date\": \"22 Jun 2018\", \"day\": \"Fri\", \"high\": \"64\", \"low\": \"42\", \"text\": \"Partly Cloudy\" }, { \"code\": \"34\", \"date\": \"23 Jun 2018\", \"day\": \"Sat\", \"high\": \"62\", \"low\": \"44\", \"text\": \"Mostly Sunny\" }, { \"code\": \"32\", \"date\": \"24 Jun 2018\", \"day\": \"Sun\", \"high\": \"50\", \"low\": \"37\", \"text\": \"Sunny\" }, { \"code\": \"32\", \"date\": \"25 Jun 2018\", \"day\": \"Mon\", \"high\": \"61\", \"low\": \"34\", \"text\": \"Sunny\" }, { \"code\": \"32\", \"date\": \"26 Jun 2018\", \"day\": \"Tue\", \"high\": \"66\", \"low\": \"38\", \"text\": \"Sunny\" }, { \"code\": \"32\", \"date\": \"27 Jun 2018\", \"day\": \"Wed\", \"high\": \"66\", \"low\": \"39\", \"text\": \"Sunny\" }, { \"code\": \"32\", \"date\": \"28 Jun 2018\", \"day\": \"Thu\", \"high\": \"72\", \"low\": \"44\", \"text\": \"Sunny\" }, { \"code\": \"34\", \"date\": \"29 Jun 2018\", \"day\": \"Fri\", \"high\": \"68\", \"low\": \"55\", \"text\": \"Mostly Sunny\" }, { \"code\": \"34\", \"date\": \"30 Jun 2018\", \"day\": \"Sat\", \"high\": \"70\", \"low\": \"48\", \"text\": \"Mostly Sunny\" }, { \"code\": \"12\", \"date\": \"01 Jul 2018\", \"day\": \"Sun\", \"high\": \"58\", \"low\": \"50\", \"text\": \"Rain\" }], \"description\": \"<![CDATA[<img src=\\\"http://l.yimg.com/a/i/us/we/52/29.gif\\\"/>\\n<BR />\\n<b>Current Conditions:</b>\\n<BR />Partly Cloudy\\n<BR />\\n<BR />\\n<b>Forecast:</b>\\n<BR /> Fri - Partly Cloudy. High: 64Low: 42\\n<BR /> Sat - Mostly Sunny. High: 62Low: 44\\n<BR /> Sun - Sunny. High: 50Low: 37\\n<BR /> Mon - Sunny. High: 61Low: 34\\n<BR /> Tue - Sunny. High: 66Low: 38\\n<BR />\\n<BR />\\n<a href=\\\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-466861/\\\">Full Forecast at Yahoo! Weather</a>\\n<BR />\\n<BR />\\n<BR />\\n]]>\", \"guid\": { \"isPermaLink\": \"false\" } } }";        
        
        return mock;
                
    }

    @Override
    public String toString() {
        return "Weather{" + "astronomy=" + astronomy.toString() + ", atmosphere=" + atmosphere.toString() + ", wind=" + wind.toString() + ", location=" + location.toString() + ", item=" + item.toString() + '}';
    }
    
    
    
}
