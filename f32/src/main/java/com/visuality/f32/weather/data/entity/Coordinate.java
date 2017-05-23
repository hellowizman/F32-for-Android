package com.visuality.f32.weather.data.entity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class Coordinate extends BaseEntity {

    public static Coordinate fromJson(JSONObject jsonObject) {
        /**
         * Obtain latitude.
         */

        double latitude = 0.0;

        try {
            latitude = jsonObject.getJSONObject("coord")
                    .getDouble("lat");
        } catch (JSONException exception) {
        }

        /**
         * Obtain longitude.
         */

        double longitude = 0.0;

        try {
            longitude = jsonObject.getJSONObject("coord")
                    .getDouble("lon");
        } catch (JSONException exception) {
        }

        /**
         * Obtain result object.
         */

        final Coordinate resultObject = new Coordinate.Builder()
                .setLatitude(latitude)
                .setLongitude(longitude)
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

    private double latitude;

    public double getLatitude() {
        return latitude;
    }

    private double longitude;

    public double getLongitude() {
        return longitude;
    }

    public Coordinate(
            double latitude,
            double longitude
    ) {
        super();

        /**
         * Initialize latitude.
         */

        this.latitude = latitude;

        /**
         * Initialize longitude.
         */

        this.longitude = longitude;
    }

    public static final class Builder {

        private double latitude;

        public Builder setLatitude(double latitude) {
            this.latitude = latitude;
            return this;
        }

        private double longitude;

        public Builder setLongitude(double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Coordinate build() {
            return new Coordinate(
                    this.latitude,
                    this.longitude
            );
        }
    }
}
