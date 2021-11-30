package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgChatPhoto {
  @JsonProperty("small_file_id")
  private String smallFileId;
  @JsonProperty("small_file_unique_id")
  private String smallFileUniqueId;
  @JsonProperty("big_file_id")
  private String bigFileId;
  @JsonProperty("big_file_unique_id")
  private String bigFileUniqueId;

  public String getSmallFileId() {
    return smallFileId;
  }

  public void setSmallFileId(String smallFileId) {
    this.smallFileId = smallFileId;
  }

  public String getSmallFileUniqueId() {
    return smallFileUniqueId;
  }

  public void setSmallFileUniqueId(String smallFileUniqueId) {
    this.smallFileUniqueId = smallFileUniqueId;
  }

  public String getBigFileId() {
    return bigFileId;
  }

  public void setBigFileId(String bigFileId) {
    this.bigFileId = bigFileId;
  }

  public String getBigFileUniqueId() {
    return bigFileUniqueId;
  }

  public void setBigFileUniqueId(String bigFileUniqueId) {
    this.bigFileUniqueId = bigFileUniqueId;
  }

  @Override
  public String toString() {
    return "TgChatPhoto{" +
        "smallFileId='" + smallFileId + '\'' +
        ", smallFileUniqueId='" + smallFileUniqueId + '\'' +
        ", bigFileId='" + bigFileId + '\'' +
        ", bigFileUniqueId='" + bigFileUniqueId + '\'' +
        '}';
  }
}
