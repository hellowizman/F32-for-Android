package com.visuality.f32.text;

import com.visuality.f32.temperature.TemperatureUnit;

import java.util.Locale;

/**
 * Created by igormatyushkin on 30.04.17.
 */

public class TemperatureFormatter {

    public TemperatureFormatter() {
        super();
    }

    /**
     * Converts temperature to string.
     * @param locale Preferred locale.
     * @param temperature Temperature value.
     * @param unit Temperature unit (Kelvin, Celcius, Fahrenheit, etc).
     * @return String containing formatted temperature.
     */
    public String getStringFromTemperature(Locale locale, double temperature, TemperatureUnit unit) {
        final String degreeSymbol = "°";
        final String temperatureUnitSymbol = getTemperatureUnitSymbol(unit);

        return String.format(
                locale,
                "%s %s%s",
                degreeSymbol,
                temperatureUnitSymbol
        );
    }

    /**
     * Converts temperature to string using default locale.
     * @param temperature Temperature value.
     * @param unit Temperature unit (Kelvin, Celcius, Fahrenheit, etc).
     * @return String containing formatted temperature.
     */
    public String getStringFromTemperature(double temperature, TemperatureUnit unit) {
        return getStringFromTemperature(
                Locale.getDefault(),
                temperature,
                unit
        );
    }

    private String getTemperatureUnitSymbol(TemperatureUnit unit) {
        switch (unit) {
            case KELVIN:
                return "K";
            case CELCIUS:
                return "C";
            case FAHRENHEIT:
                return "F";
            default:
                return "";
        }
    }
}
