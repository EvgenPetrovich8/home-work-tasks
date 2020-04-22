package com.hillel.Lecture10.inheritance.aabstract;

public class EngineerCalculator extends Calculators{


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
    public int clearAC(int start) {
        return start;
    }

    @Override
    public void turnOn() {
        System.out.println("Инженерный калькулятор включен"+"\n");
    }

    @Override
    public void turnOff() {
        System.out.println("Инженерный калькулятор выключен"+"\n");
    }

    public double power (double firstValue, double power){

        result = Math.pow(firstValue,power);

        return result;
    }


    public double sqrt (double firstValue){

        result = Math.sqrt(firstValue);

        return result;
    }


    public double abs (double firstValue){

        result = Math.abs(firstValue);

        return result;
    }


    public EngineerCalculator(double firstValue, double secondValue, double result) {
        super(firstValue, secondValue, result);
    }
}
