package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TgMessage {
  @JsonProperty("message_id")
  private int messageId;
  private TgUser from;
  @JsonProperty("sender_chat")
  private TgChat senderChat;
  private int date;
  private TgChat chat;
  @JsonProperty("forward_from")
  private TgUser forwardFrom;
  @JsonProperty("forward_from_chat")
  private TgChat forwardFromChat;
  @JsonProperty("forward_from_message_id")
  private int forwardFromMessageId;
  @JsonProperty("forward_signature")
  private String forwardSignature;
  @JsonProperty("forward_sender_name")
  private String forwardSenderName;
  @JsonProperty("forward_date")
  private int forwardDate;
  @JsonProperty("reply_to_message")
  private TgMessage replyToMessage;
  @JsonProperty("via_bot")
  private TgUser viaBot;
  @JsonProperty("edit_date")
  private int editDate;
  @JsonProperty("media_group_id")
  private String mediaGroupId;
  @JsonProperty("author_signature")
  private String authorSignature;
  private String text;
  private

}
