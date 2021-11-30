package com.fox.protocol.bot.telegram.types;

public enum TgMessageEntityType implements TgTypeFather {
  MENTION("mention"),
  HASHTAG("hashtag"),
  CASHTAG("cashtag"),
  BOT_COMMAND("bot_command"),
  URL("url"),
  EMAIL("email"),
  PHONE_NUMBER("phone_number"),
  BOLD("bold"),
  ITALIC("italic"),
  UNDERLINE("underline"),
  STRIKETHROUGH("strikethrough"),
  CODE("code"),
  PRE("pre"),
  TEXT_LINK("text_link"),
  TEXT_MENTION("text_mention");

  private final String tgOriginalValue;

  TgMessageEntityType(final String tgOriginalValue) {
    this.tgOriginalValue = tgOriginalValue;
  }

  public String getTgOriginalValue() {
    return tgOriginalValue;
  }
}
