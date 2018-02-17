package com.example.RestaurantFinder.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by sujittripathy on 2/16/18.
 */
@Component
public class PropertyUtil {

    @Value("${api.key}")
    private String apiKey;
    @Value(("{api.url.v2}"))
    private String apiUrlV2;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiUrlV2() {
        return apiUrlV2;
    }

    public void setApiUrlV2(String apiUrlV2) {
        this.apiUrlV2 = apiUrlV2;
    }
}
