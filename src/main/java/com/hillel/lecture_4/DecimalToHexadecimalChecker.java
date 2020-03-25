package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

//        TODO implements result
        String result = "";
        char[] hexSet = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        while (value !=0) {
            int temp = value % 16;
            result=hexSet[temp]+result;
            value = value/16;

        }

        return result;
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {

//        TODO implements result
        int result = 0;

        int coefByPow=1;

        int lengthVal =value.length();

        for (int count=lengthVal-1; count>=0; count--)
        {
            if(value.charAt(count)>='0'&& value.charAt(count)<='9'){

                result += (value.charAt(count)-48)*coefByPow;
                coefByPow = coefByPow*16;
            }

            else if (value.charAt(count)>='A'&& value.charAt(count)<='F'){
                result += (value.charAt(count)-55)*coefByPow;
                coefByPow = coefByPow*16;
            }
        }



        return result;
    }
}
