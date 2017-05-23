package com.visuality.f32.weather.data.entity;

import org.json.JSONObject;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class PrecipitationInformation {

    public static PrecipitationInformation fromJson(JSONObject jsonObject) {
        /**
         * Obtain rain information.
         */

        RainInformation rainInformation = RainInformation.fromJson(jsonObject);

        /**
         * Snow information.
         */

        SnowInformation snowInformation = SnowInformation.fromJson(jsonObject);

        /**
         * Obtain result object.
         */

        final PrecipitationInformation resultObject = new PrecipitationInformation.Builder()
                .setRainInformation(rainInformation)
                .setSnowInformation(snowInformation)
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

    private RainInformation rainInformation;

    public RainInformation getRainInformation() {
        return rainInformation;
    }

    private SnowInformation snowInformation;

    public SnowInformation getSnowInformation() {
        return snowInformation;
    }

    public PrecipitationInformation(
            RainInformation rainInformation,
            SnowInformation snowInformation
    ) {
        super();

        /**
         * Initialize rain information.
         */

        this.rainInformation = rainInformation;

        /**
         * Initialize snow information.
         */

        this.snowInformation = snowInformation;
    }

    public static final class Builder {

        private RainInformation rainInformation;

        public Builder setRainInformation(RainInformation rainInformation) {
            this.rainInformation = rainInformation;
            return this;
        }

        private SnowInformation snowInformation;

        public Builder setSnowInformation(SnowInformation snowInformation) {
            this.snowInformation = snowInformation;
            return this;
        }

        public PrecipitationInformation build() {
            return new PrecipitationInformation(
                    this.rainInformation,
                    this.snowInformation
            );
        }
    }
}
