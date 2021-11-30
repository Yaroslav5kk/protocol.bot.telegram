package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgContact {
  @JsonProperty("phone_number")
  private String phoneNumber;
  @JsonProperty("first_name")
  private String firstName;
  @JsonProperty("last_name")
  private String lastName;
  @JsonProperty("user_id")
  private int userId;
  @JsonProperty("vcard")
  private String vCard;

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getvCard() {
    return vCard;
  }

  public void setvCard(String vCard) {
    this.vCard = vCard;
  }

  @Override
  public String toString() {
    return "TgContact{" +
        "phoneNumber='" + phoneNumber + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", userId=" + userId +
        ", vCard='" + vCard + '\'' +
        '}';
  }
}
