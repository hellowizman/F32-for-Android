package com.visuality.f32.weather.data;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class CloudsInformation {

    private double cloudinessPercentage;

    public double getCloudinessPercentage() {
        return cloudinessPercentage;
    }

    public CloudsInformation(
            double cloudinessPercentage
    ) {
        super();

        /**
         * Initialize cloudiness percentage.
         */

        this.cloudinessPercentage = cloudinessPercentage;
    }

    public static final class Builder {

        private double cloudinessPercentage;

        public Builder setCloudinessPercentage(double cloudinessPercentage) {
            this.cloudinessPercentage = cloudinessPercentage;
            return this;
        }

        public CloudsInformation build() {
            return new CloudsInformation(
                    this.cloudinessPercentage
            );
        }
    }
}
