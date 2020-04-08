package com.hillel.lecture_2Interface;

public class kilogramsToPounds implements iConverter {

    @Override
    public double convert (double startValue) {
//        TODO implements result
        double finalValue = startValue*2.20462;
        return finalValue;
    }
}
