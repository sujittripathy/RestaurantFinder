package com.example.RestaurantFinder.mapper.common.cuisines;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cuisines"
})
public class Common {

    @JsonProperty("cuisines")
    private List<Cuisine> cuisines = null;

    @JsonProperty("cuisines")
    public List<Cuisine> getCuisines() {
        return cuisines;
    }

    @JsonProperty("cuisines")
    public void setCuisines(List<Cuisine> cuisines) {
        this.cuisines = cuisines;
    }

}
