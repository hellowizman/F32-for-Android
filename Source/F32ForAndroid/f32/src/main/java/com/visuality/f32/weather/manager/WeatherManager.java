package com.visuality.f32.weather.manager;

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
}
