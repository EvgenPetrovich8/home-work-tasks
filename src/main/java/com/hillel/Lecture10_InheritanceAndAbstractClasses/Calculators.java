package com.hillel.Lecture10_InheritanceAndAbstractClasses;

public abstract class Calculators {

    public abstract void turnOn();
    public abstract double addition(double firstValue, double secondValue);
    public abstract double subtraction(double firstValue, double secondValue);
    public abstract double multiplication(double firstValue, double secondValue);
    public abstract double division(double firstValue, double secondValue);
    public abstract void turnOff();



    public abstract int clearAC (int start);


    private double firstValue;
    private double secondValue;

    public double result;

    public int start;


    public Calculators(double firstValue, double secondValue, double result) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.result = result;
    }

}
