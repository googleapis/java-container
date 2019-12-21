/*
 * Copyright 2019 Google LLC
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
 * Configuration for returning group information from authenticators.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.AuthenticatorGroupsConfig}
 */
public final class AuthenticatorGroupsConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.AuthenticatorGroupsConfig)
    AuthenticatorGroupsConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AuthenticatorGroupsConfig.newBuilder() to construct.
  private AuthenticatorGroupsConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AuthenticatorGroupsConfig() {
    securityGroup_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AuthenticatorGroupsConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AuthenticatorGroupsConfig(
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
          case 8:
            {
              enabled_ = input.readBool();
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              securityGroup_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_AuthenticatorGroupsConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_AuthenticatorGroupsConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.AuthenticatorGroupsConfig.class,
            com.google.container.v1.AuthenticatorGroupsConfig.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_;
  /**
   *
   *
   * <pre>
   * Whether this cluster should return group membership lookups
   * during authentication using a group of security groups.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int SECURITY_GROUP_FIELD_NUMBER = 2;
  private volatile java.lang.Object securityGroup_;
  /**
   *
   *
   * <pre>
   * The name of the security group-of-groups to be used. Only relevant
   * if enabled = true.
   * </pre>
   *
   * <code>string security_group = 2;</code>
   *
   * @return The securityGroup.
   */
  public java.lang.String getSecurityGroup() {
    java.lang.Object ref = securityGroup_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      securityGroup_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the security group-of-groups to be used. Only relevant
   * if enabled = true.
   * </pre>
   *
   * <code>string security_group = 2;</code>
   *
   * @return The bytes for securityGroup.
   */
  public com.google.protobuf.ByteString getSecurityGroupBytes() {
    java.lang.Object ref = securityGroup_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      securityGroup_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (!getSecurityGroupBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, securityGroup_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enabled_);
    }
    if (!getSecurityGroupBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, securityGroup_);
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
    if (!(obj instanceof com.google.container.v1.AuthenticatorGroupsConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.AuthenticatorGroupsConfig other =
        (com.google.container.v1.AuthenticatorGroupsConfig) obj;

    if (getEnabled() != other.getEnabled()) return false;
    if (!getSecurityGroup().equals(other.getSecurityGroup())) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnabled());
    hash = (37 * hash) + SECURITY_GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getSecurityGroup().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.AuthenticatorGroupsConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AuthenticatorGroupsConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AuthenticatorGroupsConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AuthenticatorGroupsConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AuthenticatorGroupsConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AuthenticatorGroupsConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AuthenticatorGroupsConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AuthenticatorGroupsConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.AuthenticatorGroupsConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AuthenticatorGroupsConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.AuthenticatorGroupsConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AuthenticatorGroupsConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.AuthenticatorGroupsConfig prototype) {
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
   * Configuration for returning group information from authenticators.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.AuthenticatorGroupsConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.AuthenticatorGroupsConfig)
      com.google.container.v1.AuthenticatorGroupsConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AuthenticatorGroupsConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AuthenticatorGroupsConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.AuthenticatorGroupsConfig.class,
              com.google.container.v1.AuthenticatorGroupsConfig.Builder.class);
    }

    // Construct using com.google.container.v1.AuthenticatorGroupsConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      enabled_ = false;

      securityGroup_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AuthenticatorGroupsConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.AuthenticatorGroupsConfig getDefaultInstanceForType() {
      return com.google.container.v1.AuthenticatorGroupsConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.AuthenticatorGroupsConfig build() {
      com.google.container.v1.AuthenticatorGroupsConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.AuthenticatorGroupsConfig buildPartial() {
      com.google.container.v1.AuthenticatorGroupsConfig result =
          new com.google.container.v1.AuthenticatorGroupsConfig(this);
      result.enabled_ = enabled_;
      result.securityGroup_ = securityGroup_;
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
      if (other instanceof com.google.container.v1.AuthenticatorGroupsConfig) {
        return mergeFrom((com.google.container.v1.AuthenticatorGroupsConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.AuthenticatorGroupsConfig other) {
      if (other == com.google.container.v1.AuthenticatorGroupsConfig.getDefaultInstance())
        return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (!other.getSecurityGroup().isEmpty()) {
        securityGroup_ = other.securityGroup_;
        onChanged();
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
      com.google.container.v1.AuthenticatorGroupsConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.container.v1.AuthenticatorGroupsConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enabled_;
    /**
     *
     *
     * <pre>
     * Whether this cluster should return group membership lookups
     * during authentication using a group of security groups.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @return The enabled.
     */
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     *
     *
     * <pre>
     * Whether this cluster should return group membership lookups
     * during authentication using a group of security groups.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {

      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether this cluster should return group membership lookups
     * during authentication using a group of security groups.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {

      enabled_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object securityGroup_ = "";
    /**
     *
     *
     * <pre>
     * The name of the security group-of-groups to be used. Only relevant
     * if enabled = true.
     * </pre>
     *
     * <code>string security_group = 2;</code>
     *
     * @return The securityGroup.
     */
    public java.lang.String getSecurityGroup() {
      java.lang.Object ref = securityGroup_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        securityGroup_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the security group-of-groups to be used. Only relevant
     * if enabled = true.
     * </pre>
     *
     * <code>string security_group = 2;</code>
     *
     * @return The bytes for securityGroup.
     */
    public com.google.protobuf.ByteString getSecurityGroupBytes() {
      java.lang.Object ref = securityGroup_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        securityGroup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the security group-of-groups to be used. Only relevant
     * if enabled = true.
     * </pre>
     *
     * <code>string security_group = 2;</code>
     *
     * @param value The securityGroup to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityGroup(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      securityGroup_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the security group-of-groups to be used. Only relevant
     * if enabled = true.
     * </pre>
     *
     * <code>string security_group = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSecurityGroup() {

      securityGroup_ = getDefaultInstance().getSecurityGroup();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the security group-of-groups to be used. Only relevant
     * if enabled = true.
     * </pre>
     *
     * <code>string security_group = 2;</code>
     *
     * @param value The bytes for securityGroup to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityGroupBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      securityGroup_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.AuthenticatorGroupsConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.AuthenticatorGroupsConfig)
  private static final com.google.container.v1.AuthenticatorGroupsConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.AuthenticatorGroupsConfig();
  }

  public static com.google.container.v1.AuthenticatorGroupsConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthenticatorGroupsConfig> PARSER =
      new com.google.protobuf.AbstractParser<AuthenticatorGroupsConfig>() {
        @java.lang.Override
        public AuthenticatorGroupsConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AuthenticatorGroupsConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AuthenticatorGroupsConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthenticatorGroupsConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.AuthenticatorGroupsConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
