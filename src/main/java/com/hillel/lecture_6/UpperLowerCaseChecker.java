package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = "";
        result=word.toUpperCase();

        return result;
    }

    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = "";
        result=word.toLowerCase();

        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {

//        TODO implements result
        String result = "";

        //        String secondPart
//        String firstUcase = Character.toString(first).toUpperCase();
//        String sentenceTrimmed =sentence.substring(1).toLowerCase();
//        result = firstUcase.concat(sentenceTrimmed);

        char first = 0;
        char second = 0;

        String firstUcase;
        String secondUcase;
        String sentenceTrimmed;

        if (sentence.contains(".")){
            String [] split = sentence.split("\\.");

            String firstPart = split[0];
            String secondPart = split[1];
            first = firstPart.charAt(0);
            second =secondPart.charAt(1);
            String devider=". ";

            firstUcase= Character.toString(first).toUpperCase();
            secondUcase = Character.toString(second).toUpperCase();

            String sentenceTrimmedF =firstPart.substring(1);
            String sentenceTrimmedS =secondPart.substring(2);

            if (sentence.endsWith(".")) {
                result = firstUcase.concat(sentenceTrimmedF).concat(devider).concat(secondUcase).concat(sentenceTrimmedS).concat(".");
            }
            else {
                result = firstUcase.concat(sentenceTrimmedF).concat(devider).concat(secondUcase).concat(sentenceTrimmedS);
            }
        }
        else{
            first = sentence.charAt(0);
            firstUcase = Character.toString(first).toUpperCase();
            sentenceTrimmed =sentence.substring(1);
            result =firstUcase.concat(sentenceTrimmed);
        }



        return result;
    }


    @Step
    public String eachLetterToUpperCase(String sentence) {

//        TODO implements result
        String result = "";
        int i =0;
        String  others;
        String  start;
//        String  space="";

        String [] split = sentence.split(" ");
        int length=split.length;

        while (i<=length-1
             ) {
            start = split[i].substring(0,1).toUpperCase();
            others=split[i].substring(1);
            result=result+start.concat(others).concat(" ");
            i++;
            
        }

        return result.trim();
    }
}
