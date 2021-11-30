package com.fox.protocol.bot.telegram.dto;

public class TgChatLocation {
  private TgLocation location;
  private String address;

  public TgLocation getLocation() {
    return location;
  }

  public void setLocation(TgLocation location) {
    this.location = location;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "TgChatLocation{" +
        "location=" + location +
        ", address='" + address + '\'' +
        '}';
  }
}
