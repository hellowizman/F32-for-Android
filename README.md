# F32

<p align="center" >
  <img src="https://github.com/igormatyushkin014/F32-for-Android/raw/master/Images/logo_500_500.png" alt="F32" title="F32">
</p>

<p align="center">
  <a href="http://www.oracle.com/java"><img src="https://img.shields.io/badge/java-7-orange.svg?style=flat"></a>
  <a href="http://android.com"><img src="https://img.shields.io/badge/os-android-green.svg?style=flat"></a>
  <a href="http://tldrlegal.com/license/mit-license"><img src="https://img.shields.io/badge/License-MIT-blue.svg?style=flat"></a>
</p>

## At a Glance

`F32` is a wrapper for [OpenWeatherMap API](http://openweathermap.org/api). It provides developer with super-simple way to obtain weather information by geographic coordinates.

## How To Get Started

- Copy content from `Source/F32ForAndroid/f32/src/main/java/com/visuality/f32` folder to your project.

or

- Use gradle dependency: `compile 'com.visuality.f32forandroid:f32:1.1'`

## Requirements

* Android Studio 2.3 or later
* Java 7 or later
* Android 4.0.3 or later

## Usage

### Preparations

First of all, sign up [here](http://openweathermap.org) and get API key (if you don't already have one).

Also, don't forget to append `INTERNET` permission to your application's manifest file:

```xml
<uses-permission android:name="android.permission.INTERNET"/>
```

### Current weather

Below you can see how to make request for current weather:

```java
new WeatherManager("INSERT_YOUR_API_KEY_HERE").getCurrentWeather(
        47.2257, // latitude
        38.9383, // longitude
        new WeatherManager.CurrentWeatherHandler() {
            @Override
            public void onReceivedCurrentWeather(WeatherManager manager, Weather weather) {
                // Handle current weather information
            }

            @Override
            public void onFailedToReceiveCurrentWeather(WeatherManager manager) {
                // Handle error
            }
        }
);
```

### Weather class

Object of `Weather` type can tell you a lot of information:

```java
/*
 * Location name.
 */

String locationName = weather.getNavigation().getLocationName();

/*
 * Latitude of the place.
 */

double latitude = weather.getNavigation().getCoordinate().getLatitude();

/*
 * Longitude of the place.
 */

double longitude = weather.getNavigation().getCoordinate().getLongitude();

/*
 * Sea level.
 */

double seaLevel = weather.getNavigation().getSeaLevel();

/*
 * Ground level.
 */

double groundLevel = weather.getNavigation().getGroundLevel();

/*
 * Current temperature in Kelvin.
 */

double currentTemperatureInKelvin = weather.getTemperature().getCurrent()
    .getValue(TemperatureUnit.KELVIN);

/*
 * Current temperature in Celcius.
 */

double currentTemperatureInCelcius = weather.getTemperature().getCurrent()
    .getValue(TemperatureUnit.CELCIUS);

/*
 * Current temperature in Fahrenheit.
 */

double currentTemperatureInFahrenheit = weather.getTemperature().getCurrent()
    .getValue(TemperatureUnit.FAHRENHEIT);

/*
 * Minimum temperature in Kelvin.
 */

double minimumTemperatureInKelvin = weather.getTemperature().getMinimum()
    .getValue(TemperatureUnit.KELVIN);

/*
 * Minimum temperature in Celcius.
 */

double minimumTemperatureInCelcius = weather.getTemperature().getMinimum()
    .getValue(TemperatureUnit.CELCIUS);

/*
 * Minimum temperature in Fahrenheit.
 */

double minimumTemperatureInFahrenheit = weather.getTemperature().getMinimum()
    .getValue(TemperatureUnit.FAHRENHEIT);

/*
 * Maximum temperature in Kelvin.
 */

double maximumTemperatureInKelvin = weather.getTemperature().getMaximum()
    .getValue(TemperatureUnit.KELVIN);

/*
 * Maximum temperature in Celcius.
 */

double maximumTemperatureInCelcius = weather.getTemperature().getMaximum()
    .getValue(TemperatureUnit.CELCIUS);

/*
 * Maximum temperature in Fahrenheit.
 */

double maximumTemperatureInFahrenheit = weather.getTemperature().getMaximum()
    .getValue(TemperatureUnit.FAHRENHEIT);

/*
 * Sunrise timestamp.
 */

long sunriseTimestamp = weather.getLight().getSunriseTimestamp();

/*
 * Sunset timestamp.
 */

long sunsetTimestamp = weather.getLight().getSunsetTimestamp();

/*
 * Wind speed in meters per second.
 */

double windSpeed = weather.getWind().getSpeed();

/*
 * Wind direction in degrees.
 */

double direction = weather.getWind().getDirection();

/*
 * Cloudiness in percents.
 */

int cloudinessPercentage = weather.getCloudiness().getPercentage();

/*
 * Rain volume for last three hours.
 */

double rainThreeHoursVolume = weather.getRain().getThreeHoursVolume();

/*
 * Snow volume for last three hours.
 */

double snowThreeHoursVolume = weather.getSnow().getThreeHoursVolume();

/*
 * Weather timestamp.
 */

long weatherTimestamp = weather.getWeatherTimestamp();
```

### Temperature Conversions

You can easily convert temperature from Kelvin to Celcius, from Celcius to Fahrenheit, etc. Use `Temperature` class for that:

```java
Temperature temperature = new Temperature(32, TemperatureUnit.FAHRENHEIT);
double temperatureInFahrenheit = temperature.getValue(TemperatureUnit.FAHRENHEIT); // 32.0 degrees
double temperatureInCelcius = temperature.getValue(TemperatureUnit.CELCIUS); // 0.0 degrees
double temperatureInKelvin = temperature.getValue(TemperatureUnit.KELVIN); // 273.15 degrees
```

## License

`F32` is available under the MIT license. See the [LICENSE](./LICENSE) file for more info.
