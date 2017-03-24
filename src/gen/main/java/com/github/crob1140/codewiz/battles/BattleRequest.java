// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: code_interpreter.proto

package com.github.crob1140.codewiz.battles;

/**
 * Protobuf type {@code BattleRequest}
 */
public  final class BattleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BattleRequest)
    BattleRequestOrBuilder {
  // Use BattleRequest.newBuilder() to construct.
  private BattleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BattleRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BattleRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.github.crob1140.codewiz.battles.BattleDetails.Builder subBuilder = null;
            if (valueCase_ == 1) {
              subBuilder = ((com.github.crob1140.codewiz.battles.BattleDetails) value_).toBuilder();
            }
            value_ =
                input.readMessage(com.github.crob1140.codewiz.battles.BattleDetails.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.github.crob1140.codewiz.battles.BattleDetails) value_);
              value_ = subBuilder.buildPartial();
            }
            valueCase_ = 1;
            break;
          }
          case 18: {
            com.github.crob1140.codewiz.battles.BattleEvent.Builder subBuilder = null;
            if (valueCase_ == 2) {
              subBuilder = ((com.github.crob1140.codewiz.battles.BattleEvent) value_).toBuilder();
            }
            value_ =
                input.readMessage(com.github.crob1140.codewiz.battles.BattleEvent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.github.crob1140.codewiz.battles.BattleEvent) value_);
              value_ = subBuilder.buildPartial();
            }
            valueCase_ = 2;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.crob1140.codewiz.battles.CodeInterpreter.internal_static_BattleRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.crob1140.codewiz.battles.CodeInterpreter.internal_static_BattleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.crob1140.codewiz.battles.BattleRequest.class, com.github.crob1140.codewiz.battles.BattleRequest.Builder.class);
  }

  private int valueCase_ = 0;
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite {
    BATTLE_DETAILS(1),
    BATTLE_EVENT(2),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 1: return BATTLE_DETAILS;
        case 2: return BATTLE_EVENT;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int BATTLE_DETAILS_FIELD_NUMBER = 1;
  /**
   * <code>optional .BattleDetails battle_details = 1;</code>
   */
  public com.github.crob1140.codewiz.battles.BattleDetails getBattleDetails() {
    if (valueCase_ == 1) {
       return (com.github.crob1140.codewiz.battles.BattleDetails) value_;
    }
    return com.github.crob1140.codewiz.battles.BattleDetails.getDefaultInstance();
  }
  /**
   * <code>optional .BattleDetails battle_details = 1;</code>
   */
  public com.github.crob1140.codewiz.battles.BattleDetailsOrBuilder getBattleDetailsOrBuilder() {
    if (valueCase_ == 1) {
       return (com.github.crob1140.codewiz.battles.BattleDetails) value_;
    }
    return com.github.crob1140.codewiz.battles.BattleDetails.getDefaultInstance();
  }

  public static final int BATTLE_EVENT_FIELD_NUMBER = 2;
  /**
   * <code>optional .BattleEvent battle_event = 2;</code>
   */
  public com.github.crob1140.codewiz.battles.BattleEvent getBattleEvent() {
    if (valueCase_ == 2) {
       return (com.github.crob1140.codewiz.battles.BattleEvent) value_;
    }
    return com.github.crob1140.codewiz.battles.BattleEvent.getDefaultInstance();
  }
  /**
   * <code>optional .BattleEvent battle_event = 2;</code>
   */
  public com.github.crob1140.codewiz.battles.BattleEventOrBuilder getBattleEventOrBuilder() {
    if (valueCase_ == 2) {
       return (com.github.crob1140.codewiz.battles.BattleEvent) value_;
    }
    return com.github.crob1140.codewiz.battles.BattleEvent.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (valueCase_ == 1) {
      output.writeMessage(1, (com.github.crob1140.codewiz.battles.BattleDetails) value_);
    }
    if (valueCase_ == 2) {
      output.writeMessage(2, (com.github.crob1140.codewiz.battles.BattleEvent) value_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valueCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.github.crob1140.codewiz.battles.BattleDetails) value_);
    }
    if (valueCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.github.crob1140.codewiz.battles.BattleEvent) value_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.crob1140.codewiz.battles.BattleRequest)) {
      return super.equals(obj);
    }
    com.github.crob1140.codewiz.battles.BattleRequest other = (com.github.crob1140.codewiz.battles.BattleRequest) obj;

    boolean result = true;
    result = result && getValueCase().equals(
        other.getValueCase());
    if (!result) return false;
    switch (valueCase_) {
      case 1:
        result = result && getBattleDetails()
            .equals(other.getBattleDetails());
        break;
      case 2:
        result = result && getBattleEvent()
            .equals(other.getBattleEvent());
        break;
      case 0:
      default:
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    switch (valueCase_) {
      case 1:
        hash = (37 * hash) + BATTLE_DETAILS_FIELD_NUMBER;
        hash = (53 * hash) + getBattleDetails().hashCode();
        break;
      case 2:
        hash = (37 * hash) + BATTLE_EVENT_FIELD_NUMBER;
        hash = (53 * hash) + getBattleEvent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.crob1140.codewiz.battles.BattleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.crob1140.codewiz.battles.BattleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.crob1140.codewiz.battles.BattleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.crob1140.codewiz.battles.BattleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.crob1140.codewiz.battles.BattleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.crob1140.codewiz.battles.BattleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.crob1140.codewiz.battles.BattleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.crob1140.codewiz.battles.BattleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.crob1140.codewiz.battles.BattleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.crob1140.codewiz.battles.BattleRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.crob1140.codewiz.battles.BattleRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code BattleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BattleRequest)
      com.github.crob1140.codewiz.battles.BattleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.crob1140.codewiz.battles.CodeInterpreter.internal_static_BattleRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.crob1140.codewiz.battles.CodeInterpreter.internal_static_BattleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.crob1140.codewiz.battles.BattleRequest.class, com.github.crob1140.codewiz.battles.BattleRequest.Builder.class);
    }

    // Construct using com.github.crob1140.codewiz.battles.BattleRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.crob1140.codewiz.battles.CodeInterpreter.internal_static_BattleRequest_descriptor;
    }

    public com.github.crob1140.codewiz.battles.BattleRequest getDefaultInstanceForType() {
      return com.github.crob1140.codewiz.battles.BattleRequest.getDefaultInstance();
    }

    public com.github.crob1140.codewiz.battles.BattleRequest build() {
      com.github.crob1140.codewiz.battles.BattleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.crob1140.codewiz.battles.BattleRequest buildPartial() {
      com.github.crob1140.codewiz.battles.BattleRequest result = new com.github.crob1140.codewiz.battles.BattleRequest(this);
      if (valueCase_ == 1) {
        if (battleDetailsBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = battleDetailsBuilder_.build();
        }
      }
      if (valueCase_ == 2) {
        if (battleEventBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = battleEventBuilder_.build();
        }
      }
      result.valueCase_ = valueCase_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.crob1140.codewiz.battles.BattleRequest) {
        return mergeFrom((com.github.crob1140.codewiz.battles.BattleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.crob1140.codewiz.battles.BattleRequest other) {
      if (other == com.github.crob1140.codewiz.battles.BattleRequest.getDefaultInstance()) return this;
      switch (other.getValueCase()) {
        case BATTLE_DETAILS: {
          mergeBattleDetails(other.getBattleDetails());
          break;
        }
        case BATTLE_EVENT: {
          mergeBattleEvent(other.getBattleEvent());
          break;
        }
        case VALUE_NOT_SET: {
          break;
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.crob1140.codewiz.battles.BattleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.crob1140.codewiz.battles.BattleRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.crob1140.codewiz.battles.BattleDetails, com.github.crob1140.codewiz.battles.BattleDetails.Builder, com.github.crob1140.codewiz.battles.BattleDetailsOrBuilder> battleDetailsBuilder_;
    /**
     * <code>optional .BattleDetails battle_details = 1;</code>
     */
    public com.github.crob1140.codewiz.battles.BattleDetails getBattleDetails() {
      if (battleDetailsBuilder_ == null) {
        if (valueCase_ == 1) {
          return (com.github.crob1140.codewiz.battles.BattleDetails) value_;
        }
        return com.github.crob1140.codewiz.battles.BattleDetails.getDefaultInstance();
      } else {
        if (valueCase_ == 1) {
          return battleDetailsBuilder_.getMessage();
        }
        return com.github.crob1140.codewiz.battles.BattleDetails.getDefaultInstance();
      }
    }
    /**
     * <code>optional .BattleDetails battle_details = 1;</code>
     */
    public Builder setBattleDetails(com.github.crob1140.codewiz.battles.BattleDetails value) {
      if (battleDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        battleDetailsBuilder_.setMessage(value);
      }
      valueCase_ = 1;
      return this;
    }
    /**
     * <code>optional .BattleDetails battle_details = 1;</code>
     */
    public Builder setBattleDetails(
        com.github.crob1140.codewiz.battles.BattleDetails.Builder builderForValue) {
      if (battleDetailsBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        battleDetailsBuilder_.setMessage(builderForValue.build());
      }
      valueCase_ = 1;
      return this;
    }
    /**
     * <code>optional .BattleDetails battle_details = 1;</code>
     */
    public Builder mergeBattleDetails(com.github.crob1140.codewiz.battles.BattleDetails value) {
      if (battleDetailsBuilder_ == null) {
        if (valueCase_ == 1 &&
            value_ != com.github.crob1140.codewiz.battles.BattleDetails.getDefaultInstance()) {
          value_ = com.github.crob1140.codewiz.battles.BattleDetails.newBuilder((com.github.crob1140.codewiz.battles.BattleDetails) value_)
              .mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        if (valueCase_ == 1) {
          battleDetailsBuilder_.mergeFrom(value);
        }
        battleDetailsBuilder_.setMessage(value);
      }
      valueCase_ = 1;
      return this;
    }
    /**
     * <code>optional .BattleDetails battle_details = 1;</code>
     */
    public Builder clearBattleDetails() {
      if (battleDetailsBuilder_ == null) {
        if (valueCase_ == 1) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
      } else {
        if (valueCase_ == 1) {
          valueCase_ = 0;
          value_ = null;
        }
        battleDetailsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>optional .BattleDetails battle_details = 1;</code>
     */
    public com.github.crob1140.codewiz.battles.BattleDetails.Builder getBattleDetailsBuilder() {
      return getBattleDetailsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .BattleDetails battle_details = 1;</code>
     */
    public com.github.crob1140.codewiz.battles.BattleDetailsOrBuilder getBattleDetailsOrBuilder() {
      if ((valueCase_ == 1) && (battleDetailsBuilder_ != null)) {
        return battleDetailsBuilder_.getMessageOrBuilder();
      } else {
        if (valueCase_ == 1) {
          return (com.github.crob1140.codewiz.battles.BattleDetails) value_;
        }
        return com.github.crob1140.codewiz.battles.BattleDetails.getDefaultInstance();
      }
    }
    /**
     * <code>optional .BattleDetails battle_details = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.crob1140.codewiz.battles.BattleDetails, com.github.crob1140.codewiz.battles.BattleDetails.Builder, com.github.crob1140.codewiz.battles.BattleDetailsOrBuilder> 
        getBattleDetailsFieldBuilder() {
      if (battleDetailsBuilder_ == null) {
        if (!(valueCase_ == 1)) {
          value_ = com.github.crob1140.codewiz.battles.BattleDetails.getDefaultInstance();
        }
        battleDetailsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.crob1140.codewiz.battles.BattleDetails, com.github.crob1140.codewiz.battles.BattleDetails.Builder, com.github.crob1140.codewiz.battles.BattleDetailsOrBuilder>(
                (com.github.crob1140.codewiz.battles.BattleDetails) value_,
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      valueCase_ = 1;
      onChanged();;
      return battleDetailsBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.crob1140.codewiz.battles.BattleEvent, com.github.crob1140.codewiz.battles.BattleEvent.Builder, com.github.crob1140.codewiz.battles.BattleEventOrBuilder> battleEventBuilder_;
    /**
     * <code>optional .BattleEvent battle_event = 2;</code>
     */
    public com.github.crob1140.codewiz.battles.BattleEvent getBattleEvent() {
      if (battleEventBuilder_ == null) {
        if (valueCase_ == 2) {
          return (com.github.crob1140.codewiz.battles.BattleEvent) value_;
        }
        return com.github.crob1140.codewiz.battles.BattleEvent.getDefaultInstance();
      } else {
        if (valueCase_ == 2) {
          return battleEventBuilder_.getMessage();
        }
        return com.github.crob1140.codewiz.battles.BattleEvent.getDefaultInstance();
      }
    }
    /**
     * <code>optional .BattleEvent battle_event = 2;</code>
     */
    public Builder setBattleEvent(com.github.crob1140.codewiz.battles.BattleEvent value) {
      if (battleEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        battleEventBuilder_.setMessage(value);
      }
      valueCase_ = 2;
      return this;
    }
    /**
     * <code>optional .BattleEvent battle_event = 2;</code>
     */
    public Builder setBattleEvent(
        com.github.crob1140.codewiz.battles.BattleEvent.Builder builderForValue) {
      if (battleEventBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        battleEventBuilder_.setMessage(builderForValue.build());
      }
      valueCase_ = 2;
      return this;
    }
    /**
     * <code>optional .BattleEvent battle_event = 2;</code>
     */
    public Builder mergeBattleEvent(com.github.crob1140.codewiz.battles.BattleEvent value) {
      if (battleEventBuilder_ == null) {
        if (valueCase_ == 2 &&
            value_ != com.github.crob1140.codewiz.battles.BattleEvent.getDefaultInstance()) {
          value_ = com.github.crob1140.codewiz.battles.BattleEvent.newBuilder((com.github.crob1140.codewiz.battles.BattleEvent) value_)
              .mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        if (valueCase_ == 2) {
          battleEventBuilder_.mergeFrom(value);
        }
        battleEventBuilder_.setMessage(value);
      }
      valueCase_ = 2;
      return this;
    }
    /**
     * <code>optional .BattleEvent battle_event = 2;</code>
     */
    public Builder clearBattleEvent() {
      if (battleEventBuilder_ == null) {
        if (valueCase_ == 2) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
      } else {
        if (valueCase_ == 2) {
          valueCase_ = 0;
          value_ = null;
        }
        battleEventBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>optional .BattleEvent battle_event = 2;</code>
     */
    public com.github.crob1140.codewiz.battles.BattleEvent.Builder getBattleEventBuilder() {
      return getBattleEventFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .BattleEvent battle_event = 2;</code>
     */
    public com.github.crob1140.codewiz.battles.BattleEventOrBuilder getBattleEventOrBuilder() {
      if ((valueCase_ == 2) && (battleEventBuilder_ != null)) {
        return battleEventBuilder_.getMessageOrBuilder();
      } else {
        if (valueCase_ == 2) {
          return (com.github.crob1140.codewiz.battles.BattleEvent) value_;
        }
        return com.github.crob1140.codewiz.battles.BattleEvent.getDefaultInstance();
      }
    }
    /**
     * <code>optional .BattleEvent battle_event = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.crob1140.codewiz.battles.BattleEvent, com.github.crob1140.codewiz.battles.BattleEvent.Builder, com.github.crob1140.codewiz.battles.BattleEventOrBuilder> 
        getBattleEventFieldBuilder() {
      if (battleEventBuilder_ == null) {
        if (!(valueCase_ == 2)) {
          value_ = com.github.crob1140.codewiz.battles.BattleEvent.getDefaultInstance();
        }
        battleEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.crob1140.codewiz.battles.BattleEvent, com.github.crob1140.codewiz.battles.BattleEvent.Builder, com.github.crob1140.codewiz.battles.BattleEventOrBuilder>(
                (com.github.crob1140.codewiz.battles.BattleEvent) value_,
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      valueCase_ = 2;
      onChanged();;
      return battleEventBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:BattleRequest)
  }

  // @@protoc_insertion_point(class_scope:BattleRequest)
  private static final com.github.crob1140.codewiz.battles.BattleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.crob1140.codewiz.battles.BattleRequest();
  }

  public static com.github.crob1140.codewiz.battles.BattleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BattleRequest>
      PARSER = new com.google.protobuf.AbstractParser<BattleRequest>() {
    public BattleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BattleRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BattleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BattleRequest> getParserForType() {
    return PARSER;
  }

  public com.github.crob1140.codewiz.battles.BattleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
