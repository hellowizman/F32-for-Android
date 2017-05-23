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
                .setNavigation(navigationInformation)
                .setTemperature(temperatureInformation)
                .setLight(lightInformation)
                .setWind(windInformation)
                .setCloudiness(cloudinessInformation)
                .setRain(rainInformation)
                .setSnow(snowInformation)
                .setWeatherTimestamp(weatherTimestamp)
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

    private NavigationInformation navigation;

    public NavigationInformation getNavigation() {
        return navigation;
    }

    private TemperatureInformation temperature;

    public TemperatureInformation getTemperature() {
        return temperature;
    }

    private LightInformation light;

    public LightInformation getLight() {
        return light;
    }

    private WindInformation wind;

    public WindInformation getWind() {
        return wind;
    }

    private CloudinessInformation cloudiness;

    public CloudinessInformation getCloudiness() {
        return cloudiness;
    }

    private RainInformation rain;

    public RainInformation getRain() {
        return rain;
    }

    private SnowInformation snow;

    public SnowInformation getSnow() {
        return snow;
    }

    private long weatherTimestamp;

    public long getWeatherTimestamp() {
        return weatherTimestamp;
    }

    public Weather(
            NavigationInformation navigation,
            TemperatureInformation temperature,
            LightInformation light,
            WindInformation wind,
            CloudinessInformation cloudiness,
            RainInformation rain,
            SnowInformation snow,
            long weatherTimestamp
    ) {
        super();

        /**
         * Initialize navigation information.
         */

        this.navigation = navigation;

        /**
         * Initialize temperature information.
         */

        this.temperature = temperature;

        /**
         * Initialize light information.
         */

        this.light = light;

        /**
         * Initialize wind information.
         */

        this.wind = wind;

        /**
         * Initialize cloudiness information.
         */

        this.cloudiness = cloudiness;

        /**
         * Initialize rain information.
         */

        this.rain = rain;

        /**
         * Initialize snow information.
         */

        this.snow = snow;

        /**
         * Initialize weather timestamp.
         */

        this.weatherTimestamp = weatherTimestamp;
    }

    public static final class Builder {

        private NavigationInformation navigation;

        public Builder setNavigation(NavigationInformation navigation) {
            this.navigation = navigation;
            return this;
        }

        private TemperatureInformation temperature;

        public Builder setTemperature(TemperatureInformation temperature) {
            this.temperature = temperature;
            return this;
        }

        private LightInformation light;

        public Builder setLight(LightInformation light) {
            this.light = light;
            return this;
        }

        private WindInformation wind;

        public Builder setWind(WindInformation wind) {
            this.wind = wind;
            return this;
        }

        private CloudinessInformation cloudiness;

        public Builder setCloudiness(CloudinessInformation cloudiness) {
            this.cloudiness = cloudiness;
            return this;
        }

        private RainInformation rain;

        public Builder setRain(RainInformation rain) {
            this.rain = rain;
            return this;
        }

        private SnowInformation snow;

        public Builder setSnow(SnowInformation snow) {
            this.snow = snow;
            return this;
        }

        private long weatherTimestamp;

        public Builder setWeatherTimestamp(long weatherTimestamp) {
            this.weatherTimestamp = weatherTimestamp;
            return this;
        }

        public Weather build() {
            return new Weather(
                    this.navigation,
                    this.temperature,
                    this.light,
                    this.wind,
                    this.cloudiness,
                    this.rain,
                    this.snow,
                    this.weatherTimestamp
            );
        }
    }
}
