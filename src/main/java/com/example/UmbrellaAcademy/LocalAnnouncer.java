package com.example.UmbrellaAcademy;

import org.springframework.stereotype.Component;

@Component
public class LocalAnnouncer implements PublicServiceAnnouncer{
    @Override
    public void setAnnouncement(String message) {
        System.out.println(message);
    }
}
