package com.hillel.lecture_2Interface;

public class speedKmToMi implements iConverter {

    @Override
    public double convert (double startValue) {

        double finalValue = startValue/(10/6.2139999999999995);
        return finalValue;
    }
}
