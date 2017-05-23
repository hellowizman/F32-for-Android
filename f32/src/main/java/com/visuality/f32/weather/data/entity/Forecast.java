package com.visuality.f32.weather.data.entity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by igormatyushkin on 23.04.17.
 */

public class Forecast {

    public static Forecast fromJson(JSONObject jsonObject) {
        /**
         * Obtain navigation information.
         */

        JSONObject navigationJsonObject = null;

        try {
            navigationJsonObject = jsonObject.getJSONObject("city");
        } catch (JSONException exception) {
        }

        NavigationInformation navigationInformation = navigationJsonObject == null
                ? null
                : NavigationInformation.fromJson(navigationJsonObject);

        /**
         * Obtain forecast items.
         */

        final ArrayList<Weather> forecastItemsCollection = new ArrayList<Weather>();

        try {
            JSONArray forecastItemsJsonArray = jsonObject.getJSONArray("list");

            final int numberOfForecastItems = forecastItemsJsonArray.length();

            for (int i = 0; i < numberOfForecastItems; i++) {
                /**
                 * Obtain forecast item JSON object.
                 */

                final JSONObject forecastItemJsonObject = forecastItemsJsonArray.getJSONObject(i);

                /**
                 * Obtain temperature information.
                 */

                TemperatureInformation temperatureInformation = TemperatureInformation.fromJson(forecastItemJsonObject);

                /**
                 * Obtain light information.
                 */

                LightInformation lightInformation = null;

                /**
                 * Obtain wind information.
                 */

                WindInformation windInformation = WindInformation.fromJson(forecastItemJsonObject);

                /**
                 * Obtain cloudiness information.
                 */

                CloudinessInformation cloudinessInformation = CloudinessInformation.fromJson(forecastItemJsonObject);

                /**
                 * Obtain rain information.
                 */

                RainInformation rainInformation = RainInformation.fromJson(forecastItemJsonObject);

                /**
                 * Obtain snow information.
                 */

                SnowInformation snowInformation = SnowInformation.fromJson(forecastItemJsonObject);

                /**
                 * Obtain weather timestamp.
                 */

                long weatherTimestamp = 0;

                try {
                    weatherTimestamp = forecastItemJsonObject.getLong("dt");
                } catch (JSONException exception) {
                }

                /**
                 * Obtain forecast item.
                 */

                final Weather forecastItem = new Weather.Builder()
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
                 * Update forecast items collection.
                 */

                forecastItemsCollection.add(forecastItem);
            }
        } catch (JSONException exception) {
        }

        final Weather[] forecastItemsArray = forecastItemsCollection.toArray(
                new Weather[forecastItemsCollection.size()]
        );

        /**
         * Return result.
         */

        return new Forecast.Builder()
                .setForecastItems(forecastItemsArray)
                .build();
    }

    private Weather[] sortedForecastItems;

    public Forecast(Weather[] forecastItems) {
        super();

        /**
         * Initialize sorted weathers array.
         */

        Weather[] copyOfForecastItems = Arrays.copyOf(
                forecastItems,
                forecastItems.length
        );

        Arrays.sort(
                copyOfForecastItems,
                new Comparator<Weather>() {
                    @Override
                    public int compare(Weather o1, Weather o2) {
                        final long differenceBetweenTimestamps = o1.getWeatherTimestamp()
                                - o2.getWeatherTimestamp();
                        return differenceBetweenTimestamps < 0 ? -1 : 1;
                    }
                }
        );

        this.sortedForecastItems = copyOfForecastItems;
    }

    public int getNumberOfTimestamps() {
        return this.sortedForecastItems.length;
    }

    public long getTimestampByIndex(int timestampIndex) {
        if ((timestampIndex < 0) || (timestampIndex >= this.sortedForecastItems.length)) {
            return 0;
        }

        final Weather weather = this.sortedForecastItems[timestampIndex];
        return weather.getWeatherTimestamp();
    }

    public long getEarliestTimestamp() {
        if (this.sortedForecastItems.length == 0) {
            return 0;
        }

        final int firstItemIndex = 0;
        final Weather firstItem = this.sortedForecastItems[firstItemIndex];
        return firstItem.getWeatherTimestamp();
    }

    public long getLatestTimestamp() {
        if (this.sortedForecastItems.length == 0) {
            return 0;
        }

        final int lastItemIndex = this.sortedForecastItems.length - 1;
        final Weather lastItem = this.sortedForecastItems[lastItemIndex];
        return lastItem.getWeatherTimestamp();
    }

    public Weather getWeatherForTimestamp(long timestamp) {
        for (int itemIndex = this.sortedForecastItems.length - 1; itemIndex >= 0; itemIndex--) {
            final Weather weatherForCurrentItemIndex = this.sortedForecastItems[itemIndex];

            if (weatherForCurrentItemIndex.getWeatherTimestamp() <= timestamp) {
                return weatherForCurrentItemIndex;
            }
        }

        return null;
    }

    public static final class Builder {

        private Weather[] forecastItems;

        public Builder setForecastItems(Weather[] forecastItems) {
            this.forecastItems = forecastItems;
            return this;
        }

        public Forecast build() {
            return new Forecast(
                    this.forecastItems
            );
        }
    }
}
