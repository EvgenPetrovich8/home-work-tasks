package com.hillel.lecture12_EnumExceptions;

public class TemperatureConverter implements IConverter{


    public static final double CELSIUS_TO_KELVIN_COEFFICIENT =273.15;



    String unitTypeStart=Lecture12Main.unitTypeStart;
    String unitTypeResult=Lecture12Main.unitTypeResult;

    String transferType=selectType(unitTypeStart,unitTypeResult);




    @Override
    public double convert(double startValue) {

        double finalValue=0;

        switch(transferType) {

            case ("CELSIUS_TO_FAHRENHEIT"):

                finalValue = (startValue * 9/5)+32;

                break;

            case ("CELSIUS_TO_KELVIN"):

                finalValue = startValue + CELSIUS_TO_KELVIN_COEFFICIENT;

                break;

            case ("FAHRENHEIT_TO_CELSIUS"):

                finalValue = (startValue -32)*5/9;

                break;

                        default:
                System.out.println("Неподходящий тип конвертора");
        }

        return finalValue;

    }


    public String selectType(String unitTypeStart,String unitTypeResult){

        if (unitTypeStart.equals("CELSIUS") && unitTypeResult.equals("FAHRENHEIT")){
            transferType="CELSIUS_TO_FAHRENHEIT";
        }
        else if (unitTypeStart.equals("CELSIUS") && unitTypeResult.equals("KELVIN")) {
            transferType="CELSIUS_TO_KELVIN";
        }

        else if (unitTypeStart.equals("FAHRENHEIT") && unitTypeResult.equals("CELSIUS")){
            transferType="FAHRENHEIT_TO_CELSIUS";
        }



        return transferType;
    }
}
