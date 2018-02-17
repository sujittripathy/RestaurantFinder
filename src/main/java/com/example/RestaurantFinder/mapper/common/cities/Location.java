package com.example.RestaurantFinder.mapper.common.cities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "location_suggestions",
        "status",
        "has_more",
        "has_total"
})
public class Location {

    @JsonProperty("location_suggestions")
    private List<LocationSuggestion> locationSuggestions = null;
    @JsonProperty("status")
    private String status;
    @JsonProperty("has_more")
    private Integer hasMore;
    @JsonProperty("has_total")
    private Integer hasTotal;

    @JsonProperty("location_suggestions")
    public List<LocationSuggestion> getLocationSuggestions() {
        return locationSuggestions;
    }

    @JsonProperty("location_suggestions")
    public void setLocationSuggestions(List<LocationSuggestion> locationSuggestions) {
        this.locationSuggestions = locationSuggestions;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("has_more")
    public Integer getHasMore() {
        return hasMore;
    }

    @JsonProperty("has_more")
    public void setHasMore(Integer hasMore) {
        this.hasMore = hasMore;
    }

    @JsonProperty("has_total")
    public Integer getHasTotal() {
        return hasTotal;
    }

    @JsonProperty("has_total")
    public void setHasTotal(Integer hasTotal) {
        this.hasTotal = hasTotal;
    }

}