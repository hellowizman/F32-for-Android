package com.visuality.f32.weather.data.entity;

import com.visuality.f32.temperature.Temperature;
import com.visuality.f32.temperature.TemperatureUnit;

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

        double currentTemperatureInKelvin = 0.0;

        try {
            currentTemperatureInKelvin = jsonObject.getJSONObject("main")
                    .getDouble("temp");
        } catch (JSONException exception) {
        }

        final Temperature currentTemperature = new Temperature(
                currentTemperatureInKelvin,
                TemperatureUnit.KELVIN
        );

        /**
         * Obtain minimum temperature.
         */

        double minimumTemperatureInKelvin = 0.0;

        try {
            minimumTemperatureInKelvin = jsonObject.getJSONObject("main")
                    .getDouble("temp_min");
        } catch (JSONException exception) {
        }

        final Temperature minimumTemperature = new Temperature(
                minimumTemperatureInKelvin,
                TemperatureUnit.KELVIN
        );

        /**
         * Obtain maximum temperature.
         */

        double maximumTemperatureInKelvin = 0.0;

        try {
            maximumTemperatureInKelvin = jsonObject.getJSONObject("main")
                    .getDouble("temp_max");
        } catch (JSONException exception) {
        }

        final Temperature maximumTemperature = new Temperature(
                maximumTemperatureInKelvin,
                TemperatureUnit.KELVIN
        );

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

    private Temperature current;

    public Temperature getCurrent() {
        return current;
    }

    private Temperature minimum;

    public Temperature getMinimum() {
        return minimum;
    }

    private Temperature maximum;

    public Temperature getMaximum() {
        return maximum;
    }

    public TemperatureInformation(
            Temperature current,
            Temperature minimum,
            Temperature maximum
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

        private Temperature current;

        public Builder setCurrent(Temperature current) {
            this.current = current;
            return this;
        }

        private Temperature minimum;

        public Builder setMinimum(Temperature minimum) {
            this.minimum = minimum;
            return this;
        }

        private Temperature maximum;

        public Builder setMaximum(Temperature maximum) {
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
