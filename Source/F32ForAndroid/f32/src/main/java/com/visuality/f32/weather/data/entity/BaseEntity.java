package com.visuality.f32.weather.data.entity;

import org.json.JSONObject;

/**
 * Created by igormatyushkin on 15.04.17.
 */

public class BaseEntity {

    public static BaseEntity fromJson(JSONObject jsonObject) {
        /**
         * Obtain result object.
         */

        final BaseEntity resultObject = new BaseEntity.Builder()
                .build();

        /**
         * Return result.
         */

        return resultObject;
    }

    public BaseEntity() {
        super();
    }

    public static class Builder {

        public BaseEntity build() {
            return new BaseEntity();
        }
    }
}
