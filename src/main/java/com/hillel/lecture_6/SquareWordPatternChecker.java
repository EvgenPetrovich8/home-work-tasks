package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {

//        TODO implements result
        String result = "";

        String result1 = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";
        String result5 = "";
        String result6 = "";
        String Divider =", ";


        if(word.length()==4){
            result1=word;
            result2=word.substring(1).concat(word.substring(0,1));
            result3=word.substring(2).concat(word.substring(0,2));
            result4=word.substring(3).concat(word.substring(0,3));
            result = result1.concat(Divider).concat(result2).concat(Divider).concat(result3).concat(Divider).concat(result4);

        }
        else
        {
            result1=word;
            result2=word.substring(1).concat(word.substring(0,1));
            result3=word.substring(2).concat(word.substring(0,2));
            result4=word.substring(3).concat(word.substring(0,3));
            result5=word.substring(4).concat(word.substring(0,4));
            result6=word.substring(5).concat(word.substring(0,5));
            result = result1.concat(Divider).concat(result2).concat(Divider).concat(result3).concat(Divider).concat(result4).concat(Divider).concat(result5).concat(Divider).concat(result6);
        }

        return result;
    }


}
