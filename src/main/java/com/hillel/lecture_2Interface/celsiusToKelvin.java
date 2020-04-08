package com.hillel.lecture_2Interface;

public class celsiusToKelvin implements iConverter{

    @Override
    public double convert (double startValue) {
//        TODO implements result convert Celsius to Kelvin
        double finalValue = startValue+273.15;
        return finalValue;
    }
}
