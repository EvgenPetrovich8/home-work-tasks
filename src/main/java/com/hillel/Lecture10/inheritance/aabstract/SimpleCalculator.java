package com.hillel.Lecture10.inheritance.aabstract;

public class SimpleCalculator extends Calculators{

    double percValue=0;


    @Override
    public void turnOn() {
        System.out.println("Простой калькулятор включен"+"\n");
    }

    @Override
    public double addition (double firstValue, double secondValue) {

        result=firstValue+secondValue;

        return result;
    }

    @Override
    public double subtraction(double firstValue, double secondValue) {

        result=firstValue-secondValue;
        return result;
    }

    @Override
    public double multiplication(double firstValue, double secondValue) {

        result=firstValue*secondValue;
        return result;
    }

    @Override
    public double division(double firstValue, double secondValue) {

        result=firstValue/secondValue;
        return result;


        }

    @Override
    public void turnOff() {

        System.out.println("Простой калькулятор выключен"+"\n");

    }

    @Override
    public int clearAC(int result) {
        return 0;
    }


    // как будто уникальный метод для SimpleCalculator


    public double takePercentage (double firstValue, double percValue){

        result = firstValue*percValue/100;

        return result;

    }

    public SimpleCalculator(double firstValue, double secondValue, double result, double percValue) {
        super(firstValue, secondValue, result);
        this.percValue = percValue;
    }
}

