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
                .setCloudinessPercentage(cloudinessPercentage)
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

    private int cloudinessPercentage;

    public int getCloudinessPercentage() {
        return cloudinessPercentage;
    }

    public CloudinessInformation(
            int cloudinessPercentage
    ) {
        super();

        /**
         * Initialize cloudiness percentage.
         */

        this.cloudinessPercentage = cloudinessPercentage;
    }

    public static final class Builder {

        private int cloudinessPercentage;

        public Builder setCloudinessPercentage(int cloudinessPercentage) {
            this.cloudinessPercentage = cloudinessPercentage;
            return this;
        }

        public CloudinessInformation build() {
            return new CloudinessInformation(
                    this.cloudinessPercentage
            );
        }
    }
}
