package com.hillel.lecture12_EnumExceptions;

public class Lecture12Main {

    public static String unitTypeStart="CELSIUS";
    public static String unitTypeResult="KELVIN";

    public static void main(String[] args) throws ConverterException{

        double startValue=1;
        String converterType="DISTANCE";


        ConvertersFactory factory = new ConvertersFactory();

        IConverter distanceConverter = factory.getConverter(EnumConverters.DISTANCE);
        IConverter speedConverter = factory.getConverter(EnumConverters.SPEED);
        IConverter temperatureConverter = factory.getConverter(EnumConverters.TEMPERATURE);
        IConverter weightConverter = factory.getConverter(EnumConverters.WEIGHT);





            if (unitTypeStart.equals(unitTypeResult)) {
                throw new ConverterException ("unitTypeStart can not be equals unitTypeResult");
            }

//            if (startValue<0) {
//                throw new ConverterCalculationException("startValue can not be less than 0");
//            }


        if (unitTypeStart.equals("KILOGRAMS")||unitTypeStart.equals("POUNDS")) {

            converterType="WEIGHT";
        }
        else if (unitTypeStart.equals("KILOMETERS")||unitTypeStart.equals("MILES")||unitTypeStart.equals("METERS")||unitTypeStart.equals("INCHES")) {

            converterType="DISTANCE";

        }

        else if (unitTypeStart.equals("KM_HOUR")||unitTypeStart.equals("MILES_HOUR")) {

            converterType="SPEED";

        }

        else if (unitTypeStart.equals("CELSIUS")||unitTypeStart.equals("FAHRENHEIT")||unitTypeStart.equals("KELVIN")) {

            converterType="TEMPERATURE";
        }





        switch (converterType) {

            case ("DISTANCE") :

                double result = distanceConverter.convert(startValue);
                System.out.println("Результат конвертации: "+result);
                break;

            case ("WEIGHT") :

                result = weightConverter.convert(startValue);
                System.out.println("Результат конвертации: "+result);
                break;

            case ("SPEED") :

                result = speedConverter.convert(startValue);
                System.out.println("Результат конвертации: "+result);
                break;

            case ("TEMPERATURE") :

                result = temperatureConverter.convert(startValue);
                System.out.println("Результат конвертации: "+result);
                break;

            default :
                System.out.println("Неподходящий тип конвертера");
        }



        }

    }

