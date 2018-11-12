package com.example.RestaurantFinder.service;

import com.example.RestaurantFinder.mapper.restaurant.Restaurant_;
import com.example.RestaurantFinder.mapper.restaurant.RestraurantSearchResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sujittripathy on 2/16/18.
 */
@Service
public class RestraurantService extends BaseService{
    private static Logger logger = LoggerFactory.getLogger(RestraurantService.class);

    /*
     * Search for Restraurants
     */
    public RestraurantSearchResponse findRestraurants(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<RestraurantSearchResponse> responseObj = restTemplate.exchange("https://developers.zomato.com/api/v2.1/search?entity_id=94741&entity_type=zone", HttpMethod.GET,super.setApiKeyInHeader(),RestraurantSearchResponse.class);
        RestraurantSearchResponse restraurantSearchResponse = responseObj.getBody();
        logger.info("Total #### of restraurants returned : " + restraurantSearchResponse.getRestaurants().size());
        return restraurantSearchResponse;
    }

    /*
     * get details of restaruant
     */
    public Restaurant_ getDetailsOfRestraurant(String res_id){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Restaurant_>  restaurant_ = restTemplate.exchange("https://developers.zomato.com/api/v2.1/restaurant?res_id="+res_id,HttpMethod.GET,super.setApiKeyInHeader(),Restaurant_.class);
        Restaurant_ rest_ = restaurant_.getBody();
        logger.info("Restaurant_ details.."+rest_);
        return rest_;
    }
}
