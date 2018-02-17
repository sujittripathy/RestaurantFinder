package com.example.RestaurantFinder.mapper.common.cuisines;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cuisine_id",
        "cuisine_name"
})
public class Cuisine_ {

    @JsonProperty("cuisine_id")
    private Integer cuisineId;
    @JsonProperty("cuisine_name")
    private String cuisineName;

    @JsonProperty("cuisine_id")
    public Integer getCuisineId() {
        return cuisineId;
    }

    @JsonProperty("cuisine_id")
    public void setCuisineId(Integer cuisineId) {
        this.cuisineId = cuisineId;
    }

    @JsonProperty("cuisine_name")
    public String getCuisineName() {
        return cuisineName;
    }

    @JsonProperty("cuisine_name")
    public void setCuisineName(String cuisineName) {
        this.cuisineName = cuisineName;
    }

}
