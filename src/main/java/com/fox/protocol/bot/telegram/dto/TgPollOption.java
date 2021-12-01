package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgPollOption {
  private String text;
  @JsonProperty("voter_count")
  private int voterCount;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public int getVoterCount() {
    return voterCount;
  }

  public void setVoterCount(int voterCount) {
    this.voterCount = voterCount;
  }

  @Override
  public String toString() {
    return "TgPollOption{" +
        "text='" + text + '\'' +
        ", voterCount=" + voterCount +
        '}';
  }
}
