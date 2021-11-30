package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgChatPermissions {
  @JsonProperty("can_send_messages")
  private boolean canSendMessages;
  @JsonProperty("can_send_media_messages")
  private boolean canSendMediaMessages;
  @JsonProperty("can_send_polls")
  private boolean canSendPolls;
  @JsonProperty("can_send_other_messages")
  private boolean canSendOtherMessages;
  @JsonProperty("can_add_web_page_previews")
  private boolean canAddWebPagePreviews;
  @JsonProperty("can_change_info")
  private boolean canChangeInfo;
  @JsonProperty("can_invite_users")
  private boolean canInviteUsers;
  @JsonProperty("can_pin_messages")
  private boolean canPinMessages;

  public boolean isCanSendMessages() {
    return canSendMessages;
  }

  public void setCanSendMessages(boolean canSendMessages) {
    this.canSendMessages = canSendMessages;
  }

  public boolean isCanSendMediaMessages() {
    return canSendMediaMessages;
  }

  public void setCanSendMediaMessages(boolean canSendMediaMessages) {
    this.canSendMediaMessages = canSendMediaMessages;
  }

  public boolean isCanSendPolls() {
    return canSendPolls;
  }

  public void setCanSendPolls(boolean canSendPolls) {
    this.canSendPolls = canSendPolls;
  }

  public boolean isCanSendOtherMessages() {
    return canSendOtherMessages;
  }

  public void setCanSendOtherMessages(boolean canSendOtherMessages) {
    this.canSendOtherMessages = canSendOtherMessages;
  }

  public boolean isCanAddWebPagePreviews() {
    return canAddWebPagePreviews;
  }

  public void setCanAddWebPagePreviews(boolean canAddWebPagePreviews) {
    this.canAddWebPagePreviews = canAddWebPagePreviews;
  }

  public boolean isCanChangeInfo() {
    return canChangeInfo;
  }

  public void setCanChangeInfo(boolean canChangeInfo) {
    this.canChangeInfo = canChangeInfo;
  }

  public boolean isCanInviteUsers() {
    return canInviteUsers;
  }

  public void setCanInviteUsers(boolean canInviteUsers) {
    this.canInviteUsers = canInviteUsers;
  }

  public boolean isCanPinMessages() {
    return canPinMessages;
  }

  public void setCanPinMessages(boolean canPinMessages) {
    this.canPinMessages = canPinMessages;
  }

  @Override
  public String toString() {
    return "TgChatPermissions{" +
        "canSendMessages=" + canSendMessages +
        ", canSendMediaMessages=" + canSendMediaMessages +
        ", canSendPolls=" + canSendPolls +
        ", canSendOtherMessages=" + canSendOtherMessages +
        ", canAddWebPagePreviews=" + canAddWebPagePreviews +
        ", canChangeInfo=" + canChangeInfo +
        ", canInviteUsers=" + canInviteUsers +
        ", canPinMessages=" + canPinMessages +
        '}';
  }
}
