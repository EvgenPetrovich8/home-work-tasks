package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result
        boolean isValid = false;

        String [] split = code.split(" ");
        String firstPart = split[0];
        String secondPart = split[1];
        String firstPartStringNeed=firstPart;


        int countOfDigits=0;
        String allDigits  ="";
        countOfDigits = firstPart.replaceAll("\\D", "").length();
        allDigits =  firstPart.replaceAll("\\D", "");

        if(allDigits.length()==6){
            String firstMultiplayerStr =allDigits.substring(0,2);
            String secondMultiplayerStr = allDigits.substring(2,4);
            String thirdMultiplayerStr=allDigits.substring(4,6);


            int firstMultiplayer =Integer.parseInt(firstMultiplayerStr);
            int secondMultiplayer =Integer.parseInt(secondMultiplayerStr);
            int thirdMultiplayer =Integer.parseInt(thirdMultiplayerStr);
            int secondPartInt=Integer.parseInt(secondPart);

            if(firstPart==firstPart.toUpperCase()&&firstMultiplayer*secondMultiplayer*thirdMultiplayer==secondPartInt){
                isValid=true;

            }


        }

        else{
            isValid=false;
        }


        return isValid;
    }
}
