package com.visuality.f32.weather.data.entity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class RainInformation extends BaseEntity {

    public static RainInformation fromJson(JSONObject jsonObject) {
        /**
         * Obtain three hours volume.
         */

        double threeHoursVolume = 0.0;

        try {
            threeHoursVolume = jsonObject.getJSONObject("rain")
                    .getDouble("3h");
        } catch (JSONException exception) {
        }

        /**
         * Obtain result object.
         */

        final RainInformation resultObject = new RainInformation.Builder()
                .setThreeHoursVolume(threeHoursVolume)
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

    private double threeHoursVolume;

    public double getThreeHoursVolume() {
        return threeHoursVolume;
    }

    public RainInformation(
            double threeHoursVolume
    ) {
        super();

        /**
         * Initialize three hours volume.
         */

        this.threeHoursVolume = threeHoursVolume;
    }

    public static final class Builder {

        private double threeHoursVolume;

        public Builder setThreeHoursVolume(double threeHoursVolume) {
            this.threeHoursVolume = threeHoursVolume;
            return this;
        }

        public RainInformation build() {
            return new RainInformation(
                    this.threeHoursVolume
            );
        }
    }
}
