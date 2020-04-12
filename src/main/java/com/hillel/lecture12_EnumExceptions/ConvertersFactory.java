package com.hillel.lecture12_EnumExceptions;

public class ConvertersFactory {

    public IConverter getConverter(EnumConverters type) {
        IConverter toReturn = null;
        switch (type) {
            case DISTANCE:
                toReturn = new DistanceConverter();
                break;
            case SPEED:
                toReturn = new SpeedConverter();
                break;
            case TEMPERATURE:
                toReturn = new TemperatureConverter();
                break;
            case WEIGHT:
                toReturn = new WeightConverter();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return toReturn;
    }


}
