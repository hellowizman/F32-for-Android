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
    public String getStringFromTemperature(
            Locale locale,
            double temperature,
            TemperatureUnit unit
    ) {
        /**
         * Obtain temperature value string.
         */

        final DecimalFormat temperatureFormat = new DecimalFormat("#.##");
        final String temperatureValueString = temperatureFormat.format(temperature);

        /**
         * Obtain temperature unit symbol.
         */

        final String temperatureUnitSymbol = getTemperatureUnitSymbol(
                unit,
                true
        );

        /**
         * Return result.
         */

        return String.format(
                locale,
                "%s %s",
                temperatureValueString,
                temperatureUnitSymbol
        );
    }

    /**
     * Converts temperature to string using default locale.
     * @param temperature Temperature value.
     * @param unit Temperature unit (Kelvin, Celcius, Fahrenheit, etc).
     * @return String containing formatted temperature.
     */
    public String getStringFromTemperature(
            double temperature,
            TemperatureUnit unit
    ) {
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

    /**
     * Returns string representation of temperature unit.
     * @param unit Temperature unit.
     * @param includeDegreeSymbol If `true`, degree symbol will be placed before temperature unit.
     * @return String representation of temperature unit.
     */
    public String getTemperatureUnitSymbol(
            TemperatureUnit unit,
            boolean includeDegreeSymbol
    ) {
        /**
         * Obtain unit string.
         */

        String unitString;

        switch (unit) {
            case KELVIN:
                unitString = "K";
                break;
            case CELCIUS:
                unitString = "C";
                break;
            case FAHRENHEIT:
                unitString = "F";
                break;
            case REAUMUR:
                unitString = "Re";
                break;
            case RANKINE:
                unitString = "Ra";
                break;
            default:
                unitString = "";
                break;
        }

        /**
         * Obtain result string.
         */

        final String resultString = String.format(
                "%s%s",
                includeDegreeSymbol ? "°" : "",
                unitString
        );

        /**
         * Return result string.
         */

        return resultString;
    }

    /**
     * Returns string representation of temperature unit.
     * @param unit Temperature unit.
     * @param degreeSymbol The symbol of degree.
     *                     You can use any custom string here.
     * @return String representation of temperature unit.
     */
    public String getTemperatureUnitSymbol(
            TemperatureUnit unit,
            String degreeSymbol
    ) {
        /**
         * Obtain unit string.
         */

        String unitString;

        switch (unit) {
            case KELVIN:
                unitString = "K";
                break;
            case CELCIUS:
                unitString = "C";
                break;
            case FAHRENHEIT:
                unitString = "F";
                break;
            case REAUMUR:
                unitString = "Re";
                break;
            case RANKINE:
                unitString = "Ra";
                break;
            default:
                unitString = "";
                break;
        }

        /**
         * Obtain result string.
         */

        final String resultString = String.format(
                "%s%s",
                degreeSymbol,
                unitString
        );

        /**
         * Return result string.
         */

        return resultString;
    }
}
