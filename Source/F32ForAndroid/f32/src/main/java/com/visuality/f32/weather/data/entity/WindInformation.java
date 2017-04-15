package com.visuality.f32.weather.data.entity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class WindInformation extends BaseEntity {

    public static WindInformation fromJson(JSONObject jsonObject) {
        /**
         * Obtain speed.
         */

        double speed = 0.0;

        try {
            speed = jsonObject.getJSONObject("wind")
                    .getDouble("speed");
        } catch (JSONException exception) {
        }

        /**
         * Obtain direction.
         */

        double direction = 0.0;

        try {
            direction = jsonObject.getJSONObject("wind")
                    .getDouble("deg");
        } catch (JSONException exception) {
        }

        /**
         * Obtain result object.
         */

        final WindInformation resultObject = new WindInformation.Builder()
                .setSpeed(speed)
                .setDirection(direction)
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

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
