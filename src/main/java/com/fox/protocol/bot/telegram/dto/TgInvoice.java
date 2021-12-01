package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgInvoice {
  private String title;
  private String description;
  @JsonProperty("start_parameter")
  private String startParameter;
  private String currency;
  @JsonProperty("total_amount")
  private int totalAmount;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getStartParameter() {
    return startParameter;
  }

  public void setStartParameter(String startParameter) {
    this.startParameter = startParameter;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public int getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(int totalAmount) {
    this.totalAmount = totalAmount;
  }

  @Override
  public String toString() {
    return "TgInvoice{" +
        "title='" + title + '\'' +
        ", description='" + description + '\'' +
        ", startParameter='" + startParameter + '\'' +
        ", currency='" + currency + '\'' +
        ", totalAmount=" + totalAmount +
        '}';
  }
}
