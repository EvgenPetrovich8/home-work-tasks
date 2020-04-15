package com.hillel.lecture12_EnumExceptions;

public class WeightConverter  implements IConverter{


    public static final double KILOGRAMS_TO_POUNDS_COEFFICIENT =2.20462;
    public static final double POUNDS_TO_KILOGRAMS_COEFFICIENT =0.453592;


    String unitTypeStart=Lecture12Main.unitTypeStart;
    String unitTypeResult=Lecture12Main.unitTypeResult;

    String transferType=selectType(unitTypeStart,unitTypeResult);




    @Override
    public double convert(double startValue) {

        double finalValue=0;

        switch(transferType) {

            case ("KILOGRAMS_TO_POUNDS"):

                finalValue = startValue * KILOGRAMS_TO_POUNDS_COEFFICIENT;

                break;

            case ("POUNDS_TO_KILOGRAMS"):

                finalValue = startValue * POUNDS_TO_KILOGRAMS_COEFFICIENT;

                break;



                    }

        return finalValue;

    }


    public String selectType(String unitTypeStart,String unitTypeResult){

        if (unitTypeStart.equals("KILOGRAMS") && unitTypeResult.equals("POUNDS")){
            transferType="KILOGRAMS_TO_POUNDS";
        }
        else if (unitTypeStart.equals("POUNDS") && unitTypeResult.equals("KILOGRAMS")) {
            transferType="POUNDS_TO_KILOGRAMS";
        }


        return transferType;
    }
}
