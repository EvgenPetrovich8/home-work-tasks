package com.hillel.lecture_2Interface;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */

 public class MetersToInchesConverter implements iConverter {


    double startValue = 10;

    @Override
    public double convert(double startValue) {
//        TODO implements result
        double finalValue = startValue * 39.37;
        return finalValue;
    }

}

