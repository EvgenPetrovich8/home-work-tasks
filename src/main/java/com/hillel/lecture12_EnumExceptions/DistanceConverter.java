package com.hillel.lecture12_EnumExceptions;


public class DistanceConverter implements IConverter {

    public static final double KILOMETRES_TO_MILES_COEFFICIENT =0.62150404;
    public static final double MILES_TO_KILOMETRES_COEFFICIENT =1.609;
    public static final double METERS_TO_INCHES_COEFFICIENT =39.37;
    public static final double INCHES_TO_METERS_COEFFICIENT =0.0254000508;



   String unitTypeStart=Lecture12Main.unitTypeStart;
   String unitTypeResult=Lecture12Main.unitTypeResult;
   double startValue = Lecture12Main.startValue;



//    private String unitTypeStart;
//    private String unitTypeResult;
//
//    public String getunitTypeStart() {
//        return unitTypeStart;
//    }
//
//    public String getunitTypeResult() {
//        return unitTypeResult;
//    }

    String transferType=selectType(unitTypeStart,unitTypeResult);






    public String selectType(String unitTypeStart,String unitTypeResult) {

        if (unitTypeStart.equals("KILOMETRES") && unitTypeResult.equals("MILES")){
            transferType="KILOMETRES_TO_MILES";
        }
        else if (unitTypeStart.equals("MILES") && unitTypeResult.equals("KILOMETRES")) {
            transferType="MILES_TO_KILOMETRES";
        }

        else if (unitTypeStart.equals("METERS") && unitTypeResult.equals("INCHES")){
            transferType="METERS_TO_INCHES";
        }

        else if (unitTypeStart.equals("INCHES") && unitTypeResult.equals("METERS")){
            transferType="INCHES_TO_METERS";
        }
         else {
            transferType="INCORRECT" ;
        }

        return transferType;
    }



    @Override
    public double convert(double startValue) {

        double finalValue=0;

        switch(transferType) {

            case ("KILOMETRES_TO_MILES"):

                finalValue = startValue * KILOMETRES_TO_MILES_COEFFICIENT;

                break;

            case ("MILES_TO_KILOMETRES"):

                finalValue = startValue * MILES_TO_KILOMETRES_COEFFICIENT;

                break;

            case ("METERS_TO_INCHES"):

                finalValue = startValue * METERS_TO_INCHES_COEFFICIENT;

                break;

            case ("INCHES_TO_METERS_COEFFICIENT"):

                finalValue = startValue * INCHES_TO_METERS_COEFFICIENT;

                break;




        }

           return finalValue;

    }




}
