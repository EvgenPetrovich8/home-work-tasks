package com.hillel.lecture12_EnumExceptions;

public class ConvertersFactory {

    public IConverter getConverter(EnumConverters type) throws ConverterCalculationException{
        IConverter convReturn = null;
        switch (type) {
            case DISTANCE:
                convReturn = new DistanceConverter();
                break;
            case SPEED:
                convReturn = new SpeedConverter();
                break;
            case TEMPERATURE:
                convReturn = new TemperatureConverter();
                break;
            case WEIGHT:
                convReturn = new WeightConverter();
                break;
            default:
                throw new ConverterCalculationException ("INCORRECT TYPE OF CONVERTER:" + type);
        }
        return convReturn;
    }


}
