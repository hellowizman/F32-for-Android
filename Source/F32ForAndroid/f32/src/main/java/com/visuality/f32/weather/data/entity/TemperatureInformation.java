package com.visuality.f32.weather.data.entity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class TemperatureInformation extends BaseEntity {

    public static TemperatureInformation fromJson(JSONObject jsonObject) {
        /**
         * Obtain current temperature.
         */

        double currentTemperature = 0.0;

        try {
            currentTemperature = jsonObject.getJSONObject("main")
                    .getDouble("temp");
        } catch (JSONException exception) {
        }

        /**
         * Obtain minimum temperature.
         */

        double minimumTemperature = 0.0;

        try {
            minimumTemperature = jsonObject.getJSONObject("main")
                    .getDouble("temp_min");
        } catch (JSONException exception) {
        }

        /**
         * Obtain maximum temperature.
         */

        double maximumTemperature = 0.0;

        try {
            maximumTemperature = jsonObject.getJSONObject("main")
                    .getDouble("temp_max");
        } catch (JSONException exception) {
        }

        /**
         * Obtain result object.
         */

        final TemperatureInformation resultObject = new TemperatureInformation.Builder()
                .setCurrentTemperature(currentTemperature)
                .setMinimumTemperature(minimumTemperature)
                .setMaximumTemperature(maximumTemperature)
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

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
