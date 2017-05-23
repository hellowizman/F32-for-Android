package com.visuality.f32.weather.data.entity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class AtmosphericInformation extends BaseEntity {

    public static AtmosphericInformation fromJson(JSONObject jsonObject) {
        /**
         * Obtain pressure.
         */

        long pressure = 0;

        try {
            pressure = jsonObject.getJSONObject("main")
                    .getLong("pressure");
        } catch (JSONException exception) {
        }

        /**
         * Obtain humidity percentage.
         */

        int humidityPercentage = 0;

        try {
            humidityPercentage = jsonObject.getJSONObject("main")
                    .getInt("humidity");
        } catch (JSONException exception) {
        }

        /**
         * Obtain result object.
         */

        final AtmosphericInformation resultObject = new AtmosphericInformation.Builder()
                .setPressure(pressure)
                .setHumidityPercentage(humidityPercentage)
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

    private long pressure;

    public long getPressure() {
        return pressure;
    }

    private int humidityPercentage;

    public int getHumidityPercentage() {
        return humidityPercentage;
    }

    public AtmosphericInformation(
            long pressure,
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

    private AtmosphericInformation() {
        super();
    }

    public static final class Builder {

        private long pressure;

        public Builder setPressure(long pressure) {
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
