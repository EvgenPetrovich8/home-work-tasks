package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class BelongsToIntervalChecker {

    @Step
    public String checkNumberInInterval(int from, int to, int number) {

        String result = decideBelongsOrNot(from,to,number);



        return result;
    }

    public String decideBelongsOrNot (int from, int to, int number){

        String answer;
        if (number>=from&&number<=to)
        {
           answer= "Number "+ number +" belong to interval [-5;3]";
        }
        else
        {
            answer= "Number "+ number +" not belong to interval [-5;3]";
        }


        return answer;
    }
}
