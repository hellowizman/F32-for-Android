package com.visuality.f32.weather.manager;

import com.visuality.f32.weather.data.entity.Weather;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class WeatherManager {

    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }

    public WeatherManager(String apiKey) {
        super();

        /**
         * Initialize API key.
         */

        this.apiKey = apiKey;
    }

    public void getCurrentWeather(
            double latitude,
            double longitude,
            CurrentWeatherHandler handler
    ) {
        // TODO: Implement request here.
    }

    public interface CurrentWeatherHandler {

        void onReceivedCurrentWeather(
                WeatherManager manager,
                Weather weather
        );

        void onFailedToReceiveCurrentWeather(
                WeatherManager manager
        );
    }
}
