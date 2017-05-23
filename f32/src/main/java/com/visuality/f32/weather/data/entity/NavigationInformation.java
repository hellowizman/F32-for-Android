package com.visuality.f32.weather.data.entity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class NavigationInformation extends BaseEntity {

    public static NavigationInformation fromJson(JSONObject jsonObject) {
        /**
         * Obtain location name.
         */

        String locationName = null;

        try {
            locationName = jsonObject.getString("name");
        } catch (JSONException exception) {
        }

        /**
         * Obtain coordinate.
         */

        Coordinate coordinate = Coordinate.fromJson(jsonObject);

        /**
         * Obtain sea level.
         */

        double seaLevel = 0.0;

        try {
            seaLevel = jsonObject.getJSONObject("main")
                    .getDouble("sea_level");
        } catch (JSONException exception) {
        }

        /**
         * Obtain ground level.
         */

        double groundLevel = 0.0;

        try {
            groundLevel = jsonObject.getJSONObject("main")
                    .getDouble("grnd_level");
        } catch (JSONException exception) {
        }

        /**
         * Obtain result object.
         */

        final NavigationInformation resultObject = new NavigationInformation.Builder()
                .setLocationName(locationName)
                .setCoordinate(coordinate)
                .setSeaLevel(seaLevel)
                .setGroundLevel(groundLevel)
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

    private String locationName;

    public String getLocationName() {
        return locationName;
    }

    private Coordinate coordinate;

    public Coordinate getCoordinate() {
        return coordinate;
    }

    private double seaLevel;

    public double getSeaLevel() {
        return seaLevel;
    }

    private double groundLevel;

    public double getGroundLevel() {
        return groundLevel;
    }

    public NavigationInformation(
            String locationName,
            Coordinate coordinate,
            double seaLevel,
            double groundLevel
    ) {
        super();

        /**
         * Initialize location name.
         */

        this.locationName = locationName;

        /**
         * Initialize coordinate.
         */

        this.coordinate = coordinate;

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

        private String locationName;

        public Builder setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }

        private Coordinate coordinate;

        public Builder setCoordinate(Coordinate coordinate) {
            this.coordinate = coordinate;
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

        public NavigationInformation build() {
            return new NavigationInformation(
                    this.locationName,
                    this.coordinate,
                    this.seaLevel,
                    this.groundLevel
            );
        }
    }
}
