package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgDocument {
  @JsonProperty("file_id")
  private String fileId;
  @JsonProperty("file_unique_id")
  private String fileUniqueId;
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
    return "TgDocument{" +
        "fileId='" + fileId + '\'' +
        ", fileUniqueId='" + fileUniqueId + '\'' +
        ", thumb=" + thumb +
        ", fileName='" + fileName + '\'' +
        ", mimeType='" + mimeType + '\'' +
        ", fileSize=" + fileSize +
        '}';
  }
}
