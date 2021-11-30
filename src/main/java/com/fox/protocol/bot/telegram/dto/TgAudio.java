package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgAudio {
  @JsonProperty("file_id")
  private String fileId;
  @JsonProperty("file_unique_id")
  private String fileUniqueId;
  private int duration;
  private String performer;
  private String title;
  @JsonProperty("file_name")
  private String fileName;
  @JsonProperty("mime_type")
  private String mimeType;
  @JsonProperty("file_size")
  private String fileSize;
  private TgPhotoSize thumb;

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

  public String getPerformer() {
    return performer;
  }

  public void setPerformer(String performer) {
    this.performer = performer;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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

  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  public TgPhotoSize getThumb() {
    return thumb;
  }

  public void setThumb(TgPhotoSize thumb) {
    this.thumb = thumb;
  }

  @Override
  public String toString() {
    return "TgAudio{" +
        "fileId='" + fileId + '\'' +
        ", fileUniqueId='" + fileUniqueId + '\'' +
        ", duration=" + duration +
        ", performer='" + performer + '\'' +
        ", title='" + title + '\'' +
        ", fileName='" + fileName + '\'' +
        ", mimeType='" + mimeType + '\'' +
        ", fileSize='" + fileSize + '\'' +
        ", thumb=" + thumb +
        '}';
  }
}
