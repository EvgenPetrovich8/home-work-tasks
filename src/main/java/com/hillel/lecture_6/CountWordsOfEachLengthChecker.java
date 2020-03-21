package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

//        TODO implements result
        int result = 0;
        int i=0;


        String [] split = sentence.replace(".","").replace(",","").split(" ");
        int length=split.length;

        for (i=0; i<=length-1;i++) {
            int countSmb= split[i].length();
            if(countSmb==wordLength){
                result=result+1;
            }
            else{
                result=result;
            }
        }

        return result;
    }


}
