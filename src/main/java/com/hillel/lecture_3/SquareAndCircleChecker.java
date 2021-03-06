package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        String result="";

        double x,y;

        x=getRadiusOfCircle(circleArea,squareArea);
        y=getSquareSide(squareArea);

//        x=Math.sqrt(circleArea/Math.PI);
//        y=Math.sqrt(squareArea);



        if (y>=2*x){
            result ="The circle is in the square";
        }
        else
        {
            result ="The circle is not in the square";
        }

        return result;
    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        
         if (getSquareSide(squareArea)<=Math.sqrt(2)*getRadiusOfCircle(circleArea,squareArea))
        {
            result ="The square is in the circle";
        }
        else
        {
            result ="The square is not in the circle";
        }

        return result;
    }



    public double getRadiusOfCircle(double circleArea, double squareArea){

        return Math.sqrt(circleArea/Math.PI);
    }

    public double getSquareSide(double squareArea){

        return Math.sqrt(squareArea);
    }

}
