// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 * <pre>
 * MonitoringConfig is cluster monitoring configuration.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.MonitoringConfig}
 */
public final class MonitoringConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.MonitoringConfig)
    MonitoringConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MonitoringConfig.newBuilder() to construct.
  private MonitoringConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MonitoringConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MonitoringConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MonitoringConfig(
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
          case 10: {
            com.google.container.v1beta1.MonitoringComponentConfig.Builder subBuilder = null;
            if (componentConfig_ != null) {
              subBuilder = componentConfig_.toBuilder();
            }
            componentConfig_ = input.readMessage(com.google.container.v1beta1.MonitoringComponentConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(componentConfig_);
              componentConfig_ = subBuilder.buildPartial();
            }

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
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_MonitoringConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_MonitoringConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.MonitoringConfig.class, com.google.container.v1beta1.MonitoringConfig.Builder.class);
  }

  public static final int COMPONENT_CONFIG_FIELD_NUMBER = 1;
  private com.google.container.v1beta1.MonitoringComponentConfig componentConfig_;
  /**
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
   * @return Whether the componentConfig field is set.
   */
  @java.lang.Override
  public boolean hasComponentConfig() {
    return componentConfig_ != null;
  }
  /**
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
   * @return The componentConfig.
   */
  @java.lang.Override
  public com.google.container.v1beta1.MonitoringComponentConfig getComponentConfig() {
    return componentConfig_ == null ? com.google.container.v1beta1.MonitoringComponentConfig.getDefaultInstance() : componentConfig_;
  }
  /**
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1beta1.MonitoringComponentConfigOrBuilder getComponentConfigOrBuilder() {
    return getComponentConfig();
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
    if (componentConfig_ != null) {
      output.writeMessage(1, getComponentConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (componentConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getComponentConfig());
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
    if (!(obj instanceof com.google.container.v1beta1.MonitoringConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.MonitoringConfig other = (com.google.container.v1beta1.MonitoringConfig) obj;

    if (hasComponentConfig() != other.hasComponentConfig()) return false;
    if (hasComponentConfig()) {
      if (!getComponentConfig()
          .equals(other.getComponentConfig())) return false;
    }
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
    if (hasComponentConfig()) {
      hash = (37 * hash) + COMPONENT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getComponentConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.MonitoringConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.MonitoringConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.MonitoringConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.MonitoringConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.MonitoringConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.MonitoringConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.MonitoringConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.MonitoringConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1beta1.MonitoringConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.MonitoringConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1beta1.MonitoringConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.MonitoringConfig parseFrom(
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
  public static Builder newBuilder(com.google.container.v1beta1.MonitoringConfig prototype) {
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
   * MonitoringConfig is cluster monitoring configuration.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.MonitoringConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.MonitoringConfig)
      com.google.container.v1beta1.MonitoringConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_MonitoringConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_MonitoringConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.MonitoringConfig.class, com.google.container.v1beta1.MonitoringConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.MonitoringConfig.newBuilder()
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
      if (componentConfigBuilder_ == null) {
        componentConfig_ = null;
      } else {
        componentConfig_ = null;
        componentConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_MonitoringConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.MonitoringConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.MonitoringConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.MonitoringConfig build() {
      com.google.container.v1beta1.MonitoringConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.MonitoringConfig buildPartial() {
      com.google.container.v1beta1.MonitoringConfig result = new com.google.container.v1beta1.MonitoringConfig(this);
      if (componentConfigBuilder_ == null) {
        result.componentConfig_ = componentConfig_;
      } else {
        result.componentConfig_ = componentConfigBuilder_.build();
      }
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
      if (other instanceof com.google.container.v1beta1.MonitoringConfig) {
        return mergeFrom((com.google.container.v1beta1.MonitoringConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.MonitoringConfig other) {
      if (other == com.google.container.v1beta1.MonitoringConfig.getDefaultInstance()) return this;
      if (other.hasComponentConfig()) {
        mergeComponentConfig(other.getComponentConfig());
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
      com.google.container.v1beta1.MonitoringConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1beta1.MonitoringConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.container.v1beta1.MonitoringComponentConfig componentConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1beta1.MonitoringComponentConfig, com.google.container.v1beta1.MonitoringComponentConfig.Builder, com.google.container.v1beta1.MonitoringComponentConfigOrBuilder> componentConfigBuilder_;
    /**
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
     * @return Whether the componentConfig field is set.
     */
    public boolean hasComponentConfig() {
      return componentConfigBuilder_ != null || componentConfig_ != null;
    }
    /**
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
     * @return The componentConfig.
     */
    public com.google.container.v1beta1.MonitoringComponentConfig getComponentConfig() {
      if (componentConfigBuilder_ == null) {
        return componentConfig_ == null ? com.google.container.v1beta1.MonitoringComponentConfig.getDefaultInstance() : componentConfig_;
      } else {
        return componentConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
     */
    public Builder setComponentConfig(com.google.container.v1beta1.MonitoringComponentConfig value) {
      if (componentConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        componentConfig_ = value;
        onChanged();
      } else {
        componentConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
     */
    public Builder setComponentConfig(
        com.google.container.v1beta1.MonitoringComponentConfig.Builder builderForValue) {
      if (componentConfigBuilder_ == null) {
        componentConfig_ = builderForValue.build();
        onChanged();
      } else {
        componentConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
     */
    public Builder mergeComponentConfig(com.google.container.v1beta1.MonitoringComponentConfig value) {
      if (componentConfigBuilder_ == null) {
        if (componentConfig_ != null) {
          componentConfig_ =
            com.google.container.v1beta1.MonitoringComponentConfig.newBuilder(componentConfig_).mergeFrom(value).buildPartial();
        } else {
          componentConfig_ = value;
        }
        onChanged();
      } else {
        componentConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
     */
    public Builder clearComponentConfig() {
      if (componentConfigBuilder_ == null) {
        componentConfig_ = null;
        onChanged();
      } else {
        componentConfig_ = null;
        componentConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
     */
    public com.google.container.v1beta1.MonitoringComponentConfig.Builder getComponentConfigBuilder() {
      
      onChanged();
      return getComponentConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
     */
    public com.google.container.v1beta1.MonitoringComponentConfigOrBuilder getComponentConfigOrBuilder() {
      if (componentConfigBuilder_ != null) {
        return componentConfigBuilder_.getMessageOrBuilder();
      } else {
        return componentConfig_ == null ?
            com.google.container.v1beta1.MonitoringComponentConfig.getDefaultInstance() : componentConfig_;
      }
    }
    /**
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1beta1.MonitoringComponentConfig, com.google.container.v1beta1.MonitoringComponentConfig.Builder, com.google.container.v1beta1.MonitoringComponentConfigOrBuilder> 
        getComponentConfigFieldBuilder() {
      if (componentConfigBuilder_ == null) {
        componentConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1beta1.MonitoringComponentConfig, com.google.container.v1beta1.MonitoringComponentConfig.Builder, com.google.container.v1beta1.MonitoringComponentConfigOrBuilder>(
                getComponentConfig(),
                getParentForChildren(),
                isClean());
        componentConfig_ = null;
      }
      return componentConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.MonitoringConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.MonitoringConfig)
  private static final com.google.container.v1beta1.MonitoringConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.MonitoringConfig();
  }

  public static com.google.container.v1beta1.MonitoringConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MonitoringConfig>
      PARSER = new com.google.protobuf.AbstractParser<MonitoringConfig>() {
    @java.lang.Override
    public MonitoringConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MonitoringConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MonitoringConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MonitoringConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.MonitoringConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

