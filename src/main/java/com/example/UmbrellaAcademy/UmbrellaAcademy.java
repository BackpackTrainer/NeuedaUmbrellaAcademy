package com.example.UmbrellaAcademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UmbrellaAcademy {

    WeatherService weatherService;
    PublicServiceAnnouncer publicServiceAnnouncer;

    public boolean shouldICarry(String location)  {
        int chanceOfRain = weatherService.getChanceOfRain(location);
        if(chanceOfRain >= 90) {
            publicServiceAnnouncer.setAnnouncement("You are going to get wet in " + location);
        }


        return (chanceOfRain > 50);
    }

    public WeatherService getWeatherService() {
        return weatherService;
    }
    @Autowired
    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @Autowired
    public void setPublicServiceAnnouncer(PublicServiceAnnouncer publicServiceAnnouncer) {
        this.publicServiceAnnouncer = publicServiceAnnouncer;
    }
}

