package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgUser {
  private int id;
  @JsonProperty("is_bot")
  private boolean isBot;
  @JsonProperty("first_name")
  private String firstName;
  @JsonProperty("last_name")
  private String lastName;
  @JsonProperty("username")
  private String username;
  @JsonProperty("language_code")
  private String languageCode;
  @JsonProperty("can_join_groups")
  private boolean canJoinGroups;
  @JsonProperty("can_read_all_group_messages")
  private boolean canReadAllGroupMessages;
  @JsonProperty("supports_inline_queries")
  private boolean supportsInlineQueries;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean isBot() {
    return isBot;
  }

  public void setBot(boolean bot) {
    isBot = bot;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public boolean isCanJoinGroups() {
    return canJoinGroups;
  }

  public void setCanJoinGroups(boolean canJoinGroups) {
    this.canJoinGroups = canJoinGroups;
  }

  public boolean isCanReadAllGroupMessages() {
    return canReadAllGroupMessages;
  }

  public void setCanReadAllGroupMessages(boolean canReadAllGroupMessages) {
    this.canReadAllGroupMessages = canReadAllGroupMessages;
  }

  public boolean isSupportsInlineQueries() {
    return supportsInlineQueries;
  }

  public void setSupportsInlineQueries(boolean supportsInlineQueries) {
    this.supportsInlineQueries = supportsInlineQueries;
  }

  @Override
  public String toString() {
    return "TgUser{" +
        "id=" + id +
        ", isBot=" + isBot +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", username='" + username + '\'' +
        ", languageCode='" + languageCode + '\'' +
        ", canJoinGroups='" + canJoinGroups + '\'' +
        ", canReadAllGroupMessages='" + canReadAllGroupMessages + '\'' +
        ", supportsInlineQueries='" + supportsInlineQueries + '\'' +
        '}';
  }
}
