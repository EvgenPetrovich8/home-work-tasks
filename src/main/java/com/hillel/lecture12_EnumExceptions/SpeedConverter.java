package com.hillel.lecture12_EnumExceptions;

public class SpeedConverter implements IConverter{

    public static final double KM_HOUR_TO_MILES_HOUR_COEFFICIENT =0.621371;
    public static final double MILES_HOUR_TO_KM_HOUR_COEFFICIENT =1.60934;


    String unitTypeStart=Lecture12Main.unitTypeStart;
    String unitTypeResult=Lecture12Main.unitTypeResult;

    String transferType=selectType(unitTypeStart,unitTypeResult);




    @Override
    public double convert(double startValue) {

        double finalValue=0;

        switch(transferType) {

            case ("KM_HOUR_TO_MILES_HOUR"):

                finalValue = startValue * KM_HOUR_TO_MILES_HOUR_COEFFICIENT;

                break;

            case ("MILES_HOUR_TO_KM_HOUR"):

                finalValue = startValue * MILES_HOUR_TO_KM_HOUR_COEFFICIENT;

                break;



            default:
                System.out.println("Неподходящий тип конвертора");
        }

        return finalValue;

    }


    public String selectType(String unitTypeStart,String unitTypeResult){

        if (unitTypeStart.equals("KM_HOUR") && unitTypeResult.equals("MILES_HOUR")){
            transferType="KM_HOUR_TO_MILES_HOUR";
        }
        else if (unitTypeStart.equals("MILES_HOUR") && unitTypeResult.equals("KM_HOUR")) {
            transferType="MILES_HOUR_TO_KM_HOUR";
        }


        return transferType;
    }



}
