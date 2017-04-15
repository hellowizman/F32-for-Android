package com.visuality.f32.weather.data;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class AtmosphericInformation {

    private double pressure;

    public double getPressure() {
        return pressure;
    }

    private int humidityPercentage;

    public int getHumidityPercentage() {
        return humidityPercentage;
    }

    public AtmosphericInformation(
            double pressure,
            int humidityPercentage
    ) {
        super();

        /**
         * Initialize pressure.
         */

        this.pressure = pressure;

        /**
         * Initialize humidity percentage.
         */

        this.humidityPercentage = humidityPercentage;
    }

    public static final class Builder {

        private double pressure;

        public Builder setPressure(double pressure) {
            this.pressure = pressure;
            return this;
        }

        private int humidityPercentage;

        public Builder setHumidityPercentage(int humidityPercentage) {
            this.humidityPercentage = humidityPercentage;
            return this;
        }

        public AtmosphericInformation build() {
            return new AtmosphericInformation(
                    this.pressure,
                    this.humidityPercentage
            );
        }
    }
}
