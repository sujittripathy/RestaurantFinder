package com.example.RestaurantFinder.mapper.common.cuisines;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cuisine"
})
public class Cuisine {

    @JsonProperty("cuisine")
    private Cuisine_ cuisine;

    @JsonProperty("cuisine")
    public Cuisine_ getCuisine() {
        return cuisine;
    }

    @JsonProperty("cuisine")
    public void setCuisine(Cuisine_ cuisine) {
        this.cuisine = cuisine;
    }

}
