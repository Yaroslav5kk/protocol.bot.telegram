package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgSticker {
  @JsonProperty("file_id")
  private String fileId;
  @JsonProperty("file_unique_id")
  private String fileUniqueId;
  private int width;
  private int height;
  @JsonProperty("is_animated")
  private boolean isAnimated;
  private TgPhotoSize thumb;
  private String emoji;
  @JsonProperty("set_name")
  private String setName;
  @JsonProperty("mask_position")
  private TgMaskPosition maskPosition;
  @JsonProperty("file_size")
  private String fileSize;


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

  public boolean isAnimated() {
    return isAnimated;
  }

  public void setAnimated(boolean animated) {
    isAnimated = animated;
  }

  public TgPhotoSize getThumb() {
    return thumb;
  }

  public void setThumb(TgPhotoSize thumb) {
    this.thumb = thumb;
  }

  public String getEmoji() {
    return emoji;
  }

  public void setEmoji(String emoji) {
    this.emoji = emoji;
  }

  public String getSetName() {
    return setName;
  }

  public void setSetName(String setName) {
    this.setName = setName;
  }

  public TgMaskPosition getMaskPosition() {
    return maskPosition;
  }

  public void setMaskPosition(TgMaskPosition maskPosition) {
    this.maskPosition = maskPosition;
  }

  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  @Override
  public String toString() {
    return "TgSticker{" +
        "fileId='" + fileId + '\'' +
        ", fileUniqueId='" + fileUniqueId + '\'' +
        ", width=" + width +
        ", height=" + height +
        ", isAnimated=" + isAnimated +
        ", thumb=" + thumb +
        ", emoji='" + emoji + '\'' +
        ", setName='" + setName + '\'' +
        ", maskPosition=" + maskPosition +
        ", fileSize='" + fileSize + '\'' +
        '}';
  }
}
