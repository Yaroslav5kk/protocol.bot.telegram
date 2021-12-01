package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fox.protocol.bot.telegram.types.TgEncryptedPassportElementType;

import java.util.List;

public class TgEncryptedPassportElement {
  private TgEncryptedPassportElementType type;
  private String data;
  @JsonProperty("phone_number")
  private String phoneNumber;
  private String email;
  private List<TgPassportFile> files;
  @JsonProperty("front_side")
  private TgPassportFile frontSide;
  @JsonProperty("reverse_side")
  private TgPassportFile reverseSide;
  private TgPassportFile selfie;
  private List<TgPassportFile> translation;
  private String hash;

  public TgEncryptedPassportElementType getType() {
    return type;
  }

  public void setType(TgEncryptedPassportElementType type) {
    this.type = type;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<TgPassportFile> getFiles() {
    return files;
  }

  public void setFiles(List<TgPassportFile> files) {
    this.files = files;
  }

  public TgPassportFile getFrontSide() {
    return frontSide;
  }

  public void setFrontSide(TgPassportFile frontSide) {
    this.frontSide = frontSide;
  }

  public TgPassportFile getReverseSide() {
    return reverseSide;
  }

  public void setReverseSide(TgPassportFile reverseSide) {
    this.reverseSide = reverseSide;
  }

  public TgPassportFile getSelfie() {
    return selfie;
  }

  public void setSelfie(TgPassportFile selfie) {
    this.selfie = selfie;
  }

  public List<TgPassportFile> getTranslation() {
    return translation;
  }

  public void setTranslation(List<TgPassportFile> translation) {
    this.translation = translation;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  @Override
  public String toString() {
    return "TgEncryptedPassportElement{" +
        "type=" + type +
        ", data='" + data + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", email='" + email + '\'' +
        ", files=" + files +
        ", frontSide=" + frontSide +
        ", reverseSide=" + reverseSide +
        ", selfie=" + selfie +
        ", translation=" + translation +
        ", hash='" + hash + '\'' +
        '}';
  }
}
