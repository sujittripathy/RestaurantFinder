package com.example.RestaurantFinder.mapper.common.cities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "country_id",
        "country_name",
        "country_flag_url",
        "should_experiment_with",
        "discovery_enabled",
        "has_new_ad_format",
        "is_state",
        "state_id",
        "state_name",
        "state_code"
})
public class LocationSuggestion {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("country_id")
    private Integer countryId;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("country_flag_url")
    private String countryFlagUrl;
    @JsonProperty("should_experiment_with")
    private Integer shouldExperimentWith;
    @JsonProperty("discovery_enabled")
    private Integer discoveryEnabled;
    @JsonProperty("has_new_ad_format")
    private Integer hasNewAdFormat;
    @JsonProperty("is_state")
    private Integer isState;
    @JsonProperty("state_id")
    private Integer stateId;
    @JsonProperty("state_name")
    private String stateName;
    @JsonProperty("state_code")
    private String stateCode;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("country_id")
    public Integer getCountryId() {
        return countryId;
    }

    @JsonProperty("country_id")
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @JsonProperty("country_name")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("country_flag_url")
    public String getCountryFlagUrl() {
        return countryFlagUrl;
    }

    @JsonProperty("country_flag_url")
    public void setCountryFlagUrl(String countryFlagUrl) {
        this.countryFlagUrl = countryFlagUrl;
    }

    @JsonProperty("should_experiment_with")
    public Integer getShouldExperimentWith() {
        return shouldExperimentWith;
    }

    @JsonProperty("should_experiment_with")
    public void setShouldExperimentWith(Integer shouldExperimentWith) {
        this.shouldExperimentWith = shouldExperimentWith;
    }

    @JsonProperty("discovery_enabled")
    public Integer getDiscoveryEnabled() {
        return discoveryEnabled;
    }

    @JsonProperty("discovery_enabled")
    public void setDiscoveryEnabled(Integer discoveryEnabled) {
        this.discoveryEnabled = discoveryEnabled;
    }

    @JsonProperty("has_new_ad_format")
    public Integer getHasNewAdFormat() {
        return hasNewAdFormat;
    }

    @JsonProperty("has_new_ad_format")
    public void setHasNewAdFormat(Integer hasNewAdFormat) {
        this.hasNewAdFormat = hasNewAdFormat;
    }

    @JsonProperty("is_state")
    public Integer getIsState() {
        return isState;
    }

    @JsonProperty("is_state")
    public void setIsState(Integer isState) {
        this.isState = isState;
    }

    @JsonProperty("state_id")
    public Integer getStateId() {
        return stateId;
    }

    @JsonProperty("state_id")
    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    @JsonProperty("state_name")
    public String getStateName() {
        return stateName;
    }

    @JsonProperty("state_name")
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @JsonProperty("state_code")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("state_code")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

}
