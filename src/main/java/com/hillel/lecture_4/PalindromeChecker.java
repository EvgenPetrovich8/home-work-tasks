package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

//        TODO implements result

        boolean result = false;

        String data = value;
        char[] dataDiv = data.toCharArray();
        //dataDiv = new char[dataDiv.length];

        boolean even = false;
        int length = dataDiv.length;

        if(length%2==0){
            even=true;
        }
        else{
            even=false;
        }

        if(even==true){

            for (int i = 0; i <= length/2; i++) {
                if(dataDiv[i]-i==dataDiv[length-i-1]){
                    result=true;
                }
                else{
                    result=false;

                }
                break;
            }

        }
        else
        {
            for (int i = 0; i < Math.floor(length/2); i++) {
                if(dataDiv[i]==dataDiv[dataDiv.length-i-1]){
                    result=true;
                   // System.out.println(dataDiv[i]);
                    continue;
                }
                else{
                    result=false;

                }
                break;
            }
        }






        return result;
    }

}
