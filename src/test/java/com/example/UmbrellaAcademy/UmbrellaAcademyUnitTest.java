package com.example.UmbrellaAcademy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class UmbrellaAcademyUnitTest {

    @Autowired
    UmbrellaAcademy uut;

    @MockBean
    NationalWeatherService nationalWeatherService;

    @MockBean
    PublicServiceAnnouncer publicServiceAnnouncer;

    @ParameterizedTest
    @CsvSource({"London, 90, true, 1", "Tampa, 51, true, 0", "Las Vegas, 10, false, 0", "Detroit, 49, false, 0"})
    public void testCities(String location, int chanceOfRain, boolean expectedResult, int timesCalled)  {
        when(nationalWeatherService.getChanceOfRain(location)).thenReturn(chanceOfRain);

        boolean actualResult = uut.shouldICarry(location);

        assertEquals(expectedResult, actualResult);

        verify(publicServiceAnnouncer, times(timesCalled)).setAnnouncement(anyString());

    }
}
