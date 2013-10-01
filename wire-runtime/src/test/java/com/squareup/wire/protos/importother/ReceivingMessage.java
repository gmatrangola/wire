// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/import_other.proto
package com.squareup.wire.protos.importother;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Label.REQUIRED;

public final class ReceivingMessage extends Message {

  /**
   * Pulled in by the import.
   */
  @ProtoField(tag = 1, label = REQUIRED)
  public final ImportedMessage item;

  private ReceivingMessage(Builder builder) {
    super(builder);
    this.item = builder.item;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ReceivingMessage)) return false;
    return equals(item, ((ReceivingMessage) other).item);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = item != null ? item.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<ReceivingMessage> {

    public ImportedMessage item;

    public Builder() {
    }

    public Builder(ReceivingMessage message) {
      super(message);
      if (message == null) return;
      this.item = message.item;
    }

    public Builder item(ImportedMessage item) {
      this.item = item;
      return this;
    }

    @Override
    public ReceivingMessage build() {
      checkRequiredFields();
      return new ReceivingMessage(this);
    }
  }
}