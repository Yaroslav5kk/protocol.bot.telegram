package com.fox.protocol.bot.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fox.protocol.bot.telegram.types.TgPollType;

import java.util.List;

public class TgPoll {
  private String id;
  private String question;
  private List<TgPollOption> options;
  @JsonProperty("total_voter_count")
  private int totalVoterCount;
  @JsonProperty("is_closed")
  private boolean isClosed;
  @JsonProperty("is_anonymous")
  private boolean isAnonymous;
  private TgPollType type;
  @JsonProperty("allows_multiple_answers")
  private boolean allowsMultipleAnswers;
  @JsonProperty("correct_option_id")
  private int correctOptionsId;
  private String explanation;
  @JsonProperty("explanation_entities")
  private List<TgMessageEntity> explanationEntities;
  @JsonProperty("open_period")
  private int openPeriod;
  @JsonProperty("close_date")
  private int closeDate;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public List<TgPollOption> getOptions() {
    return options;
  }

  public void setOptions(List<TgPollOption> options) {
    this.options = options;
  }

  public int getTotalVoterCount() {
    return totalVoterCount;
  }

  public void setTotalVoterCount(int totalVoterCount) {
    this.totalVoterCount = totalVoterCount;
  }

  public boolean isClosed() {
    return isClosed;
  }

  public void setClosed(boolean closed) {
    isClosed = closed;
  }

  public boolean isAnonymous() {
    return isAnonymous;
  }

  public void setAnonymous(boolean anonymous) {
    isAnonymous = anonymous;
  }

  public TgPollType getType() {
    return type;
  }

  public void setType(TgPollType type) {
    this.type = type;
  }

  public boolean isAllowsMultipleAnswers() {
    return allowsMultipleAnswers;
  }

  public void setAllowsMultipleAnswers(boolean allowsMultipleAnswers) {
    this.allowsMultipleAnswers = allowsMultipleAnswers;
  }

  public int getCorrectOptionsId() {
    return correctOptionsId;
  }

  public void setCorrectOptionsId(int correctOptionsId) {
    this.correctOptionsId = correctOptionsId;
  }

  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public List<TgMessageEntity> getExplanationEntities() {
    return explanationEntities;
  }

  public void setExplanationEntities(List<TgMessageEntity> explanationEntities) {
    this.explanationEntities = explanationEntities;
  }

  public int getOpenPeriod() {
    return openPeriod;
  }

  public void setOpenPeriod(int openPeriod) {
    this.openPeriod = openPeriod;
  }

  public int getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(int closeDate) {
    this.closeDate = closeDate;
  }
}
