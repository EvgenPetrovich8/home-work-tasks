package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

//        TODO implements result

        int binaryArray[];
       // int resultArray[] = new int[10];

//        String temp = Integer.toString(value);
//        int[] newCnt = new int[temp.length()];
//        for (int i = 0; i < temp.length(); i++)
//        {
//            newCnt[i] = temp.charAt(i) - '0';
//        }

        int count =0 ;

        int result=0;

        String binary = "";

        while(value>0){


            int newres = value % 2;
            binary= newres+binary;
            value = value/2;


        }

       result=Integer.parseInt(binary);



        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;
//        String  data = String.valueOf(value);
//        char[] dataDiv = data.toCharArray();
       int powCoef  =1;
       int temp = value;
               while (temp>0) {
            int tempDigit = temp % 10;
            temp = temp/10;
                   result += tempDigit*powCoef;

                   powCoef=powCoef*2;


        }


        return result;
    }
}
