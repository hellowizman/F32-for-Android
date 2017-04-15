package com.visuality.f32.weather.data;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class MainInformation {

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

    private double pressure;

    public double getPressure() {
        return pressure;
    }

    private int humidityPercentage;

    public int getHumidityPercentage() {
        return humidityPercentage;
    }

    private double seaLevel;

    public double getSeaLevel() {
        return seaLevel;
    }

    private double groundLevel;

    public double getGroundLevel() {
        return groundLevel;
    }

    public MainInformation(
            double currentTemperature,
            double minimumTemperature,
            double maximumTemperature,
            double pressure,
            int humidityPercentage,
            double seaLevel,
            double groundLevel
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

        /**
         * Initialize pressure.
         */

        this.pressure = pressure;

        /**
         * Initialize humidity percentage.
         */

        this.humidityPercentage = humidityPercentage;

        /**
         * Initialize sea level.
         */

        this.seaLevel = seaLevel;

        /**
         * Initialize ground level.
         */

        this.groundLevel = groundLevel;
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

        private double seaLevel;

        public Builder setSeaLevel(double seaLevel) {
            this.seaLevel = seaLevel;
            return this;
        }

        private double groundLevel;

        public Builder setGroundLevel(double groundLevel) {
            this.groundLevel = groundLevel;
            return this;
        }

        public MainInformation build() {
            return new MainInformation(
                    this.currentTemperature,
                    this.minimumTemperature,
                    this.maximumTemperature,
                    this.pressure,
                    this.humidityPercentage,
                    this.seaLevel,
                    this.groundLevel
            );
        }
    }
}
