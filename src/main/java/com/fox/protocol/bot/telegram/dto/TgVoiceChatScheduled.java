package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgVoiceChatScheduled {
  @JsonProperty("start_date")
  private int startDate;

  public int getStartDate() {
    return startDate;
  }

  public void setStartDate(int startDate) {
    this.startDate = startDate;
  }

  @Override
  public String toString() {
    return "TgVoiceChatScheduled{" +
        "startDate=" + startDate +
        '}';
  }
}
