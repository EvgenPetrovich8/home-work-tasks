package com.hillel.lecture_2Interface;

public class poundsToKilograms implements iConverter{

    @Override
    public double convert (double startValue) {
//        TODO implements result
        double finalValue = startValue/(25/11.339925610087994);
        return finalValue;
    }
}
