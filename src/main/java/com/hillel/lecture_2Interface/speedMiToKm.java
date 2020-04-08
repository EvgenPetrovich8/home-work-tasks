package com.hillel.lecture_2Interface;

public class speedMiToKm  implements iConverter  {

    @Override
    public double convert (double startValue) {

        double finalValue = startValue*(16.0926939169617/10);
        return finalValue;
    }
}
