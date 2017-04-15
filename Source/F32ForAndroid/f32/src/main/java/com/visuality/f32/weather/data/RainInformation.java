package com.visuality.f32.weather.data;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class RainInformation {

    private double threeHoursVolume;

    public double getThreeHoursVolume() {
        return threeHoursVolume;
    }

    public RainInformation(
            double threeHoursVolume
    ) {
        super();

        /**
         * Initialize three hours volume.
         */

        this.threeHoursVolume = threeHoursVolume;
    }

    public static final class Builder {

        private double threeHoursVolume;

        public Builder setThreeHoursVolume(double threeHoursVolume) {
            this.threeHoursVolume = threeHoursVolume;
            return this;
        }

        public RainInformation build() {
            return new RainInformation(
                    this.threeHoursVolume
            );
        }
    }
}
