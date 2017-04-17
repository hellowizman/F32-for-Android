package com.visuality.f32.weather.data.entity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class CloudinessInformation extends BaseEntity {

    public static CloudinessInformation fromJson(JSONObject jsonObject) {
        /**
         * Obtain cloudiness percentage.
         */

        int cloudinessPercentage = 0;

        try {
            cloudinessPercentage = jsonObject.getJSONObject("clouds")
                    .getInt("all");
        } catch (JSONException exception) {
        }

        /**
         * Obtain result object.
         */

        final CloudinessInformation resultObject = new CloudinessInformation.Builder()
                .setCloudiness(cloudinessPercentage)
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

    private int percentage;

    public int getPercentage() {
        return percentage;
    }

    public CloudinessInformation(
            int percentage
    ) {
        super();

        /**
         * Initialize cloudiness percentage.
         */

        this.percentage = percentage;
    }

    public static final class Builder {

        private int cloudiness;

        public Builder setCloudiness(int cloudiness) {
            this.cloudiness = cloudiness;
            return this;
        }

        public CloudinessInformation build() {
            return new CloudinessInformation(
                    this.cloudiness
            );
        }
    }
}
