package com.hillel.lecture_4;

import io.qameta.allure.Step;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
        String result = "";

        String data = value;


        char[] dataDiv = data.toCharArray();

        int length = dataDiv.length;

        for (int i=length-1; i>=-0; i--){

            result = result + dataDiv[i];

        }

//            ArrayUtils.reverse(dataDiv);

//            result=Arrays.toString(dataDiv).replaceAll(",","").replaceAll(" ", "").replaceAll("[\\[\\](){}]","");


        return result;
    }

}
