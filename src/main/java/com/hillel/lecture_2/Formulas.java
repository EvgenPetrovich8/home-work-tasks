package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {

        double sqrFromPX = Math.sqrt(Math.PI*x);
        double firstPart = 1.1*Math.pow(Math.E,-x);
        double secondPart = Math.abs(Math.cos(sqrFromPX));
        double result9 = firstPart+secondPart-0.375;
      //        TODO implement formula 9

        return result9;
    }

    @Step
    public double calculate10Formula(double x) {
        double result10 = (0.3333333333333333)*(Math.sqrt(Math.abs(Math.sin(x)))*Math.cbrt(Math.pow(Math.E,0.12*x)));
//        TODO implement formula 1
        return result10;
    }

  /*  @Step
    public double calculate11Formula(double x) {
        double result11 = 2*Math.PI*x-Math.abs(Math.sin(Math.sqrt(10.5*x)))*(1/(Math.cbrt(Math.pow(x,2))))+(1d/7d);
//        TODO implement formula 11
        return result11;
    }

    @Step
    public double calculate12Formula(double x) {
        double result12 = Math.log(Math.sqrt(Math.abs(2-x))+1.2)*1/2+Math.pow(Math.E,-x)+Math.cbrt(2/x);
//        TODO implement formula 12
        return result12;
    }

    @Step
    public double calculate13Formula(double x) {
        double result = 0.0;
//        TODO implement formula 13
        // доработаю позже,не успел
        return result;
    }

   /* @Step
    public double calculate14Formula(double x) {
        double result = 0.0;
//        TODO implement formula 14
        // доработаю позже,не успел
        return result;

    }
    */
}
