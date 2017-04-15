package com.visuality.f32.networking.url;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class UrlFactory {

    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public UrlFactory(String baseUrl) {
        super();

        /**
         * Initialize base URL.
         */

        this.baseUrl = baseUrl;
    }

    public String getAbsoluteUrl(String relativePath) {
        return String.format(
                "%s/%s",
                baseUrl,
                relativePath
        );
    }
}
