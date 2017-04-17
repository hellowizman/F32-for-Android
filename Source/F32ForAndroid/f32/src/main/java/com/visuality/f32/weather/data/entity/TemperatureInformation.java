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
                .setCurrent(currentTemperature)
                .setMinimum(minimumTemperature)
                .setMaximum(maximumTemperature)
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

    private double current;

    public double getCurrent() {
        return current;
    }

    private double minimum;

    public double getMinimum() {
        return minimum;
    }

    private double maximum;

    public double getMaximum() {
        return maximum;
    }

    public TemperatureInformation(
            double current,
            double minimum,
            double maximum
    ) {
        super();

        /**
         * Initialize current temperature.
         */

        this.current = current;

        /**
         * Initialize minimum temperature.
         */

        this.minimum = minimum;

        /**
         * Initialize maximum temperature.
         */

        this.maximum = maximum;
    }

    public static final class Builder {

        private double current;

        public Builder setCurrent(double current) {
            this.current = current;
            return this;
        }

        private double minimum;

        public Builder setMinimum(double minimum) {
            this.minimum = minimum;
            return this;
        }

        private double maximum;

        public Builder setMaximum(double maximum) {
            this.maximum = maximum;
            return this;
        }

        public TemperatureInformation build() {
            return new TemperatureInformation(
                    this.current,
                    this.minimum,
                    this.maximum
            );
        }
    }
}
