/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 *
 *
 * <pre>
 * MonitoringConfig is cluster monitoring configuration.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.MonitoringConfig}
 */
public final class MonitoringConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.MonitoringConfig)
    MonitoringConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MonitoringConfig.newBuilder() to construct.
  private MonitoringConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MonitoringConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MonitoringConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_MonitoringConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_MonitoringConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.MonitoringConfig.class,
            com.google.container.v1.MonitoringConfig.Builder.class);
  }

  public static final int COMPONENT_CONFIG_FIELD_NUMBER = 1;
  private com.google.container.v1.MonitoringComponentConfig componentConfig_;
  /**
   *
   *
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
   *
   * @return Whether the componentConfig field is set.
   */
  @java.lang.Override
  public boolean hasComponentConfig() {
    return componentConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
   *
   * @return The componentConfig.
   */
  @java.lang.Override
  public com.google.container.v1.MonitoringComponentConfig getComponentConfig() {
    return componentConfig_ == null
        ? com.google.container.v1.MonitoringComponentConfig.getDefaultInstance()
        : componentConfig_;
  }
  /**
   *
   *
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1.MonitoringComponentConfigOrBuilder getComponentConfigOrBuilder() {
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (componentConfig_ != null) {
      output.writeMessage(1, getComponentConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (componentConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getComponentConfig());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.container.v1.MonitoringConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.MonitoringConfig other = (com.google.container.v1.MonitoringConfig) obj;

    if (hasComponentConfig() != other.hasComponentConfig()) return false;
    if (hasComponentConfig()) {
      if (!getComponentConfig().equals(other.getComponentConfig())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.MonitoringConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.MonitoringConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.MonitoringConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.MonitoringConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.MonitoringConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.MonitoringConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.MonitoringConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.MonitoringConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.MonitoringConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.MonitoringConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.MonitoringConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.MonitoringConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.container.v1.MonitoringConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * MonitoringConfig is cluster monitoring configuration.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.MonitoringConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.MonitoringConfig)
      com.google.container.v1.MonitoringConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_MonitoringConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_MonitoringConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.MonitoringConfig.class,
              com.google.container.v1.MonitoringConfig.Builder.class);
    }

    // Construct using com.google.container.v1.MonitoringConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
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
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_MonitoringConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.MonitoringConfig getDefaultInstanceForType() {
      return com.google.container.v1.MonitoringConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.MonitoringConfig build() {
      com.google.container.v1.MonitoringConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.MonitoringConfig buildPartial() {
      com.google.container.v1.MonitoringConfig result =
          new com.google.container.v1.MonitoringConfig(this);
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1.MonitoringConfig) {
        return mergeFrom((com.google.container.v1.MonitoringConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.MonitoringConfig other) {
      if (other == com.google.container.v1.MonitoringConfig.getDefaultInstance()) return this;
      if (other.hasComponentConfig()) {
        mergeComponentConfig(other.getComponentConfig());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getComponentConfigFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.container.v1.MonitoringComponentConfig componentConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.MonitoringComponentConfig,
            com.google.container.v1.MonitoringComponentConfig.Builder,
            com.google.container.v1.MonitoringComponentConfigOrBuilder>
        componentConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
     *
     * @return Whether the componentConfig field is set.
     */
    public boolean hasComponentConfig() {
      return componentConfigBuilder_ != null || componentConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
     *
     * @return The componentConfig.
     */
    public com.google.container.v1.MonitoringComponentConfig getComponentConfig() {
      if (componentConfigBuilder_ == null) {
        return componentConfig_ == null
            ? com.google.container.v1.MonitoringComponentConfig.getDefaultInstance()
            : componentConfig_;
      } else {
        return componentConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
     */
    public Builder setComponentConfig(com.google.container.v1.MonitoringComponentConfig value) {
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
     *
     *
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
     */
    public Builder setComponentConfig(
        com.google.container.v1.MonitoringComponentConfig.Builder builderForValue) {
      if (componentConfigBuilder_ == null) {
        componentConfig_ = builderForValue.build();
        onChanged();
      } else {
        componentConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
     */
    public Builder mergeComponentConfig(com.google.container.v1.MonitoringComponentConfig value) {
      if (componentConfigBuilder_ == null) {
        if (componentConfig_ != null) {
          componentConfig_ =
              com.google.container.v1.MonitoringComponentConfig.newBuilder(componentConfig_)
                  .mergeFrom(value)
                  .buildPartial();
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
     *
     *
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
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
     *
     *
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
     */
    public com.google.container.v1.MonitoringComponentConfig.Builder getComponentConfigBuilder() {

      onChanged();
      return getComponentConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
     */
    public com.google.container.v1.MonitoringComponentConfigOrBuilder
        getComponentConfigOrBuilder() {
      if (componentConfigBuilder_ != null) {
        return componentConfigBuilder_.getMessageOrBuilder();
      } else {
        return componentConfig_ == null
            ? com.google.container.v1.MonitoringComponentConfig.getDefaultInstance()
            : componentConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Monitoring components configuration
     * </pre>
     *
     * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.MonitoringComponentConfig,
            com.google.container.v1.MonitoringComponentConfig.Builder,
            com.google.container.v1.MonitoringComponentConfigOrBuilder>
        getComponentConfigFieldBuilder() {
      if (componentConfigBuilder_ == null) {
        componentConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.container.v1.MonitoringComponentConfig,
                com.google.container.v1.MonitoringComponentConfig.Builder,
                com.google.container.v1.MonitoringComponentConfigOrBuilder>(
                getComponentConfig(), getParentForChildren(), isClean());
        componentConfig_ = null;
      }
      return componentConfigBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.container.v1.MonitoringConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.MonitoringConfig)
  private static final com.google.container.v1.MonitoringConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.MonitoringConfig();
  }

  public static com.google.container.v1.MonitoringConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MonitoringConfig> PARSER =
      new com.google.protobuf.AbstractParser<MonitoringConfig>() {
        @java.lang.Override
        public MonitoringConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
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
  public com.google.container.v1.MonitoringConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
