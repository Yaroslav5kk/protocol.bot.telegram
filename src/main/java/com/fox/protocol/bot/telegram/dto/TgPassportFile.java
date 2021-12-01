package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgPassportFile {
  @JsonProperty("file_id")
  private String fileId;
  @JsonProperty("file_unique_id")
  private String fileUniqueId;
  @JsonProperty("file_size")
  private int fileSize;
  @JsonProperty("file_date")
  private int fileDate;

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

  public int getFileSize() {
    return fileSize;
  }

  public void setFileSize(int fileSize) {
    this.fileSize = fileSize;
  }

  public int getFileDate() {
    return fileDate;
  }

  public void setFileDate(int fileDate) {
    this.fileDate = fileDate;
  }

  @Override
  public String toString() {
    return "TgPassportFile{" +
        "fileId='" + fileId + '\'' +
        ", fileUniqueId='" + fileUniqueId + '\'' +
        ", fileSize=" + fileSize +
        ", fileDate=" + fileDate +
        '}';
  }
}
