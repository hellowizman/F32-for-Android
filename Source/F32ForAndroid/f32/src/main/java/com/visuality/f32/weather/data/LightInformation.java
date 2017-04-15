package com.visuality.f32.weather.data;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class LightInformation {

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
