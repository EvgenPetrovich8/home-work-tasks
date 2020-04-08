package com.hillel.lecture_2Interface;

public class fahrenheitToCelsius implements iConverter {

    @Override
    public double convert (double startValue) {

        double finalValue = (startValue -32)*5/9;
        return finalValue;
    }
}
