package com.visuality.f32.weather.data;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class Coordinate {

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
