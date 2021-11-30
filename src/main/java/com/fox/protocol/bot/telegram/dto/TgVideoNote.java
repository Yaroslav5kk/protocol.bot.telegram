package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgVideoNote {
  @JsonProperty("file_id")
  private String fileId;
  @JsonProperty("file_unique_id")
  private String fileUniqueId;
  private int length;
  private int duration;
  private TgPhotoSize thumb;
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

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public TgPhotoSize getThumb() {
    return thumb;
  }

  public void setThumb(TgPhotoSize thumb) {
    this.thumb = thumb;
  }

  public int getFileSize() {
    return fileSize;
  }

  public void setFileSize(int fileSize) {
    this.fileSize = fileSize;
  }

  @Override
  public String toString() {
    return "TgVideoNote{" +
        "fileId='" + fileId + '\'' +
        ", fileUniqueId='" + fileUniqueId + '\'' +
        ", length=" + length +
        ", duration=" + duration +
        ", thumb=" + thumb +
        ", fileSize=" + fileSize +
        '}';
  }
}
