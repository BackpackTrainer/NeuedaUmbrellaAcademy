package com.example.UmbrellaAcademy;

import org.springframework.stereotype.Component;

@Component
public class NationalWeatherService implements WeatherService{
    @Override
    public int getChanceOfRain(String location) {

        return switch(location) {
            case "London" -> {
               yield 90;
            }
            case "Tampa" -> {
                yield 51;
            }
            case "Las Vegas" -> {
               yield 10;
            }
            default  -> {
                yield 49;
            }
        };
    }
}
