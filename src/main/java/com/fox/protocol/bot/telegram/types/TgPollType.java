package com.fox.protocol.bot.telegram.types;

public enum TgPollType implements TgTypeFather{
  REGULAR("regular"),
  QUIZ("quiz");

  private final String tgOriginalValue;


  TgPollType(final String tgOriginalValue) {
    this.tgOriginalValue = tgOriginalValue;
  }

  public String getTgOriginalValue() {
    return tgOriginalValue;
  }
}
