package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgMaskPosition {
  private String point;
  @JsonProperty("x_shift")
  private float xShift;
  @JsonProperty("y_shift")
  private float yShift;
  private float scale;

  public String getPoint() {
    return point;
  }

  public void setPoint(String point) {
    this.point = point;
  }

  public float getxShift() {
    return xShift;
  }

  public void setxShift(float xShift) {
    this.xShift = xShift;
  }

  public float getyShift() {
    return yShift;
  }

  public void setyShift(float yShift) {
    this.yShift = yShift;
  }

  public float getScale() {
    return scale;
  }

  public void setScale(float scale) {
    this.scale = scale;
  }

  @Override
  public String toString() {
    return "TgMaskPosition{" +
        "point='" + point + '\'' +
        ", xShift=" + xShift +
        ", yShift=" + yShift +
        ", scale=" + scale +
        '}';
  }
}
