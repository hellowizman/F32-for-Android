package com.visuality.f32.weather.manager;

import com.visuality.f32.networking.api.ApiClient;
import com.visuality.f32.weather.data.entity.Forecast;
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

    public void getCurrentWeatherByCoordinates(
            double latitude,
            double longitude,
            final CurrentWeatherHandler handler
    ) {
        /**
         * Create request handler.
         */

        final ApiClient.CurrentWeatherRequestHandler requestHandler = new ApiClient.CurrentWeatherRequestHandler() {
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

        apiClient.getCurrentWeatherByCoordinates(
                latitude,
                longitude,
                this.apiKey,
                requestHandler
        );
    }

    public void getCurrentWeatherByCityName(
            String cityName,
            final CurrentWeatherHandler handler
    ) {
        /**
         * Create request handler.
         */

        final ApiClient.CurrentWeatherRequestHandler requestHandler = new ApiClient.CurrentWeatherRequestHandler() {
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

        apiClient.getCurrentWeatherByCityName(
                cityName,
                this.apiKey,
                requestHandler
        );
    }

    public void getCurrentWeatherByCityId(
            int cityId,
            final CurrentWeatherHandler handler
    ) {
        /**
         * Create request handler.
         */

        final ApiClient.CurrentWeatherRequestHandler requestHandler = new ApiClient.CurrentWeatherRequestHandler() {
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

        apiClient.getCurrentWeatherByCityId(
                cityId,
                this.apiKey,
                requestHandler
        );
    }

    public void getCurrentWeatherByZipCode(
            String zipCode,
            final CurrentWeatherHandler handler
    ) {
        /**
         * Create request handler.
         */

        final ApiClient.CurrentWeatherRequestHandler requestHandler = new ApiClient.CurrentWeatherRequestHandler() {
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

        apiClient.getCurrentWeatherByZipCode(
                zipCode,
                this.apiKey,
                requestHandler
        );
    }

    public void getFiveDayForecastByCoordinates(
            double latitude,
            double longitude,
            final ForecastHandler handler
    ) {
        /**
         * Create request handler.
         */

        final ApiClient.ForecastRequestHandler requestHandler = new ApiClient.ForecastRequestHandler() {

            @Override
            public void onFinishedRequestWithSuccess(ApiClient apiClient, Forecast forecast) {
                if (handler != null) {
                    handler.onReceivedForecast(
                            WeatherManager.this,
                            forecast
                    );
                }
            }

            @Override
            public void onFinishedRequestWithError(ApiClient apiClient) {
                if (handler != null) {
                    handler.onFailedToReceiveForecast(
                            WeatherManager.this
                    );
                }
            }
        };

        /**
         * Start request.
         */

        final ApiClient apiClient = new ApiClient();

        apiClient.getFiveDayForecastByCoordinates(
                latitude,
                longitude,
                this.apiKey,
                requestHandler
        );
    }

    public void getFiveDayForecastByCityName(
            String cityName,
            final ForecastHandler handler
    ) {
        /**
         * Create request handler.
         */

        final ApiClient.ForecastRequestHandler requestHandler = new ApiClient.ForecastRequestHandler() {

            @Override
            public void onFinishedRequestWithSuccess(ApiClient apiClient, Forecast forecast) {
                if (handler != null) {
                    handler.onReceivedForecast(
                            WeatherManager.this,
                            forecast
                    );
                }
            }

            @Override
            public void onFinishedRequestWithError(ApiClient apiClient) {
                if (handler != null) {
                    handler.onFailedToReceiveForecast(
                            WeatherManager.this
                    );
                }
            }
        };

        /**
         * Start request.
         */

        final ApiClient apiClient = new ApiClient();

        apiClient.getFiveDayForecastByCityName(
                cityName,
                this.apiKey,
                requestHandler
        );
    }

    public void getFiveDayForecastByCityId(
            int cityId,
            final ForecastHandler handler
    ) {
        /**
         * Create request handler.
         */

        final ApiClient.ForecastRequestHandler requestHandler = new ApiClient.ForecastRequestHandler() {

            @Override
            public void onFinishedRequestWithSuccess(ApiClient apiClient, Forecast forecast) {
                if (handler != null) {
                    handler.onReceivedForecast(
                            WeatherManager.this,
                            forecast
                    );
                }
            }

            @Override
            public void onFinishedRequestWithError(ApiClient apiClient) {
                if (handler != null) {
                    handler.onFailedToReceiveForecast(
                            WeatherManager.this
                    );
                }
            }
        };

        /**
         * Start request.
         */

        final ApiClient apiClient = new ApiClient();

        apiClient.getFiveDayForecastByCityId(
                cityId,
                this.apiKey,
                requestHandler
        );
    }

    public void getFiveDayForecastByZipCode(
            String zipCode,
            final ForecastHandler handler
    ) {
        /**
         * Create request handler.
         */

        final ApiClient.ForecastRequestHandler requestHandler = new ApiClient.ForecastRequestHandler() {

            @Override
            public void onFinishedRequestWithSuccess(ApiClient apiClient, Forecast forecast) {
                if (handler != null) {
                    handler.onReceivedForecast(
                            WeatherManager.this,
                            forecast
                    );
                }
            }

            @Override
            public void onFinishedRequestWithError(ApiClient apiClient) {
                if (handler != null) {
                    handler.onFailedToReceiveForecast(
                            WeatherManager.this
                    );
                }
            }
        };

        /**
         * Start request.
         */

        final ApiClient apiClient = new ApiClient();

        apiClient.getFiveDayForecastByZipCode(
                zipCode,
                this.apiKey,
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

    public interface ForecastHandler {

        void onReceivedForecast(
                WeatherManager manager,
                Forecast forecast
        );

        void onFailedToReceiveForecast(
                WeatherManager manager
        );
    }
}
