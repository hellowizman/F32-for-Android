package com.visuality.f32.weather.data.entity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class LightInformation extends BaseEntity {

    public static LightInformation fromJson(JSONObject jsonObject) {
        /**
         * Obtain sunrise timestamp.
         */

        long sunriseTimestamp = 0;

        try {
            sunriseTimestamp = jsonObject.getJSONObject("sys")
                    .getLong("sunrise");
        } catch (JSONException exception) {
        }

        /**
         * Obtain sunset timestamp.
         */

        long sunsetTimestamp = 0;

        try {
            sunsetTimestamp = jsonObject.getJSONObject("sys")
                    .getLong("sunset");
        } catch (JSONException exception) {
        }

        /**
         * Obtain result object.
         */

        final LightInformation resultObject = new LightInformation.Builder()
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

    private long sunriseTimestamp;

    public long getSunriseTimestamp() {
        return sunriseTimestamp;
    }

    private long sunsetTimestamp;

    public long getSunsetTimestamp() {
        return sunsetTimestamp;
    }

    public LightInformation(
            long sunriseTimestamp,
            long sunsetTimestamp
    ) {
        super();

        /**
         * Initialize sunrise timestamp.
         */

        this.sunriseTimestamp = sunriseTimestamp;

        /**
         * Initialize sunset timestamp.
         */

        this.sunsetTimestamp = sunsetTimestamp;
    }

    public static final class Builder {

        private long sunriseTimestamp;

        public Builder setSunriseTimestamp(long sunriseTimestamp) {
            this.sunriseTimestamp = sunriseTimestamp;
            return this;
        }

        private long sunsetTimestamp;

        public Builder setSunsetTimestamp(long sunsetTimestamp) {
            this.sunsetTimestamp = sunsetTimestamp;
            return this;
        }

        public LightInformation build() {
            return new LightInformation(
                    this.sunriseTimestamp,
                    this.sunsetTimestamp
            );
        }
    }
}
