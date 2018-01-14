package com.visuality.f32.weather.data.entity;

/**
 * Created by igormatyushkin on 14.01.2018.
 */

public class AtmosphericPressure {

    private double value;

    private Unit unit;

    public AtmosphericPressure(
            double value,
            Unit unit
    ) {
        super();

        /**
         * Initialize data.
         */

        this.value = value;
        this.unit = unit;
    }

    public double getValue(Unit unit) {
        switch (unit) {
            case HECTOPASCAL:
                switch (this.unit) {
                    case HECTOPASCAL:
                        return this.value;
                    case MILLIMETER_OF_MERCURY:
                        return this.value * 0.750062;
                }
            case MILLIMETER_OF_MERCURY:
                switch (this.unit) {
                    case HECTOPASCAL:
                        return this.value * 1.33322;
                    case MILLIMETER_OF_MERCURY:
                        return this.value;
                }
            default:
                return 0;
        }
    }

    public enum Unit {
        HECTOPASCAL,
        MILLIMETER_OF_MERCURY
    }
}
