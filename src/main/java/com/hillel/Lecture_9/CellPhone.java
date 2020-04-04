package com.hillel.Lecture_9;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class CellPhone extends Phone{


    public CellPhone(int id, String provider, String type, String os, String osVersion, boolean isConnectionSuccess) {
        super(id, provider, type, os, osVersion,isConnectionSuccess);
        this.id = id;
        this.provider = provider;
        this.type = type;
        this.os = os;
        this.osVersion = osVersion;
         this.isConnectionSuccess = isConnectionSuccess;
    }

    public int id;
    public String provider;
    public String type;
    public String os;
    public String osVersion;
    public String resultOfConnection;

    public boolean isConnectionSuccess;

    LocalDateTime from = LocalDateTime.of(2020,Month.APRIL,4,12,00);
    LocalDateTime to = LocalDateTime.of(2020,Month.APRIL,4,12,45);

    Duration diff = Duration.between(from, to);


    String timing = String.format("%d:%02d",
            diff.toHours(),
            diff.toMinutes());


    String timingResult   = "Вызов завершен. Длительность разговора: " + timing+ "";

//    public CellPhone (int id, String provider,String type, String os, String osVersion){
//        this.id  = id;
//        this.provider = provider;
//        this.type= type;
//        this.os = os;
//        this.osVersion = osVersion;
//
//
//    }


    @Override
    public String call(){
        if (isConnectionSuccess==true){
            resultOfConnection="Слышны гудки";
        }
        else
        {
            resultOfConnection="На данный момент абонент недоступен!Перезвоните пожалуйста позже";
        }
        return resultOfConnection;
    }

    public String down(){
        return timing;
    }
}
