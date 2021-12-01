package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgMessageAutoDeleteTimerChanged {
  @JsonProperty("message_auto_delete_time")
  private int messageAutoDeleteTime;

  public int getMessageAutoDeleteTime() {
    return messageAutoDeleteTime;
  }

  public void setMessageAutoDeleteTime(int messageAutoDeleteTime) {
    this.messageAutoDeleteTime = messageAutoDeleteTime;
  }

  @Override
  public String toString() {
    return "TgMessageAutoDeleteTimerChanged{" +
        "messageAutoDeleteTime=" + messageAutoDeleteTime +
        '}';
  }
}
