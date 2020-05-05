package com.hillel.lecture_8;

public class FractionNumberMain {
    public static void main(String[] args) {

        MyFractionNumber myFractionNumber1 = new MyFractionNumber(3,5);

        MyFractionNumber myFractionNumber2 = new MyFractionNumber(1,3);

        MyFractionNumber resultTemp = new MyFractionNumber();

        MyFractionNumber result = new MyFractionNumber();

        MyFractionNumber resultSimplify = new MyFractionNumber();

        resultTemp=myFractionNumber1.add(myFractionNumber2);

            result = resultTemp.simplify(resultTemp).simplify(resultTemp);

        System.out.print(myFractionNumber1.toString()+" plus ");
        System.out.print(myFractionNumber2.toString()+" equals ");
        System.out.println(result);


        resultTemp=myFractionNumber1.multiply(myFractionNumber2);

        result = resultTemp.simplify(resultTemp).simplify(resultTemp);

        System.out.print(myFractionNumber1.toString()+" multiply ");
        System.out.print(myFractionNumber2.toString()+" equals ");
        System.out.println(result);

        resultTemp=myFractionNumber1.divide(myFractionNumber2);

        result = resultTemp.simplify(resultTemp).simplify(resultTemp);

        System.out.print(myFractionNumber1.toString()+" divide ");
        System.out.print(myFractionNumber2.toString()+" equals ");
        System.out.println(result);

        resultTemp=myFractionNumber1.subtract(myFractionNumber2);

        result = resultTemp.simplify(resultTemp).simplify(resultTemp);

        System.out.print(myFractionNumber1.toString()+" subtract ");
        System.out.print(myFractionNumber2.toString()+" equals ");
        System.out.println(result);



    }

}
