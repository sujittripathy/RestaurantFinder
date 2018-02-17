package com.example.RestaurantFinder.controller;

import com.example.RestaurantFinder.mapper.restaurant.Restaurant_;
import com.example.RestaurantFinder.mapper.restaurant.RestraurantSearchResponse;
import com.example.RestaurantFinder.service.RestraurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sujittripathy on 2/16/18.
 */
@RestController
public class RestraurantController {

    private RestraurantService service;

    public RestraurantController(RestraurantService service){
        this.service = service;
    }

    @GetMapping("/search")
    public RestraurantSearchResponse searchRestraurants(@RequestParam("city") String city){
        return service.findRestraurants();
    }

    @GetMapping("/restaurant")
    public Restaurant_ getRestaruantDetails(@RequestParam("res_id") String res_id) {
        return service.getDetailsOfRestraurant(res_id);
    }
}
