package com.example.RestaurantFinder.mapper.restaurant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "results_found",
        "results_start",
        "results_shown",
        "restaurants"
})
public class RestraurantSearchResponse {

    @JsonProperty("results_found")
    private Integer resultsFound;
    @JsonProperty("results_start")
    private Integer resultsStart;
    @JsonProperty("results_shown")
    private Integer resultsShown;
    @JsonProperty("restaurants")
    private List<Restaurant> restaurants = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("results_found")
    public Integer getResultsFound() {
        return resultsFound;
    }

    @JsonProperty("results_found")
    public void setResultsFound(Integer resultsFound) {
        this.resultsFound = resultsFound;
    }

    @JsonProperty("results_start")
    public Integer getResultsStart() {
        return resultsStart;
    }

    @JsonProperty("results_start")
    public void setResultsStart(Integer resultsStart) {
        this.resultsStart = resultsStart;
    }

    @JsonProperty("results_shown")
    public Integer getResultsShown() {
        return resultsShown;
    }

    @JsonProperty("results_shown")
    public void setResultsShown(Integer resultsShown) {
        this.resultsShown = resultsShown;
    }

    @JsonProperty("restaurants")
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    @JsonProperty("restaurants")
    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "RestraurantSearchResponse{" +
                "resultsFound=" + resultsFound +
                ", resultsStart=" + resultsStart +
                ", resultsShown=" + resultsShown +
                ", restaurants=" + restaurants +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}