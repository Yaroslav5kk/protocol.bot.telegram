package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgVoice {
  @JsonProperty("file_id")
  private String fileId;
  @JsonProperty("file_unique_id")
  private String fileUniqueId;
  private int duration;
  @JsonProperty("mime_type")
  private String mimeType;
  @JsonProperty("file_size")
  private int fileSize;

  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public String getFileUniqueId() {
    return fileUniqueId;
  }

  public void setFileUniqueId(String fileUniqueId) {
    this.fileUniqueId = fileUniqueId;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public int getFileSize() {
    return fileSize;
  }

  public void setFileSize(int fileSize) {
    this.fileSize = fileSize;
  }

  @Override
  public String toString() {
    return "TgVoice{" +
        "fileId='" + fileId + '\'' +
        ", fileUniqueId='" + fileUniqueId + '\'' +
        ", duration=" + duration +
        ", mimeType='" + mimeType + '\'' +
        ", fileSize=" + fileSize +
        '}';
  }
}
