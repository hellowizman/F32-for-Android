package com.visuality.f32.temperature;

/**
 * Created by igormatyushkin on 17.04.17.
 */

public class Temperature {

    private double value;

    private TemperatureUnit unit;

    public Temperature(
            double value,
            TemperatureUnit unit
    ) {
        super();

        /**
         * Initialize value.
         */

        this.value = value;

        /**
         * Initialize unit.
         */

        this.unit = unit;
    }

    public double getValue(TemperatureUnit targetUnit) {
        switch (this.unit) {
            case CELCIUS:
                switch (targetUnit) {
                    case CELCIUS:
                        return this.value;
                    case DELISLE:
                        return (this.value * 1.5) - 100.0;
                    case FAHRENHEIT:
                        return (this.value * 1.8) + 32.0;
                    case KELVIN:
                        return this.value + 273.15;
                    case RANKINE:
                        return (this.value * 1.8) + 32.0 + 459.67;
                    case REAUMUR:
                        return this.value * 0.8;
                    case ROMER:
                        return (this.value * 21.0 / 40.0) + 7.5;
                    default:
                        return this.value;
                }
            case DELISLE:
                switch (targetUnit) {
                    case CELCIUS:
                        return (this.value + 100.0) / 1.5;
                    case DELISLE:
                        return this.value;
                    case FAHRENHEIT:
                        return (this.value + 100.0) * 1.2 + 32.0;
                    case KELVIN:
                        return ((this.value + 100.0) / 1.5) + 273.15;
                    case RANKINE:
                        return (this.value + 100.0) * 1.2 + 491.67;
                    case REAUMUR:
                        return (this.value + 100.0) * 0.53333;
                    case ROMER:
                        return (this.value + 100.0) * 0.35 + 7.5;
                    default:
                        return this.value;
                }
            case FAHRENHEIT:
                switch (targetUnit) {
                    case CELCIUS:
                        return (this.value - 32.0) / 1.8;
                    case DELISLE:
                        return (212.0 - this.value) * (5.0 / 6.0);
                    case FAHRENHEIT:
                        return this.value;
                    case KELVIN:
                        return (this.value + 459.67) / 1.8;
                    case RANKINE:
                        return this.value + 459.67;
                    case REAUMUR:
                        return (this.value - 32.0) / 2.25;
                    case ROMER:
                        return ((this.value - 32.0) * (7.0 / 24.0)) + 7.5;
                    default:
                        return this.value;
                }
            case KELVIN:
                switch (targetUnit) {
                    case CELCIUS:
                        return this.value - 273.15;
                    case DELISLE:
                        return (373.15 - this.value) * 1.5;
                    case FAHRENHEIT:
                        return (this.value * 1.8) - 459.67;
                    case KELVIN:
                        return this.value;
                    case RANKINE:
                        return this.value * 1.8;
                    case REAUMUR:
                        return (this.value - 273.15) * 0.8;
                    case ROMER:
                        return ((this.value - 273.15) * (21.0 / 40.0)) + 7.5;
                    default:
                        return this.value;
                }
            case RANKINE:
                switch (targetUnit) {
                    case CELCIUS:
                        return (this.value - 32.0 - 459.67) / 1.8;
                    case DELISLE:
                        return (671.67 - this.value) * (5.0 / 6.0);
                    case FAHRENHEIT:
                        return this.value - 459.67;
                    case KELVIN:
                        return this.value / 1.8;
                    case RANKINE:
                        return this.value;
                    case REAUMUR:
                        return (this.value - 32.0 - 459.67) / 2.25;
                    case ROMER:
                        return ((this.value - 491.67) * (7.0 / 24.0)) + 7.5;
                    default:
                        return this.value;
                }
            case REAUMUR:
                switch (targetUnit) {
                    case CELCIUS:
                        return this.value * 1.25;
                    case DELISLE:
                        return (80.0 - this.value) * (15.0 / 8.0);
                    case FAHRENHEIT:
                        return (this.value * 2.25) + 32.0;
                    case KELVIN:
                        return (this.value * 1.25) + 273.15;
                    case RANKINE:
                        return (this.value * 2.25) + 32.0 + 459.67;
                    case REAUMUR:
                        return this.value;
                    case ROMER:
                        return (this.value * 21.0 / 32.0) + 7.5;
                    default:
                        return this.value;
                }
            case ROMER:
                switch (targetUnit) {
                    case CELCIUS:
                        return (this.value - 7.5) * (40.0 / 21.0);
                    case DELISLE:
                        return (60.0 - this.value) * (20.0 / 7.0);
                    case FAHRENHEIT:
                        return (this.value - 7.5) * (24.0 / 7.0) + 32.0;
                    case KELVIN:
                        return (this.value - 7.5) * (40.0 / 21.0) + 273.15;
                    case RANKINE:
                        return (this.value - 7.5) * (24.0 / 7.0) + 491.67;
                    case REAUMUR:
                        return (this.value - 7.5) * (32.0 / 21.0);
                    case ROMER:
                        return this.value;
                    default:
                        return this.value;
                }
            default:
                return this.value;
        }
    }
}
