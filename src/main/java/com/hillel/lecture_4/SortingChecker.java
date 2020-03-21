package com.hillel.lecture_4;

import io.qameta.allure.Step;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

//        TODO implements result
        int[] result = new int[0];
        result = values;
        boolean sorted = false;
        int temp;

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i] > values[i+1]) {
                    temp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = temp;
                    sorted = false;
                }
            }
        }



        return result;
    }

    @Step
    public int[] fromMaxToMin(int[] values) {

//        TODO implements result
        int[] result = new int[0];
        result = values;
        boolean sorted = false;
        int temp;

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i] < values[i+1]) {
                    temp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = temp;
                    sorted = false;
                }
            }
        }


        return result;
    }
}
