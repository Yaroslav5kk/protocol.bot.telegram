package com.fox.protocol.bot.telegram.dto;

import java.util.List;

public class TgPassportData {
  private List<TgEncryptedPassportElement> data;
  private TgEncryptedCredentials credentials;

  public List<TgEncryptedPassportElement> getData() {
    return data;
  }

  public void setData(List<TgEncryptedPassportElement> data) {
    this.data = data;
  }

  public TgEncryptedCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(TgEncryptedCredentials credentials) {
    this.credentials = credentials;
  }

  @Override
  public String toString() {
    return "TgPassportData{" +
        "data=" + data +
        ", credentials=" + credentials +
        '}';
  }
}
