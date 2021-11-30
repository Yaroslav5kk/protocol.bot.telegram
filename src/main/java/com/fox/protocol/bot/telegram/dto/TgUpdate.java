package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgUpdate {
  @JsonProperty("update_id")
  private int updateId;


}
