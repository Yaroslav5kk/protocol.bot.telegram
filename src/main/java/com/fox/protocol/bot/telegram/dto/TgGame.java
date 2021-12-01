package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TgGame {
  private String title;
  private String description;
  private List<TgPhotoSize> photo;
  private String text;
  @JsonProperty("text_entities")
  private List<TgMessageEntity> textEntities;
  private TgAnimation animation;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<TgPhotoSize> getPhoto() {
    return photo;
  }

  public void setPhoto(List<TgPhotoSize> photo) {
    this.photo = photo;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public List<TgMessageEntity> getTextEntities() {
    return textEntities;
  }

  public void setTextEntities(List<TgMessageEntity> textEntities) {
    this.textEntities = textEntities;
  }

  public TgAnimation getAnimation() {
    return animation;
  }

  public void setAnimation(TgAnimation animation) {
    this.animation = animation;
  }

  @Override
  public String toString() {
    return "TgGame{" +
        "title='" + title + '\'' +
        ", description='" + description + '\'' +
        ", photo=" + photo +
        ", text='" + text + '\'' +
        ", textEntities=" + textEntities +
        ", animation=" + animation +
        '}';
  }
}
