package com.visuality.f32.weather.data.entity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class Weather extends BaseEntity {

    public static Weather fromJson(JSONObject jsonObject) {
        /**
         * Obtain navigation information.
         */

        NavigationInformation navigationInformation = NavigationInformation.fromJson(jsonObject);

        /**
         * Obtain temperature information.
         */

        TemperatureInformation temperatureInformation = TemperatureInformation.fromJson(jsonObject);

        /**
         * Obtain light information.
         */

        LightInformation lightInformation = LightInformation.fromJson(jsonObject);

        /**
         * Obtain wind information.
         */

        WindInformation windInformation = WindInformation.fromJson(jsonObject);

        /**
         * Obtain cloudiness information.
         */

        CloudinessInformation cloudinessInformation = CloudinessInformation.fromJson(jsonObject);

        /**
         * Obtain rain information.
         */

        RainInformation rainInformation = RainInformation.fromJson(jsonObject);

        /**
         * Obtain snow information.
         */

        SnowInformation snowInformation = SnowInformation.fromJson(jsonObject);

        /**
         * Obtain weather timestamp.
         */

        long weatherTimestamp = 0;

        try {
            weatherTimestamp = jsonObject.getLong("dt");
        } catch (JSONException exception) {
        }

        /**
         * Obtain result object.
         */

        final Weather resultObject = new Weather.Builder()
                .setNavigationInformation(navigationInformation)
                .setTemperatureInformation(temperatureInformation)
                .setLightInformation(lightInformation)
                .setWindInformation(windInformation)
                .setCloudinessInformation(cloudinessInformation)
                .setRainInformation(rainInformation)
                .setSnowInformation(snowInformation)
                .setWeatherTimestamp(weatherTimestamp)
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

    private NavigationInformation navigationInformation;

    public NavigationInformation getNavigationInformation() {
        return navigationInformation;
    }

    private TemperatureInformation temperatureInformation;

    public TemperatureInformation getTemperatureInformation() {
        return temperatureInformation;
    }

    private LightInformation lightInformation;

    public LightInformation getLightInformation() {
        return lightInformation;
    }

    private WindInformation windInformation;

    public WindInformation getWindInformation() {
        return windInformation;
    }

    private CloudinessInformation cloudinessInformation;

    public CloudinessInformation getCloudinessInformation() {
        return cloudinessInformation;
    }

    private RainInformation rainInformation;

    public RainInformation getRainInformation() {
        return rainInformation;
    }

    private SnowInformation snowInformation;

    public SnowInformation getSnowInformation() {
        return snowInformation;
    }

    private long weatherTimestamp;

    public long getWeatherTimestamp() {
        return weatherTimestamp;
    }

    public Weather(
            NavigationInformation navigationInformation,
            TemperatureInformation temperatureInformation,
            LightInformation lightInformation,
            WindInformation windInformation,
            CloudinessInformation cloudinessInformation,
            RainInformation rainInformation,
            SnowInformation snowInformation,
            long weatherTimestamp
    ) {
        super();

        /**
         * Initialize navigation information.
         */

        this.navigationInformation = navigationInformation;

        /**
         * Initialize temperature information.
         */

        this.temperatureInformation = temperatureInformation;

        /**
         * Initialize light information.
         */

        this.lightInformation = lightInformation;

        /**
         * Initialize wind information.
         */

        this.windInformation = windInformation;

        /**
         * Initialize cloudiness information.
         */

        this.cloudinessInformation = cloudinessInformation;

        /**
         * Initialize rain information.
         */

        this.rainInformation = rainInformation;

        /**
         * Initialize snow information.
         */

        this.snowInformation = snowInformation;

        /**
         * Initialize weather timestamp.
         */

        this.weatherTimestamp = weatherTimestamp;
    }

    public static final class Builder {

        private NavigationInformation navigationInformation;

        public Builder setNavigationInformation(NavigationInformation navigationInformation) {
            this.navigationInformation = navigationInformation;
            return this;
        }

        private TemperatureInformation temperatureInformation;

        public Builder setTemperatureInformation(TemperatureInformation temperatureInformation) {
            this.temperatureInformation = temperatureInformation;
            return this;
        }

        private LightInformation lightInformation;

        public Builder setLightInformation(LightInformation lightInformation) {
            this.lightInformation = lightInformation;
            return this;
        }

        private WindInformation windInformation;

        public Builder setWindInformation(WindInformation windInformation) {
            this.windInformation = windInformation;
            return this;
        }

        private CloudinessInformation cloudinessInformation;

        public Builder setCloudinessInformation(CloudinessInformation cloudinessInformation) {
            this.cloudinessInformation = cloudinessInformation;
            return this;
        }

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

        private long weatherTimestamp;

        public Builder setWeatherTimestamp(long weatherTimestamp) {
            this.weatherTimestamp = weatherTimestamp;
            return this;
        }

        public Weather build() {
            return new Weather(
                    this.navigationInformation,
                    this.temperatureInformation,
                    this.lightInformation,
                    this.windInformation,
                    this.cloudinessInformation,
                    this.rainInformation,
                    this.snowInformation,
                    this.weatherTimestamp
            );
        }
    }
}
