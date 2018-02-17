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
        "R",
        "apikey",
        "id",
        "name",
        "url",
        "location",
        "switch_to_order_menu",
        "cuisines",
        "average_cost_for_two",
        "price_range",
        "currency",
        "offers",
        "thumb",
        "user_rating",
        "photos_url",
        "menu_url",
        "featured_image",
        "has_online_delivery",
        "is_delivering_now",
        "deeplink",
        "has_table_booking",
        "events_url",
        "establishment_types"
})
public class Restaurant_ {

    @JsonProperty("R")
    private R r;
    @JsonProperty("apikey")
    private String apikey;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("switch_to_order_menu")
    private Integer switchToOrderMenu;
    @JsonProperty("cuisines")
    private String cuisines;
    @JsonProperty("average_cost_for_two")
    private Integer averageCostForTwo;
    @JsonProperty("price_range")
    private Integer priceRange;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("offers")
    private List<Object> offers = null;
    @JsonProperty("thumb")
    private String thumb;
    @JsonProperty("user_rating")
    private UserRating userRating;
    @JsonProperty("photos_url")
    private String photosUrl;
    @JsonProperty("menu_url")
    private String menuUrl;
    @JsonProperty("featured_image")
    private String featuredImage;
    @JsonProperty("has_online_delivery")
    private Integer hasOnlineDelivery;
    @JsonProperty("is_delivering_now")
    private Integer isDeliveringNow;
    @JsonProperty("deeplink")
    private String deeplink;
    @JsonProperty("has_table_booking")
    private Integer hasTableBooking;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("establishment_types")
    private List<Object> establishmentTypes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("R")
    public R getR() {
        return r;
    }

    @JsonProperty("R")
    public void setR(R r) {
        this.r = r;
    }

    @JsonProperty("apikey")
    public String getApikey() {
        return apikey;
    }

    @JsonProperty("apikey")
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
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

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("switch_to_order_menu")
    public Integer getSwitchToOrderMenu() {
        return switchToOrderMenu;
    }

    @JsonProperty("switch_to_order_menu")
    public void setSwitchToOrderMenu(Integer switchToOrderMenu) {
        this.switchToOrderMenu = switchToOrderMenu;
    }

    @JsonProperty("cuisines")
    public String getCuisines() {
        return cuisines;
    }

    @JsonProperty("cuisines")
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    @JsonProperty("average_cost_for_two")
    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    @JsonProperty("average_cost_for_two")
    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    @JsonProperty("price_range")
    public Integer getPriceRange() {
        return priceRange;
    }

    @JsonProperty("price_range")
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("offers")
    public List<Object> getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    @JsonProperty("thumb")
    public String getThumb() {
        return thumb;
    }

    @JsonProperty("thumb")
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @JsonProperty("user_rating")
    public UserRating getUserRating() {
        return userRating;
    }

    @JsonProperty("user_rating")
    public void setUserRating(UserRating userRating) {
        this.userRating = userRating;
    }

    @JsonProperty("photos_url")
    public String getPhotosUrl() {
        return photosUrl;
    }

    @JsonProperty("photos_url")
    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    @JsonProperty("menu_url")
    public String getMenuUrl() {
        return menuUrl;
    }

    @JsonProperty("menu_url")
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @JsonProperty("featured_image")
    public String getFeaturedImage() {
        return featuredImage;
    }

    @JsonProperty("featured_image")
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    @JsonProperty("has_online_delivery")
    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    @JsonProperty("has_online_delivery")
    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    @JsonProperty("is_delivering_now")
    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    @JsonProperty("is_delivering_now")
    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    @JsonProperty("deeplink")
    public String getDeeplink() {
        return deeplink;
    }

    @JsonProperty("deeplink")
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    @JsonProperty("has_table_booking")
    public Integer getHasTableBooking() {
        return hasTableBooking;
    }

    @JsonProperty("has_table_booking")
    public void setHasTableBooking(Integer hasTableBooking) {
        this.hasTableBooking = hasTableBooking;
    }

    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonProperty("establishment_types")
    public List<Object> getEstablishmentTypes() {
        return establishmentTypes;
    }

    @JsonProperty("establishment_types")
    public void setEstablishmentTypes(List<Object> establishmentTypes) {
        this.establishmentTypes = establishmentTypes;
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
        return "Restaurant_{" +
                "r=" + r +
                ", apikey='" + apikey + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", location=" + location +
                ", switchToOrderMenu=" + switchToOrderMenu +
                ", cuisines='" + cuisines + '\'' +
                ", averageCostForTwo=" + averageCostForTwo +
                ", priceRange=" + priceRange +
                ", currency='" + currency + '\'' +
                ", offers=" + offers +
                ", thumb='" + thumb + '\'' +
                ", userRating=" + userRating +
                ", photosUrl='" + photosUrl + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", featuredImage='" + featuredImage + '\'' +
                ", hasOnlineDelivery=" + hasOnlineDelivery +
                ", isDeliveringNow=" + isDeliveringNow +
                ", deeplink='" + deeplink + '\'' +
                ", hasTableBooking=" + hasTableBooking +
                ", eventsUrl='" + eventsUrl + '\'' +
                ", establishmentTypes=" + establishmentTypes +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}