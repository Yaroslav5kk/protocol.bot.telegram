package com.fox.protocol.bot.telegram.dto;

public class TgProximityAlertTriggered {
  private TgUser traveler;
  private TgUser watcher;
  private int distance;

  public TgUser getTraveler() {
    return traveler;
  }

  public void setTraveler(TgUser traveler) {
    this.traveler = traveler;
  }

  public TgUser getWatcher() {
    return watcher;
  }

  public void setWatcher(TgUser watcher) {
    this.watcher = watcher;
  }

  public int getDistance() {
    return distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  @Override
  public String toString() {
    return "TgProximityAlertTriggered{" +
        "traveler=" + traveler +
        ", watcher=" + watcher +
        ", distance=" + distance +
        '}';
  }
}
