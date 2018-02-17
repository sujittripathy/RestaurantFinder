package com.example.RestaurantFinder.service;

import com.example.RestaurantFinder.util.PropertyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.StreamingHttpOutputMessage;

/**
 * Created by sujittripathy on 2/17/18.
 */
public class BaseService {

    @Autowired
    private PropertyUtil propertyUtil;

    protected HttpEntity<String> setApiKeyInHeader(){
        HttpHeaders headers = new HttpHeaders();
        headers.set("user-key",propertyUtil.getApiKey());
        HttpEntity<String> entity = new HttpEntity<>("paramters",headers);
        return entity;
    }

}
