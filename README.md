# At a Glance

`F32` is a wrapper for [OpenWeatherMap API](http://openweathermap.org/api). It provides developer with super-simple way to obtain weather information by geographic coordinates.

# How To Get Started

- Copy content from `Source/F32ForAndroid/f32/src/main/java/com/visuality/f32` folder to your project.

or

- Use gradle dependency: `compile 'com.visuality.f32forandroid:f32:0.2.2'`

# Requirements

* Android Studio 2.3 or later
* Java 8 or later
* Android 4.0.3 or later

# Usage

First of all, sign up [here](http://openweathermap.org) and get API key (if you don't already have one).

Also, don't forget to append `INTERNET` permission to your application's manifest file:

```xml
<uses-permission android:name="android.permission.INTERNET"/>
```

Now you are ready to make request for current weather:

```java
new WeatherManager(API_KEY).getCurrentWeather(
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

double currentTemperature = weather.getTemperature().getCurrent();

/*
 * Minimum temperature in Kelvin.
 */

double minimumTemperature = weather.getTemperature().getMinimum();

/*
 * Maximum temperature in Kelvin.
 */

double maximumTemperature = weather.getTemperature().getMaximum();

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

# License

`F32` is available under the MIT license. See the [LICENSE](./LICENSE) file for more info.
