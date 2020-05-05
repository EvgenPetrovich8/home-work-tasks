package com.hillel.lecture_8;


public class MyFractionNumber {


    private int numerator;
    private int denominator;



    public MyFractionNumber() {
    }

    public MyFractionNumber(int a, int b) {
        numerator = a;
        denominator = b;
    }

    @Override
    public String toString() {
        return "( " + numerator + " / " + denominator + " )";
    }

    public MyFractionNumber add(MyFractionNumber MyFractionNumber){

        return new MyFractionNumber(
                MyFractionNumber.numerator * denominator + MyFractionNumber.denominator * numerator, MyFractionNumber.denominator * denominator );
    }

    public MyFractionNumber multiply(MyFractionNumber MyFractionNumber){

        return new MyFractionNumber(
                MyFractionNumber.numerator * numerator, MyFractionNumber.denominator * denominator );
    }

    public MyFractionNumber divide(MyFractionNumber MyFractionNumber){

        return new MyFractionNumber(
                MyFractionNumber.denominator * numerator, MyFractionNumber.numerator * denominator );
    }

    public MyFractionNumber subtract(MyFractionNumber MyFractionNumber){

        return new MyFractionNumber(
                MyFractionNumber.denominator * numerator-MyFractionNumber.numerator * denominator, MyFractionNumber.denominator * denominator );
    }






    public MyFractionNumber simplify (MyFractionNumber MyFractionNumber) {
            long limit =Math.min(MyFractionNumber.numerator,MyFractionNumber.denominator);

        for (long i=2; i<= limit; i++) {
            if (MyFractionNumber.numerator%i ==0 && MyFractionNumber.denominator  % i ==0 ){
                MyFractionNumber.numerator/=i;
                MyFractionNumber.denominator/=i;
            }
        }

            return new MyFractionNumber(
                    MyFractionNumber.numerator , MyFractionNumber.denominator);
        }

    }




