package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgOrderInfo {
  private String name;
  @JsonProperty("phone_number")
  private String phoneNumber;
  private String email;
  @JsonProperty("shipping_address")
  private TgShippingAddress shippingAddress;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TgShippingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(TgShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  @Override
  public String toString() {
    return "TgOrderInfo{" +
        "name='" + name + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", email='" + email + '\'' +
        ", shippingAddress=" + shippingAddress +
        '}';
  }
}
