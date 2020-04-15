package com.hillel.lecture12_EnumExceptions;

public class Lecture12Main {

    // делал изначально по концепции входной точки как будто пользователь выбирает в интерфейсе программы в двух выпадающих списках
//     какие единицы в какие он хочет перевести (unitTypeStart и unitTypeResult),а также задаёт величину (startValue).
//    Твоё замечание по поводу "прятать експешны" понял, но тут они общие (отрицательное числов на вход,например или когда
// unitTypeStart=unitTypeResult)

    public static String unitTypeStart="KILOGRAMS1";
    public static String unitTypeResult="POUNDS";
    public static double startValue=1;

    public static void main(String[] args) throws ConverterException,ConverterCalculationException{


        String converterType="DISTANCE";
        boolean isValidUnit=true;


        ConvertersFactory factory = new ConvertersFactory();

        IConverter distanceConverter = factory.getConverter(EnumConverters.DISTANCE);
        IConverter speedConverter = factory.getConverter(EnumConverters.SPEED);
        IConverter temperatureConverter = factory.getConverter(EnumConverters.TEMPERATURE);
        IConverter weightConverter = factory.getConverter(EnumConverters.WEIGHT);



//
           if (unitTypeStart.equals(unitTypeResult)) {
                throw new ConverterException ("unitTypeStart can not be equals unitTypeResult");
            }

//           if (EnumUnits.valueOf(unitTypeStart)) {
//               throw new ConverterCalculationException("startValue can not be less than 0");
//           }



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


        }

       boolean resultA =UnitsValidator.isValidunitTypeStart(unitTypeStart);
        System.out.println(resultA );

        }

    }

