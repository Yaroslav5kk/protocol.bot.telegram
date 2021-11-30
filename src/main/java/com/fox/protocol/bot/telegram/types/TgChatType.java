package com.fox.protocol.bot.telegram.types;

public enum TgChatType implements TgTypeFather{
  PRIVATE("private"),
  GROUP("group"),
  SUPERGROUP("supergroup"),
  CHANNEL("channel");

  private final String tgOriginalValue;


  TgChatType(final String tgOriginalValue) {
    this.tgOriginalValue = tgOriginalValue;
  }

  public String getTgOriginalValue() {
    return tgOriginalValue;
  }
}
