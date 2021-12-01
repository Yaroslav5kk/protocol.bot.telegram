package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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
  private List<TgMessageEntity> entities;
  private TgAnimation animation;
  private TgAudio audio;
  private TgDocument document;
  private List<TgPhotoSize> photo;
  private TgSticker sticker;
  private TgVideo video;
  @JsonProperty("video_note")
  private TgVideoNote videoNote;
  private TgVoice voice;
  private String caption;
  @JsonProperty("caption_entities")
  private List<TgMessageEntity> captionEntities;
  private TgContact contact;
  private TgDice dice;
  private TgGame game;
  private TgPoll poll;
  private TgVenue venue;
  private TgLocation location;
  @JsonProperty("new_chat_members")
  private List<TgUser> newChatMembers;
  @JsonProperty("left_chat_member")
  private TgUser leftChatMember;
  private String newChatTitle;
  @JsonProperty("new_chat_photo")
  private List<TgPhotoSize> newChatPhoto;
  @JsonProperty("delete_chat_photo")
  private boolean deleteChatPhoto;
  @JsonProperty("group_chat_created")
  private boolean groupChatCreated;
  @JsonProperty("supergroup_chat_created")
  private boolean superGroupChatCreated;
  @JsonProperty("channel_chat_created")
  private boolean channelChatCreated;
  @JsonProperty("message_auto_delete_timer_changed")
  private TgMessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;
  @JsonProperty("migrate_to_chat_id")
  private int migrateToChatId;
  @JsonProperty("migrate_from_chat_id")
  private int migrateFromChatId;
  @JsonProperty("pinned_message")
  private TgMessage pinnedMessage;
  private TgInvoice invoice;
  @JsonProperty("successful_payment")
  private TgSuccessfulPayment successfulPayment;
  @JsonProperty("connected_website")
  private String connectedWebsite;
  @JsonProperty("passport_data")
  private TgPassportData passportData;
  @JsonProperty("proximity_alert_triggered")
  private TgProximityAlertTriggered proximityAlertTriggered;
  @JsonProperty("voice_chat_scheduled")
  private TgVoiceChatScheduled voiceChatScheduled;
  private

}
