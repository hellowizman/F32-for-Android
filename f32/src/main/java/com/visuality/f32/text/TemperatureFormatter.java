package com.visuality.f32.text;

import com.visuality.f32.temperature.TemperatureUnit;

import java.text.DecimalFormat;
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
        /**
         * Obtain temperature value string.
         */

        final DecimalFormat temperatureFormat = new DecimalFormat("#.##");
        final String temperatureValueString = temperatureFormat.format(temperature);

        /**
         * Obtain degree symbol.
         */

        final String degreeSymbol = "°";

        /**
         * Obtain temperature unit symbol.
         */

        final String temperatureUnitSymbol = getTemperatureUnitSymbol(unit);

        /**
         * Return result.
         */

        return String.format(
                locale,
                "%s %s%s",
                temperatureValueString,
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
        /**
         * Obtain default locale.
         */

        final Locale defaultLocale = Locale.getDefault();

        /**
         * Return result.
         */

        return getStringFromTemperature(
                defaultLocale,
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
            case REAUMUR:
                return "Re";
            case RANKINE:
                return "Ra";
            default:
                return "";
        }
    }
}
