package com.hillel.Lecture10_InheritanceAndAbstractClasses;

public class Lecture10Main {

    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator(20,10,0,10);

        EngineerCalculator engineerCalculator = new EngineerCalculator(20,10,0);


        simpleCalculator.turnOn();

        double result = simpleCalculator.addition(20,10);
        int resultInt = (int)Math.round(result);
        System.out.println("Результат сложения: "+resultInt+"\n");

        int start = simpleCalculator.clearAC(0);
        System.out.println("После сброса: "+start+"\n");

        result = simpleCalculator.multiplication(20,10);
        resultInt = (int)Math.round(result);
        System.out.println("Результат умножения: "+resultInt+"\n");


        start = simpleCalculator.clearAC(0);
        System.out.println("После сброса: "+start+"\n");

        engineerCalculator.turnOn();

        result = engineerCalculator.subtraction(20,10);
        resultInt = (int)Math.round(result);
        System.out.println("Результат вычитания: "+resultInt+" (инженерный)"+"\n");

        start = engineerCalculator.clearAC(0);
        System.out.println("После сброса: "+start+" (инженерный)"+"\n");

        result = simpleCalculator.multiplication(20,10);
        resultInt = (int)Math.round(result);
        System.out.println("Результат умножения: "+resultInt+"\n");

        start = simpleCalculator.clearAC(0);
        System.out.println("После сброса: "+start+"\n");

        result = engineerCalculator.division(20,10);
        System.out.println("Результат деления: "+result+" (инженерный)"+"\n");

        start = engineerCalculator.clearAC(0);
        System.out.println("После сброса: "+start+" (инженерный)"+"\n");

        result = simpleCalculator.takePercentage(20,10);
        System.out.println("Полученное значение (процент) "+result+"\n");

        start = simpleCalculator.clearAC(0);
        System.out.println("После сброса: "+start+"\n");

        simpleCalculator.turnOff();

        result = engineerCalculator.abs(-20);
        System.out.println("Результат по модулю: "+result+" (инженерный)"+"\n");

        start = engineerCalculator.clearAC(0);
        System.out.println("После сброса: "+start+" (инженерный)"+"\n");

        result = engineerCalculator.sqrt(20);
        System.out.println("Квадратный корень: "+result+" (инженерный)"+"\n");

        start = engineerCalculator.clearAC(0);
        System.out.println("После сброса: "+start+" (инженерный)"+"\n");

        result = engineerCalculator.power(20,2);
        System.out.println("Возведение в степень: "+result+" (инженерный)"+"\n");

        start = engineerCalculator.clearAC(0);
        System.out.println("После сброса: "+start+" (инженерный)"+"\n");

        engineerCalculator.turnOff();


    }
}
