package com.visuality.f32.weather.data;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class SnowInformation {

    private double threeHoursVolume;

    public double getThreeHoursVolume() {
        return threeHoursVolume;
    }

    public SnowInformation(
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

        public SnowInformation build() {
            return new SnowInformation(
                    this.threeHoursVolume
            );
        }
    }
}
