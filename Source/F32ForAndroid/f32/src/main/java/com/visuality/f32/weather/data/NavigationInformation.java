package com.visuality.f32.weather.data;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class NavigationInformation {

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
            Coordinate coordinate,
            double seaLevel,
            double groundLevel
    ) {
        super();

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
                    this.coordinate,
                    this.seaLevel,
                    this.groundLevel
            );
        }
    }
}
