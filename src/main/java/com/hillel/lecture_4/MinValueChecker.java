package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class MinValueChecker {

    @Step
    public int getValue(int[] values) {

//        TODO implements result


        int[] values1 = values;
        int min = values1[0];


        for (int num:values1
             )
        {
            if (num<min) {
                min=num;
            }

        }
        int result =min;
        return result;
    }

}
