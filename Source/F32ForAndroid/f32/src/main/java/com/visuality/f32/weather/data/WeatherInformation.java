package com.visuality.f32.weather.data;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class WeatherInformation {

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

    public WeatherInformation(
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

        public Builder getCloudinessInformation(CloudinessInformation cloudinessInformation) {
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

        public WeatherInformation build() {
            return new WeatherInformation(
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
