package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fox.protocol.bot.telegram.types.TgChatType;

public class TgChat {
  private int id;
  private TgChatType type;
  private String title;
  @JsonProperty("first_name")
  private String firstName;
  @JsonProperty("last_name")
  private String lastName;
  private String username;
  private TgChatPhoto photo;
  private String bio;
  private String description;
  @JsonProperty("invite_link")
  private String inviteLink;
  @JsonProperty("pinned_message")
  private TgMessage pinnedMessage;
  private TgChatPermissions permissions;
  @JsonProperty("slow_mode_delay")
  private int slowModeDelay;
  @JsonProperty("message_auto_delete_time")
  private int messageAutoDeleteTime;
  @JsonProperty("sticker_set_name")
  private String stickerSetName;
  @JsonProperty("can_set_sticker_set")
  private boolean canSetStickerSet;
  @JsonProperty("linked_chat_id")
  private int linkedChatId;
  private TgChatLocation location;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public TgChatType getType() {
    return type;
  }

  public void setType(TgChatType type) {
    this.type = type;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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

  public TgChatPhoto getPhoto() {
    return photo;
  }

  public void setPhoto(TgChatPhoto photo) {
    this.photo = photo;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getInviteLink() {
    return inviteLink;
  }

  public void setInviteLink(String inviteLink) {
    this.inviteLink = inviteLink;
  }

  public TgMessage getPinnedMessage() {
    return pinnedMessage;
  }

  public void setPinnedMessage(TgMessage pinnedMessage) {
    this.pinnedMessage = pinnedMessage;
  }

  public TgChatPermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(TgChatPermissions permissions) {
    this.permissions = permissions;
  }

  public int getSlowModeDelay() {
    return slowModeDelay;
  }

  public void setSlowModeDelay(int slowModeDelay) {
    this.slowModeDelay = slowModeDelay;
  }

  public int getMessageAutoDeleteTime() {
    return messageAutoDeleteTime;
  }

  public void setMessageAutoDeleteTime(int messageAutoDeleteTime) {
    this.messageAutoDeleteTime = messageAutoDeleteTime;
  }

  public String getStickerSetName() {
    return stickerSetName;
  }

  public void setStickerSetName(String stickerSetName) {
    this.stickerSetName = stickerSetName;
  }

  public boolean isCanSetStickerSet() {
    return canSetStickerSet;
  }

  public void setCanSetStickerSet(boolean canSetStickerSet) {
    this.canSetStickerSet = canSetStickerSet;
  }

  public int getLinkedChatId() {
    return linkedChatId;
  }

  public void setLinkedChatId(int linkedChatId) {
    this.linkedChatId = linkedChatId;
  }

  public TgChatLocation getLocation() {
    return location;
  }

  public void setLocation(TgChatLocation location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "TgChat{" +
        "id=" + id +
        ", type=" + type +
        ", title='" + title + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", username='" + username + '\'' +
        ", photo=" + photo +
        ", bio='" + bio + '\'' +
        ", description='" + description + '\'' +
        ", inviteLink='" + inviteLink + '\'' +
        ", pinnedMessage=" + pinnedMessage +
        ", permissions=" + permissions +
        ", slowModeDelay=" + slowModeDelay +
        ", messageAutoDeleteTime=" + messageAutoDeleteTime +
        ", stickerSetName='" + stickerSetName + '\'' +
        ", canSetStickerSet=" + canSetStickerSet +
        ", linkedChatId=" + linkedChatId +
        ", location=" + location +
        '}';
  }
}
