package com.hillel.lecture_2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by alpa on 10/17/19
 */
public class ConverterTestTask {

    private TemperatureConverter temperatureConverter = new TemperatureConverter();
    private DistanceConverter distanceConverter = new DistanceConverter();
    private WeightConverter weightConverter = new WeightConverter();
    private SpeedConverter speedConverter = new SpeedConverter();

    @Test
    public void celsiusToFahrenheitTest() {
        double expectedResult = 50.0;
        assertEquals(temperatureConverter.celsiusToFahrenheit(10), expectedResult);
    }

    @Test
    public void fahrenheitToCelsiusTest() {
        double expectedResult = 10.0;
        assertEquals(temperatureConverter.fahrenheitToCelsius(50), expectedResult);
    }

    @Test
    public void celsiusToKelvinTest() {
        double expectedResult = 283.15;
        assertEquals(temperatureConverter.celsiusToKelvin(10), expectedResult);
    }

    @Test
    public void metersToInchesTest() {
        double expectedResult = 196.85;
        assertEquals(distanceConverter.metersToInches(5), expectedResult);
    }

    @Test
    public void inchesToMetersTest() {
        double expectedResult = 1.27000254000508;
        assertEquals(distanceConverter.inchesToMeters(50), expectedResult);
    }

    @Test
    public void milesToKilometresTest() {
        double expectedResult = 16.09;
        assertEquals(distanceConverter.milesToKilometres(10), expectedResult);
    }

    @Test
    public void kilometresToMilesTest() {
        double expectedResult = 6.215040397762586;
        assertEquals(distanceConverter.kilometresToMiles(10), expectedResult);
    }

    @Test
    public void kilogramsToPoundsTest() {
        double expectedResult = 22.0462;
        assertEquals(weightConverter.kilogramsToPounds(10), expectedResult);
    }

    @Test
    public void poundsToKilogramsTest() {

        double expectedResult = 11.339925610087994;
        assertEquals(weightConverter.poundsToKilograms(25), expectedResult);
    }

    @Test
    public void speedKmToMiTest() {

        double expectedResult = 6.2139999999999995;
        assertEquals(speedConverter.speedKmToMi(10), expectedResult);
    }

    @Test
    public void speedMiToKmTest() {

        double expectedResult = 16.0926939169617;
        assertEquals(speedConverter.speedMiToKm(10), expectedResult);
    }

}
