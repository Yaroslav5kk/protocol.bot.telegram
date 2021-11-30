package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgLocation {
  private float longitude;
  private float latitude;
  @JsonProperty("horizontal_accuracy")
  private float horizontalAccuracy;
  @JsonProperty("live_period")
  private int livePeriod;
  private int heading;
  @JsonProperty("proximity_alert_radius")
  private int proximityAlertRadius;


  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  public float getLatitude() {
    return latitude;
  }

  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  public float getHorizontalAccuracy() {
    return horizontalAccuracy;
  }

  public void setHorizontalAccuracy(float horizontalAccuracy) {
    this.horizontalAccuracy = horizontalAccuracy;
  }

  public int getLivePeriod() {
    return livePeriod;
  }

  public void setLivePeriod(int livePeriod) {
    this.livePeriod = livePeriod;
  }

  public int getHeading() {
    return heading;
  }

  public void setHeading(int heading) {
    this.heading = heading;
  }

  public int getProximityAlertRadius() {
    return proximityAlertRadius;
  }

  public void setProximityAlertRadius(int proximityAlertRadius) {
    this.proximityAlertRadius = proximityAlertRadius;
  }

  @Override
  public String toString() {
    return "TgLocation{" +
        "longitude=" + longitude +
        ", latitude=" + latitude +
        ", horizontalAccuracy=" + horizontalAccuracy +
        ", livePeriod=" + livePeriod +
        ", heading=" + heading +
        ", proximityAlertRadius=" + proximityAlertRadius +
        '}';
  }
}
