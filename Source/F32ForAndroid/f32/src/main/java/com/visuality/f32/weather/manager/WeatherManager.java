package com.visuality.f32.weather.manager;

import com.visuality.f32.networking.api.ApiClient;
import com.visuality.f32.weather.data.entity.Weather;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public final class WeatherManager {

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
            final CurrentWeatherHandler handler
    ) {
        /**
         * Create request handler.
         */

        final ApiClient.GetCurrentWeatherRequestHandler requestHandler = new ApiClient.GetCurrentWeatherRequestHandler() {
            @Override
            public void onFinishedRequestWithSuccess(ApiClient apiClient, Weather weather) {
                if (handler != null) {
                    handler.onReceivedCurrentWeather(
                            WeatherManager.this,
                            weather
                    );
                }
            }

            @Override
            public void onFinishedRequestWithError(ApiClient apiClient) {
                if (handler != null) {
                    handler.onFailedToReceiveCurrentWeather(
                            WeatherManager.this
                    );
                }
            }
        };

        /**
         * Start request.
         */

        final ApiClient apiClient = new ApiClient();

        apiClient.getCurrentWeather(
                latitude,
                longitude,
                apiKey,
                requestHandler
        );
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
