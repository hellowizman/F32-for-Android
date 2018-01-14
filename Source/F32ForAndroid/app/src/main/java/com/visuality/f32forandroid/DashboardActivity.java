package com.visuality.f32forandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.visuality.f32.weather.data.entity.Weather;
import com.visuality.f32.weather.manager.WeatherManager;

public class DashboardActivity extends AppCompatActivity {

    private static final String API_KEY = "1234567890";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        /**
         * Test weather manager.
         */

        new WeatherManager(API_KEY).getCurrentWeatherByCoordinates(
                47.2257,
                38.9383,
                new WeatherManager.CurrentWeatherHandler() {
                    @Override
                    public void onReceivedCurrentWeather(WeatherManager manager, Weather weather) {
                    }

                    @Override
                    public void onFailedToReceiveCurrentWeather(WeatherManager manager) {
                    }
                }
        );
    }
}
