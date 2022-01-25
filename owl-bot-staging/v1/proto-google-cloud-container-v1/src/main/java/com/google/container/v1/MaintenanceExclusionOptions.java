// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * Represents the Maintenance exclusion option.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.MaintenanceExclusionOptions}
 */
public final class MaintenanceExclusionOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.MaintenanceExclusionOptions)
    MaintenanceExclusionOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MaintenanceExclusionOptions.newBuilder() to construct.
  private MaintenanceExclusionOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MaintenanceExclusionOptions() {
    scope_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MaintenanceExclusionOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MaintenanceExclusionOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            scope_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_MaintenanceExclusionOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_MaintenanceExclusionOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.MaintenanceExclusionOptions.class, com.google.container.v1.MaintenanceExclusionOptions.Builder.class);
  }

  /**
   * <pre>
   * Scope of exclusion.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1.MaintenanceExclusionOptions.Scope}
   */
  public enum Scope
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * NO_UPGRADES excludes all upgrades, including patch upgrades and minor
     * upgrades across control planes and nodes. This is the default exclusion
     * behavior.
     * </pre>
     *
     * <code>NO_UPGRADES = 0;</code>
     */
    NO_UPGRADES(0),
    /**
     * <pre>
     * NO_MINOR_UPGRADES excludes all minor upgrades for the cluster, only
     * patches are allowed.
     * </pre>
     *
     * <code>NO_MINOR_UPGRADES = 1;</code>
     */
    NO_MINOR_UPGRADES(1),
    /**
     * <pre>
     * NO_MINOR_OR_NODE_UPGRADES excludes all minor upgrades for the cluster,
     * and also exclude all node pool upgrades. Only control
     * plane patches are allowed.
     * </pre>
     *
     * <code>NO_MINOR_OR_NODE_UPGRADES = 2;</code>
     */
    NO_MINOR_OR_NODE_UPGRADES(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * NO_UPGRADES excludes all upgrades, including patch upgrades and minor
     * upgrades across control planes and nodes. This is the default exclusion
     * behavior.
     * </pre>
     *
     * <code>NO_UPGRADES = 0;</code>
     */
    public static final int NO_UPGRADES_VALUE = 0;
    /**
     * <pre>
     * NO_MINOR_UPGRADES excludes all minor upgrades for the cluster, only
     * patches are allowed.
     * </pre>
     *
     * <code>NO_MINOR_UPGRADES = 1;</code>
     */
    public static final int NO_MINOR_UPGRADES_VALUE = 1;
    /**
     * <pre>
     * NO_MINOR_OR_NODE_UPGRADES excludes all minor upgrades for the cluster,
     * and also exclude all node pool upgrades. Only control
     * plane patches are allowed.
     * </pre>
     *
     * <code>NO_MINOR_OR_NODE_UPGRADES = 2;</code>
     */
    public static final int NO_MINOR_OR_NODE_UPGRADES_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Scope valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Scope forNumber(int value) {
      switch (value) {
        case 0: return NO_UPGRADES;
        case 1: return NO_MINOR_UPGRADES;
        case 2: return NO_MINOR_OR_NODE_UPGRADES;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Scope>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Scope> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Scope>() {
            public Scope findValueByNumber(int number) {
              return Scope.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.container.v1.MaintenanceExclusionOptions.getDescriptor().getEnumTypes().get(0);
    }

    private static final Scope[] VALUES = values();

    public static Scope valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Scope(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1.MaintenanceExclusionOptions.Scope)
  }

  public static final int SCOPE_FIELD_NUMBER = 1;
  private int scope_;
  /**
   * <pre>
   * Scope specifies the upgrade scope which upgrades are blocked by the
   * exclusion.
   * </pre>
   *
   * <code>.google.container.v1.MaintenanceExclusionOptions.Scope scope = 1;</code>
   * @return The enum numeric value on the wire for scope.
   */
  @java.lang.Override public int getScopeValue() {
    return scope_;
  }
  /**
   * <pre>
   * Scope specifies the upgrade scope which upgrades are blocked by the
   * exclusion.
   * </pre>
   *
   * <code>.google.container.v1.MaintenanceExclusionOptions.Scope scope = 1;</code>
   * @return The scope.
   */
  @java.lang.Override public com.google.container.v1.MaintenanceExclusionOptions.Scope getScope() {
    @SuppressWarnings("deprecation")
    com.google.container.v1.MaintenanceExclusionOptions.Scope result = com.google.container.v1.MaintenanceExclusionOptions.Scope.valueOf(scope_);
    return result == null ? com.google.container.v1.MaintenanceExclusionOptions.Scope.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (scope_ != com.google.container.v1.MaintenanceExclusionOptions.Scope.NO_UPGRADES.getNumber()) {
      output.writeEnum(1, scope_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scope_ != com.google.container.v1.MaintenanceExclusionOptions.Scope.NO_UPGRADES.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, scope_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.container.v1.MaintenanceExclusionOptions)) {
      return super.equals(obj);
    }
    com.google.container.v1.MaintenanceExclusionOptions other = (com.google.container.v1.MaintenanceExclusionOptions) obj;

    if (scope_ != other.scope_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SCOPE_FIELD_NUMBER;
    hash = (53 * hash) + scope_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.MaintenanceExclusionOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.MaintenanceExclusionOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.MaintenanceExclusionOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.MaintenanceExclusionOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.MaintenanceExclusionOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.MaintenanceExclusionOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.MaintenanceExclusionOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.MaintenanceExclusionOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.MaintenanceExclusionOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1.MaintenanceExclusionOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.MaintenanceExclusionOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.MaintenanceExclusionOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.container.v1.MaintenanceExclusionOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * Represents the Maintenance exclusion option.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.MaintenanceExclusionOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.MaintenanceExclusionOptions)
      com.google.container.v1.MaintenanceExclusionOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_MaintenanceExclusionOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_MaintenanceExclusionOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.MaintenanceExclusionOptions.class, com.google.container.v1.MaintenanceExclusionOptions.Builder.class);
    }

    // Construct using com.google.container.v1.MaintenanceExclusionOptions.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      scope_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_MaintenanceExclusionOptions_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.MaintenanceExclusionOptions getDefaultInstanceForType() {
      return com.google.container.v1.MaintenanceExclusionOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.MaintenanceExclusionOptions build() {
      com.google.container.v1.MaintenanceExclusionOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.MaintenanceExclusionOptions buildPartial() {
      com.google.container.v1.MaintenanceExclusionOptions result = new com.google.container.v1.MaintenanceExclusionOptions(this);
      result.scope_ = scope_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1.MaintenanceExclusionOptions) {
        return mergeFrom((com.google.container.v1.MaintenanceExclusionOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.MaintenanceExclusionOptions other) {
      if (other == com.google.container.v1.MaintenanceExclusionOptions.getDefaultInstance()) return this;
      if (other.scope_ != 0) {
        setScopeValue(other.getScopeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.container.v1.MaintenanceExclusionOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.MaintenanceExclusionOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int scope_ = 0;
    /**
     * <pre>
     * Scope specifies the upgrade scope which upgrades are blocked by the
     * exclusion.
     * </pre>
     *
     * <code>.google.container.v1.MaintenanceExclusionOptions.Scope scope = 1;</code>
     * @return The enum numeric value on the wire for scope.
     */
    @java.lang.Override public int getScopeValue() {
      return scope_;
    }
    /**
     * <pre>
     * Scope specifies the upgrade scope which upgrades are blocked by the
     * exclusion.
     * </pre>
     *
     * <code>.google.container.v1.MaintenanceExclusionOptions.Scope scope = 1;</code>
     * @param value The enum numeric value on the wire for scope to set.
     * @return This builder for chaining.
     */
    public Builder setScopeValue(int value) {
      
      scope_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scope specifies the upgrade scope which upgrades are blocked by the
     * exclusion.
     * </pre>
     *
     * <code>.google.container.v1.MaintenanceExclusionOptions.Scope scope = 1;</code>
     * @return The scope.
     */
    @java.lang.Override
    public com.google.container.v1.MaintenanceExclusionOptions.Scope getScope() {
      @SuppressWarnings("deprecation")
      com.google.container.v1.MaintenanceExclusionOptions.Scope result = com.google.container.v1.MaintenanceExclusionOptions.Scope.valueOf(scope_);
      return result == null ? com.google.container.v1.MaintenanceExclusionOptions.Scope.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Scope specifies the upgrade scope which upgrades are blocked by the
     * exclusion.
     * </pre>
     *
     * <code>.google.container.v1.MaintenanceExclusionOptions.Scope scope = 1;</code>
     * @param value The scope to set.
     * @return This builder for chaining.
     */
    public Builder setScope(com.google.container.v1.MaintenanceExclusionOptions.Scope value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      scope_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scope specifies the upgrade scope which upgrades are blocked by the
     * exclusion.
     * </pre>
     *
     * <code>.google.container.v1.MaintenanceExclusionOptions.Scope scope = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScope() {
      
      scope_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.container.v1.MaintenanceExclusionOptions)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.MaintenanceExclusionOptions)
  private static final com.google.container.v1.MaintenanceExclusionOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.MaintenanceExclusionOptions();
  }

  public static com.google.container.v1.MaintenanceExclusionOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MaintenanceExclusionOptions>
      PARSER = new com.google.protobuf.AbstractParser<MaintenanceExclusionOptions>() {
    @java.lang.Override
    public MaintenanceExclusionOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MaintenanceExclusionOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MaintenanceExclusionOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MaintenanceExclusionOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.MaintenanceExclusionOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

