package com.hillel.lecture12_EnumExceptions;

import java.util.*;


public class UnitsValidator {

//    String unitTypeStart ="KILOMETRES";
//    String unitTypeResult ="MILES";

    public static String unitTypeStart = "KILOGRAMS";
    public static String unitTypeResult = "POUNDS";

//    public static boolean isValid = true;


    public static boolean isValidunitTypeStart(String unitTypeStart) {
        for (EnumUnits c : EnumUnits.values())
            if (c.name().equals(unitTypeStart)) {
                return true;
            }
        return false;
    }
}

//    boolean isUnitTypeStartValid = isValidunitTypeStart(unitTypeStart);


//    if (isUnitTypeStartValid==true){
//
//    }
//
//}



//    public  boolean isValid = this.isValidunitTypeStart(unitTypeStart);





//        if(isValidunitTypeStart==false){
//        throw new ConverterCalculationException("startValue can not be less than 0");
//        }

//    private String unitTypeStart;
//    private String unitTypeResult;
//
//    public void setunitTypeStart(String unitTypeStart) {
//        this.unitTypeStart = unitTypeStart;
//    }
//
//    public void setunitTypeResult(String unitTypeResult) {
//        this.unitTypeResult = unitTypeResult;
//    }
//
//
//
//
//    public String setunitTypeStart() {
//        return unitTypeStart;
//    }
//
//    public String setunitTypeResult() {
//        return unitTypeResult;
//    }

