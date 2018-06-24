package com.globant.bootcamp.semana03rest.service;

import com.globant.bootcamp.semana03rest.domain.Astronomy;
import com.globant.bootcamp.semana03rest.domain.Weather;
import java.io.IOException;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
@Component
@Path("/weatherService")
@Consumes("application/json")
@Produces("application/json")
public class WeatherService {

    Weather weather;
    

    public WeatherService() {
        this.init();
    }


    public void init() {
        weather = new Weather();
    }

    @GET
    //@Produces("application/json")
    @Path("/weathers/cities/{city}/regions/{region}")
    public String getWeather(@PathParam("city") String city, @PathParam("region") String region) {
        
        try {            
           
            ObjectMapper mapper = new ObjectMapper();
            
            weather = mapper.readValue(weather.getWeatherMock(), Weather.class);
            
            
        } catch (IOException ex) {
            
            Logger.getLogger(WeatherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return weather.toString();
    }
    
    

}
