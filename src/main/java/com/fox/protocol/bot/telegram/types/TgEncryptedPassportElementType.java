package com.fox.protocol.bot.telegram.types;

public enum TgEncryptedPassportElementType implements TgTypeFather {
  PERSONAL_DETAILS("personal_details"),
  PASSPORT("passport"),
  DRIVER_LICENSE("driver_license"),
  IDENTITY_CARD("identity_card"),
  INTERNAL_PASSPORT("internal_passport"),
  ADDRESS("address"),
  UTILITY_BILL("utility_bill"),
  BANK_STATEMENT("bank_statement"),
  RENTAL_AGREEMENT("rental_agreement"),
  PASSPORT_REGISTRATION("passport_registration"),
  TEMPORARY_REGISTRATION("temporary_registration"),
  PHONE_NUMBER("phone_number"),
  EMAIL("email");

  private final String tgOriginalValue;


  TgEncryptedPassportElementType(final String tgOriginalValue) {
    this.tgOriginalValue = tgOriginalValue;
  }

  public String getTgOriginalValue() {
    return tgOriginalValue;
  }
}
