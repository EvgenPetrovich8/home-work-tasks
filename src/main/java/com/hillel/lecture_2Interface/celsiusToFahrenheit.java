package com.hillel.lecture_2Interface;

public class celsiusToFahrenheit implements iConverter {

    @Override
    public double convert(double startValue) {
//       TODO implements result Convert Celsius to Fahrenheit
        double finalValue = (startValue * 9/5)+32;
        return finalValue;
    }
}
