package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgAnimation {
  @JsonProperty("file_id")
  private String fileId;
  @JsonProperty("file_unique_id")
  private String fileUniqueId;
  private int width;
  private int height;
  private int duration;
  private TgPhotoSize thumb;
  @JsonProperty("file_name")
  private String fileName;
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

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
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

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
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
    return "TgAnimation{" +
        "fileId='" + fileId + '\'' +
        ", fileUniqueId='" + fileUniqueId + '\'' +
        ", width=" + width +
        ", height=" + height +
        ", duration=" + duration +
        ", thumb=" + thumb +
        ", fileName='" + fileName + '\'' +
        ", mimeType='" + mimeType + '\'' +
        ", fileSize=" + fileSize +
        '}';
  }
}
