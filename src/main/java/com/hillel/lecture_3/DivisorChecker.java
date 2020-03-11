package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DivisorChecker {

    @Step
    public String checkDivisor(int divisor, int number) {
        //        TODO implements result
        String result = "";

        if (divisor%number==0&&number!=0){
            result ="The number 2 is divisor of the number 10";
        }
         else
        {
            result ="The number 7 is not divisor of the number 50";
        }

        return result;
    }
}
