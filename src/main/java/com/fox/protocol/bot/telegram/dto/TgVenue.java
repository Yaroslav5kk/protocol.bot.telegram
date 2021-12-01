package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgVenue {
  private TgLocation location;
  private String title;
  private String address;
  @JsonProperty("foursquare_id")
  private String foursquareId;
  @JsonProperty("foursquare_type")
  private String foursquareType;
  @JsonProperty("google_place_id")
  private String googlePlaceId;
  @JsonProperty("google_place_type")
  private String googlePlaceType;

  public TgLocation getLocation() {
    return location;
  }

  public void setLocation(TgLocation location) {
    this.location = location;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getFoursquareId() {
    return foursquareId;
  }

  public void setFoursquareId(String foursquareId) {
    this.foursquareId = foursquareId;
  }

  public String getFoursquareType() {
    return foursquareType;
  }

  public void setFoursquareType(String foursquareType) {
    this.foursquareType = foursquareType;
  }

  public String getGooglePlaceId() {
    return googlePlaceId;
  }

  public void setGooglePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
  }

  public String getGooglePlaceType() {
    return googlePlaceType;
  }

  public void setGooglePlaceType(String googlePlaceType) {
    this.googlePlaceType = googlePlaceType;
  }
}
