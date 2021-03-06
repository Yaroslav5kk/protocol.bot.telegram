package com.fox.protocol.bot.telegram.dto;

public class TgEncryptedCredentials {
  private String data;
  private String hash;
  private String secret;

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  @Override
  public String toString() {
    return "TgEncryptedCredentials{" +
        "data='" + data + '\'' +
        ", hash='" + hash + '\'' +
        ", secret='" + secret + '\'' +
        '}';
  }
}
