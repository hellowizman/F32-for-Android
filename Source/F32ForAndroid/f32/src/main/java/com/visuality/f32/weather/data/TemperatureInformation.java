package com.visuality.f32.weather.data;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class TemperatureInformation {

    private double currentTemperature;

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    private double minimumTemperature;

    public double getMinimumTemperature() {
        return minimumTemperature;
    }

    private double maximumTemperature;

    public double getMaximumTemperature() {
        return maximumTemperature;
    }

    public TemperatureInformation(
            double currentTemperature,
            double minimumTemperature,
            double maximumTemperature
    ) {
        super();

        /**
         * Initialize current temperature.
         */

        this.currentTemperature = currentTemperature;

        /**
         * Initialize minimum temperature.
         */

        this.minimumTemperature = minimumTemperature;

        /**
         * Initialize maximum temperature.
         */

        this.maximumTemperature = maximumTemperature;
    }

    public static final class Builder {

        private double currentTemperature;

        public Builder setCurrentTemperature(double currentTemperature) {
            this.currentTemperature = currentTemperature;
            return this;
        }

        private double minimumTemperature;

        public Builder setMinimumTemperature(double minimumTemperature) {
            this.minimumTemperature = minimumTemperature;
            return this;
        }

        private double maximumTemperature;

        public Builder setMaximumTemperature(double maximumTemperature) {
            this.maximumTemperature = maximumTemperature;
            return this;
        }

        public TemperatureInformation build() {
            return new TemperatureInformation(
                    this.currentTemperature,
                    this.minimumTemperature,
                    this.maximumTemperature
            );
        }
    }
}
