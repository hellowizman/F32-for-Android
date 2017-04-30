package com.visuality.f32.networking.api;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestHandle;
import com.loopj.android.http.RequestParams;
import com.visuality.f32.networking.definitions.UrlDefinitions;
import com.visuality.f32.networking.url.UrlFactory;
import com.visuality.f32.weather.data.entity.Forecast;
import com.visuality.f32.weather.data.entity.Weather;

import org.json.JSONArray;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public final class ApiClient {

    public ApiClient() {
        super();
    }

    public RequestHandle getCurrentWeatherByCoordinates(
            double latitude,
            double longitude,
            String apiKey,
            final CurrentWeatherRequestHandler handler
    ) {
        /**
         * Obtain URL.
         */

        final UrlFactory urlFactory = new UrlFactory(
                UrlDefinitions.BASE_URL
        );

        final String url = urlFactory.getAbsoluteUrl(
                UrlDefinitions.RELATIVE_PATH_TO_CURRENT_WEATHER
        );

        /**
         * Obtain parameters.
         */

        final RequestParams parameters = new RequestParams();
        parameters.put("lat", latitude);
        parameters.put("lon", longitude);
        parameters.put("appid", apiKey);

        /**
         * Create response handler.
         */

        final JsonHttpResponseHandler responseHandler = new JsonHttpResponseHandler() {

            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                /**
                 * Obtain weather.
                 */

                final Weather weather = Weather.fromJson(response);

                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithSuccess(
                            ApiClient.this,
                            weather
                    );
                }
            }

            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }
        };

        /**
         * Start request.
         */

        final AsyncHttpClient httpClient = new AsyncHttpClient();
        final RequestHandle request = httpClient.get(
                url,
                parameters,
                responseHandler
        );

        /**
         * Return result.
         */

        return request;
    }

    public RequestHandle getCurrentWeatherByCityName(
            String cityName,
            String apiKey,
            final CurrentWeatherRequestHandler handler
    ) {
        /**
         * Obtain URL.
         */

        final UrlFactory urlFactory = new UrlFactory(
                UrlDefinitions.BASE_URL
        );

        final String url = urlFactory.getAbsoluteUrl(
                UrlDefinitions.RELATIVE_PATH_TO_CURRENT_WEATHER
        );

        /**
         * Obtain parameters.
         */

        final RequestParams parameters = new RequestParams();
        parameters.put("q", cityName);
        parameters.put("appid", apiKey);

        /**
         * Create response handler.
         */

        final JsonHttpResponseHandler responseHandler = new JsonHttpResponseHandler() {

            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                /**
                 * Obtain weather.
                 */

                final Weather weather = Weather.fromJson(response);

                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithSuccess(
                            ApiClient.this,
                            weather
                    );
                }
            }

            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }
        };

        /**
         * Start request.
         */

        final AsyncHttpClient httpClient = new AsyncHttpClient();
        final RequestHandle request = httpClient.get(
                url,
                parameters,
                responseHandler
        );

        /**
         * Return result.
         */

        return request;
    }

    public RequestHandle getCurrentWeatherByCityId(
            int cityId,
            String apiKey,
            final CurrentWeatherRequestHandler handler
    ) {
        /**
         * Obtain URL.
         */

        final UrlFactory urlFactory = new UrlFactory(
                UrlDefinitions.BASE_URL
        );

        final String url = urlFactory.getAbsoluteUrl(
                UrlDefinitions.RELATIVE_PATH_TO_CURRENT_WEATHER
        );

        /**
         * Obtain parameters.
         */

        final RequestParams parameters = new RequestParams();
        parameters.put("id", cityId);
        parameters.put("appid", apiKey);

        /**
         * Create response handler.
         */

        final JsonHttpResponseHandler responseHandler = new JsonHttpResponseHandler() {

            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                /**
                 * Obtain weather.
                 */

                final Weather weather = Weather.fromJson(response);

                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithSuccess(
                            ApiClient.this,
                            weather
                    );
                }
            }

            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }
        };

        /**
         * Start request.
         */

        final AsyncHttpClient httpClient = new AsyncHttpClient();
        final RequestHandle request = httpClient.get(
                url,
                parameters,
                responseHandler
        );

        /**
         * Return result.
         */

        return request;
    }

    public RequestHandle getCurrentWeatherByZipCode(
            String zipCode,
            String apiKey,
            final CurrentWeatherRequestHandler handler
    ) {
        /**
         * Obtain URL.
         */

        final UrlFactory urlFactory = new UrlFactory(
                UrlDefinitions.BASE_URL
        );

        final String url = urlFactory.getAbsoluteUrl(
                UrlDefinitions.RELATIVE_PATH_TO_CURRENT_WEATHER
        );

        /**
         * Obtain parameters.
         */

        final RequestParams parameters = new RequestParams();
        parameters.put("zip", zipCode);
        parameters.put("appid", apiKey);

        /**
         * Create response handler.
         */

        final JsonHttpResponseHandler responseHandler = new JsonHttpResponseHandler() {

            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                /**
                 * Obtain weather.
                 */

                final Weather weather = Weather.fromJson(response);

                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithSuccess(
                            ApiClient.this,
                            weather
                    );
                }
            }

            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }
        };

        /**
         * Start request.
         */

        final AsyncHttpClient httpClient = new AsyncHttpClient();
        final RequestHandle request = httpClient.get(
                url,
                parameters,
                responseHandler
        );

        /**
         * Return result.
         */

        return request;
    }

    public RequestHandle getFiveDayForecastByCoordinates(
            double latitude,
            double longitude,
            String apiKey,
            final ForecastRequestHandler handler
    ) {
        /**
         * Obtain URL.
         */

        final UrlFactory urlFactory = new UrlFactory(
                UrlDefinitions.BASE_URL
        );

        final String url = urlFactory.getAbsoluteUrl(
                UrlDefinitions.RELATIVE_PATH_TO_FORECAST
        );

        /**
         * Obtain parameters.
         */

        final RequestParams parameters = new RequestParams();
        parameters.put("lat", latitude);
        parameters.put("lon", longitude);
        parameters.put("appid", apiKey);

        /**
         * Create response handler.
         */

        final JsonHttpResponseHandler responseHandler = new JsonHttpResponseHandler() {

            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                /**
                 * Obtain forecast.
                 */

                final Forecast forecast = Forecast.fromJson(response);

                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithSuccess(
                            ApiClient.this,
                            forecast
                    );
                }
            }

            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }
        };

        /**
         * Start request.
         */

        final AsyncHttpClient httpClient = new AsyncHttpClient();
        final RequestHandle request = httpClient.get(
                url,
                parameters,
                responseHandler
        );

        /**
         * Return result.
         */

        return request;
    }

    public RequestHandle getFiveDayForecastByCityName(
            String cityName,
            String apiKey,
            final ForecastRequestHandler handler
    ) {
        /**
         * Obtain URL.
         */

        final UrlFactory urlFactory = new UrlFactory(
                UrlDefinitions.BASE_URL
        );

        final String url = urlFactory.getAbsoluteUrl(
                UrlDefinitions.RELATIVE_PATH_TO_FORECAST
        );

        /**
         * Obtain parameters.
         */

        final RequestParams parameters = new RequestParams();
        parameters.put("q", cityName);
        parameters.put("appid", apiKey);

        /**
         * Create response handler.
         */

        final JsonHttpResponseHandler responseHandler = new JsonHttpResponseHandler() {

            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                /**
                 * Obtain forecast.
                 */

                final Forecast forecast = Forecast.fromJson(response);

                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithSuccess(
                            ApiClient.this,
                            forecast
                    );
                }
            }

            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }
        };

        /**
         * Start request.
         */

        final AsyncHttpClient httpClient = new AsyncHttpClient();
        final RequestHandle request = httpClient.get(
                url,
                parameters,
                responseHandler
        );

        /**
         * Return result.
         */

        return request;
    }

    public RequestHandle getFiveDayForecastByCityId(
            int cityId,
            String apiKey,
            final ForecastRequestHandler handler
    ) {
        /**
         * Obtain URL.
         */

        final UrlFactory urlFactory = new UrlFactory(
                UrlDefinitions.BASE_URL
        );

        final String url = urlFactory.getAbsoluteUrl(
                UrlDefinitions.RELATIVE_PATH_TO_FORECAST
        );

        /**
         * Obtain parameters.
         */

        final RequestParams parameters = new RequestParams();
        parameters.put("id", cityId);
        parameters.put("appid", apiKey);

        /**
         * Create response handler.
         */

        final JsonHttpResponseHandler responseHandler = new JsonHttpResponseHandler() {

            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                /**
                 * Obtain forecast.
                 */

                final Forecast forecast = Forecast.fromJson(response);

                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithSuccess(
                            ApiClient.this,
                            forecast
                    );
                }
            }

            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }
        };

        /**
         * Start request.
         */

        final AsyncHttpClient httpClient = new AsyncHttpClient();
        final RequestHandle request = httpClient.get(
                url,
                parameters,
                responseHandler
        );

        /**
         * Return result.
         */

        return request;
    }

    public RequestHandle getFiveDayForecastByZipCode(
            String zipCode,
            String apiKey,
            final ForecastRequestHandler handler
    ) {
        /**
         * Obtain URL.
         */

        final UrlFactory urlFactory = new UrlFactory(
                UrlDefinitions.BASE_URL
        );

        final String url = urlFactory.getAbsoluteUrl(
                UrlDefinitions.RELATIVE_PATH_TO_FORECAST
        );

        /**
         * Obtain parameters.
         */

        final RequestParams parameters = new RequestParams();
        parameters.put("zip", zipCode);
        parameters.put("appid", apiKey);

        /**
         * Create response handler.
         */

        final JsonHttpResponseHandler responseHandler = new JsonHttpResponseHandler() {

            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                /**
                 * Obtain forecast.
                 */

                final Forecast forecast = Forecast.fromJson(response);

                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithSuccess(
                            ApiClient.this,
                            forecast
                    );
                }
            }

            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                /**
                 * Share event.
                 */

                if (handler != null) {
                    handler.onFinishedRequestWithError(
                            ApiClient.this
                    );
                }
            }
        };

        /**
         * Start request.
         */

        final AsyncHttpClient httpClient = new AsyncHttpClient();
        final RequestHandle request = httpClient.get(
                url,
                parameters,
                responseHandler
        );

        /**
         * Return result.
         */

        return request;
    }

    public interface CurrentWeatherRequestHandler {

        void onFinishedRequestWithSuccess(ApiClient apiClient, Weather weather);

        void onFinishedRequestWithError(ApiClient apiClient);
    }

    public interface ForecastRequestHandler {

        void onFinishedRequestWithSuccess(ApiClient apiClient, Forecast forecast);

        void onFinishedRequestWithError(ApiClient apiClient);
    }
}
