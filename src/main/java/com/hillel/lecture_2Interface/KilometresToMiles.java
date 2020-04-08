package com.hillel.lecture_2Interface;

public class KilometresToMiles implements iConverter{

    @Override
  public double convert(double startValue) {

       double finalValue = startValue/1.609;
     return finalValue;
}

}
