package com.example.RestaurantFinder.mapper.restaurant;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "aggregate_rating",
        "rating_text",
        "rating_color",
        "votes"
})
public class UserRating {

    @JsonProperty("aggregate_rating")
    private String aggregateRating;
    @JsonProperty("rating_text")
    private String ratingText;
    @JsonProperty("rating_color")
    private String ratingColor;
    @JsonProperty("votes")
    private String votes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("aggregate_rating")
    public String getAggregateRating() {
        return aggregateRating;
    }

    @JsonProperty("aggregate_rating")
    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    @JsonProperty("rating_text")
    public String getRatingText() {
        return ratingText;
    }

    @JsonProperty("rating_text")
    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    @JsonProperty("rating_color")
    public String getRatingColor() {
        return ratingColor;
    }

    @JsonProperty("rating_color")
    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    @JsonProperty("votes")
    public String getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(String votes) {
        this.votes = votes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}