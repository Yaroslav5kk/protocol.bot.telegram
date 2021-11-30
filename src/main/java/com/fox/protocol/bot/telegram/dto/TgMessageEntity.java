package com.fox.protocol.bot.telegram.dto;

import com.fox.protocol.bot.telegram.types.TgMessageEntityType;

public class TgMessageEntity {
  private TgMessageEntityType type;
  private int offset;
  private int length;
  private String url;
  private TgUser user;
  private String language;

  public TgMessageEntityType getType() {
    return type;
  }

  public void setType(TgMessageEntityType type) {
    this.type = type;
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public TgUser getUser() {
    return user;
  }

  public void setUser(TgUser user) {
    this.user = user;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  @Override
  public String toString() {
    return "TgMessageEntity{" +
        "type=" + type +
        ", offset=" + offset +
        ", length=" + length +
        ", url='" + url + '\'' +
        ", user=" + user +
        ", language='" + language + '\'' +
        '}';
  }
}
