package com.hillel.lecture_2Interface;

public class ConvertersMain {
    public static void main(String[] args) {


        double startValue=10;

         String meters = "метрах";
        String meters1 = meters.replace("ах","ов");

         String celsius = "Цельсиях";
        String celsius1 = "Цельсий";

        String kelvin = "Кельвинах";
        String kelvin1 = kelvin.replace("ах","ов");

         String fahrenheit = "Фаренгейтах";
        String fahrenheit1 = fahrenheit.replace("ах","ов");

         String inches = "дюймах";
        String inches1 = inches.replace("ах","ов");

         String kilometres = "километрах";
        String kilometres1 = kilometres.replace("ах","ов");

         String miles = "милях";
        String miles1 = "миль";

         String pounds = "фунтах";
        String pounds1 = pounds.replace("ах","ов");

         String kilograms = "килограммах";
        String kilograms1 = kilograms.replace("ах","ов");





        celsiusToFahrenheit celsiusToFahrenheit = new celsiusToFahrenheit();

        celsiusToKelvin celsiusToKelvin = new celsiusToKelvin();

        fahrenheitToCelsius fahrenheitToCelsius = new fahrenheitToCelsius();

        InchesToMetersConverter InchesToMetersConverter = new InchesToMetersConverter();

        MetersToInchesConverter MetersToInchesConverter = new MetersToInchesConverter();

        KilometresToMiles KilometresToMiles = new KilometresToMiles();

        milesToKilometres milesToKilometres = new milesToKilometres();

        kilogramsToPounds kilogramsToPounds = new kilogramsToPounds();

        poundsToKilograms poundsToKilograms = new poundsToKilograms();

        speedKmToMi speedKmToMi = new speedKmToMi();

        speedMiToKm speedMiToKm = new speedMiToKm();



        double celsiusToFahrenheitResult = celsiusToFahrenheit.convert(startValue);
        System.out.println("В "+startValue+" "+celsius+" "+celsiusToFahrenheitResult+" "+fahrenheit1+"\n");

        double celsiusToKelvinResult = celsiusToKelvin.convert(startValue);
        System.out.println("В "+startValue+" "+celsius+" "+celsiusToKelvinResult+" "+kelvin1+"\n");

        double fahrenheitToCelsiusResult = fahrenheitToCelsius.convert(startValue);
        System.out.println("В "+startValue+" "+fahrenheit+" "+fahrenheitToCelsiusResult+" "+celsius1+"\n");



        double InchesToMetersConverterResult = InchesToMetersConverter.convert(startValue);
        System.out.println("В "+startValue+" "+inches+" "+InchesToMetersConverterResult+" "+meters1+"\n");


        double MetersToInchesConverterResult = MetersToInchesConverter.convert(startValue);
        System.out.println("В "+startValue+" "+meters+" "+MetersToInchesConverterResult+" "+inches1+"\n");

        double KilometresToMilesResult = KilometresToMiles.convert(startValue);
        System.out.println("В "+startValue+" "+kilometres+" "+KilometresToMilesResult+" "+miles1+"\n");

        double milesToKilometresResult = milesToKilometres.convert(startValue);
        System.out.println("В "+startValue+" "+miles+" "+milesToKilometresResult+" "+kilometres1+"\n");



        double kilogramsToPoundsResult = kilogramsToPounds.convert(startValue);
        System.out.println("В "+startValue+" "+kilograms+" "+kilogramsToPoundsResult+" "+pounds1+"\n");

        double poundsToKilogramsResult = poundsToKilograms.convert(startValue);
        System.out.println("В "+startValue+" "+pounds+" "+poundsToKilogramsResult+" "+kilograms1+"\n");



        double speedKmToMiResult = speedKmToMi.convert(startValue);
        System.out.println("В "+startValue+" "+"км/ч"+" "+speedKmToMiResult+" "+"м/час"+"\n");

        double speedMiToKmResult = speedKmToMi.convert(startValue);
        System.out.println("В "+startValue+" "+"м/час"+" "+speedMiToKmResult+" "+"км/ч"+"\n");




    }
}
