package com.hillel.lecture_6;

import io.qameta.allure.Step;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by alpa on 11/2/19
 */
public class CountLettersFrequenciesChecker {


    @Step
    public String countLettersFrequencies(String text, char letter) {

//        TODO implements result
        String result = "";



                switch (letter){
            case 'a' :
                int replaceAll = text.replaceAll("[^a]", "").length();
                result = "Character 'a' repeated "+replaceAll+ " times";
                break;
                    case 'm' :
                        replaceAll = text.replaceAll("[^m]", "").length();
                        result = "Character 'm' repeated "+replaceAll+ " times";
                        break;
                    case 'e' :
                        replaceAll = text.replaceAll("[^e]", "").length();
                        result = "Character 'e' repeated "+replaceAll+ " times";
                        break;

        }



        return result;
    }
}
