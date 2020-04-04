package com.hillel.Lecture_9;

public class WalkieTalkie extends Phone {

    public int id;
    public String provider;
    public String type;
    public double frequency;

    public WalkieTalkie(int id, String provider, String type, double frequency) {
        this.id = id;
        this.provider = provider;
        this.type = type;
        this.frequency = frequency;
    }

    @Override
    public String call(){                       // переопределение метода call для того чтобы поведение рации отличалось
        if (isConnectionSuccess==true){
            resultOfConnection="Нужный канал отвечает";
        }
        else
        {
            resultOfConnection="Слышны помехи";
        }
        return resultOfConnection;
    }

    public double switchFrequencyUpward(){

       double newFrequency = frequency+1;

        return newFrequency;
    }

    public double switchFrequencyDownward(){

        double newFrequency = frequency-1;

        return newFrequency;
    }

}
