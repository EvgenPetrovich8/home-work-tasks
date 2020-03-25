package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    @Step
    public String getGreatestNumberByMagnitude(double a, double b) {
//        TODO implements result
        String result = "";

        double moduleB= getABS(b);
        double moduleA= getABS(a);

        if(moduleA<moduleB){
            result = "The number "+ b + " has the greatest magnitude!";
        }
        else if (moduleA>moduleB)
        {
            result = "The number "+ a + " has the greatest magnitude!";
        }
        else
        {
            result = "The number "+ a +" and " +b+ " are equals by magnitude!";
        }
        return result;
    }

    public double getABS(double input){
        return Math.abs(input);
    }
}
