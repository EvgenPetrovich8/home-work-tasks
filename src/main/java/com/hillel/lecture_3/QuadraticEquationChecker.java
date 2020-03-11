package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    // Почему здесь double,а в исполняемом классе int?
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";

        double d = (Math.pow(b, 2)-4*a*c);
        double x1 = (-b+(Math.sqrt(d)))/(2*a);
        double x2 = (-b-(Math.sqrt(d)))/(2*a);

        if (a==0)
        {
            result = "The 'a' coefficient should not be zero!";
        }

        else if (d>0)
        {
            result = "Discriminant: " + d+", x1: "+x1+", x2: "+x2;
        }
        else if (d==0)
        {
            result = "Two real, identical roots: [x1 && x2] = -0.6666666666666666";
        }
        else
        {
            result = "No roots on the set of real numbers!";
        }


        return result;
    }

}
