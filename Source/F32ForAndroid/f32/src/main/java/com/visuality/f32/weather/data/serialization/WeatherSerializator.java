package com.visuality.f32.weather.data.serialization;

import com.visuality.f32.weather.data.entity.Weather;

import org.json.JSONObject;

/**
 * Created by igormatyushkin on 15.04.17.
 */

class WeatherSerializator {

    public static Weather getWeatherFromJsonObject(JSONObject jsonObject) {
        return (Weather) Weather.fromJson(jsonObject);
    }
}
