package com.visuality.f32.weather.data;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class WindInformation {

    private double speed;

    public double getSpeed() {
        return speed;
    }

    private double direction;

    public double getDirection() {
        return direction;
    }

    public WindInformation(
            double speed,
            double direction
    ) {
        super();

        /**
         * Initialize speed.
         */

        this.speed = speed;

        /**
         * Initialize direction.
         */

        this.direction = direction;
    }

    public static final class Builder {

        private double speed;

        public Builder setSpeed(double speed) {
            this.speed = speed;
            return this;
        }

        private double direction;

        public Builder setDirection(double direction) {
            this.direction = direction;
            return this;
        }

        public WindInformation build() {
            return new WindInformation(
                    this.speed,
                    this.direction
            );
        }
    }
}
