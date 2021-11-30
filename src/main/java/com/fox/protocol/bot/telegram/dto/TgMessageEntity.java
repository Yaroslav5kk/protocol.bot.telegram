package com.fox.protocol.bot.telegram.dto;

import com.fox.protocol.bot.telegram.types.TgMessageEntityType;

public class TgMessageEntity {
  private TgMessageEntityType type;
  private int offset;
  private int length;
  private String url;
  private TgUser user;
  private String language;
}
