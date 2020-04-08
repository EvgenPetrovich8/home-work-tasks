package com.hillel.lecture_2Interface;

public class InchesToMetersConverter implements iConverter {

    @Override
    public double convert(double startValue) {

        double finalValue = startValue/39.37;
        return finalValue;
    }


}
