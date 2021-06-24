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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * Configuration options for the NetworkPolicy feature.
 * https://kubernetes.io/docs/concepts/services-networking/networkpolicies/
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.NetworkPolicy}
 */
public final class NetworkPolicy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.NetworkPolicy)
    NetworkPolicyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NetworkPolicy.newBuilder() to construct.
  private NetworkPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NetworkPolicy() {
    provider_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NetworkPolicy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private NetworkPolicy(
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
              int rawValue = input.readEnum();

              provider_ = rawValue;
              break;
            }
          case 16:
            {
              enabled_ = input.readBool();
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
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_NetworkPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_NetworkPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.NetworkPolicy.class,
            com.google.container.v1beta1.NetworkPolicy.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Allowed Network Policy providers.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.NetworkPolicy.Provider}
   */
  public enum Provider implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not set
     * </pre>
     *
     * <code>PROVIDER_UNSPECIFIED = 0;</code>
     */
    PROVIDER_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Tigera (Calico Felix).
     * </pre>
     *
     * <code>CALICO = 1;</code>
     */
    CALICO(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not set
     * </pre>
     *
     * <code>PROVIDER_UNSPECIFIED = 0;</code>
     */
    public static final int PROVIDER_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Tigera (Calico Felix).
     * </pre>
     *
     * <code>CALICO = 1;</code>
     */
    public static final int CALICO_VALUE = 1;

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
    public static Provider valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Provider forNumber(int value) {
      switch (value) {
        case 0:
          return PROVIDER_UNSPECIFIED;
        case 1:
          return CALICO;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Provider> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Provider> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Provider>() {
          public Provider findValueByNumber(int number) {
            return Provider.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.container.v1beta1.NetworkPolicy.getDescriptor().getEnumTypes().get(0);
    }

    private static final Provider[] VALUES = values();

    public static Provider valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Provider(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.NetworkPolicy.Provider)
  }

  public static final int PROVIDER_FIELD_NUMBER = 1;
  private int provider_;
  /**
   *
   *
   * <pre>
   * The selected network policy provider.
   * </pre>
   *
   * <code>.google.container.v1beta1.NetworkPolicy.Provider provider = 1;</code>
   *
   * @return The enum numeric value on the wire for provider.
   */
  @java.lang.Override
  public int getProviderValue() {
    return provider_;
  }
  /**
   *
   *
   * <pre>
   * The selected network policy provider.
   * </pre>
   *
   * <code>.google.container.v1beta1.NetworkPolicy.Provider provider = 1;</code>
   *
   * @return The provider.
   */
  @java.lang.Override
  public com.google.container.v1beta1.NetworkPolicy.Provider getProvider() {
    @SuppressWarnings("deprecation")
    com.google.container.v1beta1.NetworkPolicy.Provider result =
        com.google.container.v1beta1.NetworkPolicy.Provider.valueOf(provider_);
    return result == null
        ? com.google.container.v1beta1.NetworkPolicy.Provider.UNRECOGNIZED
        : result;
  }

  public static final int ENABLED_FIELD_NUMBER = 2;
  private boolean enabled_;
  /**
   *
   *
   * <pre>
   * Whether network policy is enabled on the cluster.
   * </pre>
   *
   * <code>bool enabled = 2;</code>
   *
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
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
    if (provider_
        != com.google.container.v1beta1.NetworkPolicy.Provider.PROVIDER_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, provider_);
    }
    if (enabled_ != false) {
      output.writeBool(2, enabled_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (provider_
        != com.google.container.v1beta1.NetworkPolicy.Provider.PROVIDER_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, provider_);
    }
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, enabled_);
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
    if (!(obj instanceof com.google.container.v1beta1.NetworkPolicy)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.NetworkPolicy other =
        (com.google.container.v1beta1.NetworkPolicy) obj;

    if (provider_ != other.provider_) return false;
    if (getEnabled() != other.getEnabled()) return false;
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
    hash = (37 * hash) + PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + provider_;
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.NetworkPolicy parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.NetworkPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.NetworkPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.NetworkPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.NetworkPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.NetworkPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.NetworkPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.NetworkPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.NetworkPolicy parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.NetworkPolicy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.NetworkPolicy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.NetworkPolicy parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.NetworkPolicy prototype) {
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
   * Configuration options for the NetworkPolicy feature.
   * https://kubernetes.io/docs/concepts/services-networking/networkpolicies/
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.NetworkPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.NetworkPolicy)
      com.google.container.v1beta1.NetworkPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_NetworkPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_NetworkPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.NetworkPolicy.class,
              com.google.container.v1beta1.NetworkPolicy.Builder.class);
    }

    // Construct using com.google.container.v1beta1.NetworkPolicy.newBuilder()
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
      provider_ = 0;

      enabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_NetworkPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.NetworkPolicy getDefaultInstanceForType() {
      return com.google.container.v1beta1.NetworkPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.NetworkPolicy build() {
      com.google.container.v1beta1.NetworkPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.NetworkPolicy buildPartial() {
      com.google.container.v1beta1.NetworkPolicy result =
          new com.google.container.v1beta1.NetworkPolicy(this);
      result.provider_ = provider_;
      result.enabled_ = enabled_;
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
      if (other instanceof com.google.container.v1beta1.NetworkPolicy) {
        return mergeFrom((com.google.container.v1beta1.NetworkPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.NetworkPolicy other) {
      if (other == com.google.container.v1beta1.NetworkPolicy.getDefaultInstance()) return this;
      if (other.provider_ != 0) {
        setProviderValue(other.getProviderValue());
      }
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
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
      com.google.container.v1beta1.NetworkPolicy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1beta1.NetworkPolicy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int provider_ = 0;
    /**
     *
     *
     * <pre>
     * The selected network policy provider.
     * </pre>
     *
     * <code>.google.container.v1beta1.NetworkPolicy.Provider provider = 1;</code>
     *
     * @return The enum numeric value on the wire for provider.
     */
    @java.lang.Override
    public int getProviderValue() {
      return provider_;
    }
    /**
     *
     *
     * <pre>
     * The selected network policy provider.
     * </pre>
     *
     * <code>.google.container.v1beta1.NetworkPolicy.Provider provider = 1;</code>
     *
     * @param value The enum numeric value on the wire for provider to set.
     * @return This builder for chaining.
     */
    public Builder setProviderValue(int value) {

      provider_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The selected network policy provider.
     * </pre>
     *
     * <code>.google.container.v1beta1.NetworkPolicy.Provider provider = 1;</code>
     *
     * @return The provider.
     */
    @java.lang.Override
    public com.google.container.v1beta1.NetworkPolicy.Provider getProvider() {
      @SuppressWarnings("deprecation")
      com.google.container.v1beta1.NetworkPolicy.Provider result =
          com.google.container.v1beta1.NetworkPolicy.Provider.valueOf(provider_);
      return result == null
          ? com.google.container.v1beta1.NetworkPolicy.Provider.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The selected network policy provider.
     * </pre>
     *
     * <code>.google.container.v1beta1.NetworkPolicy.Provider provider = 1;</code>
     *
     * @param value The provider to set.
     * @return This builder for chaining.
     */
    public Builder setProvider(com.google.container.v1beta1.NetworkPolicy.Provider value) {
      if (value == null) {
        throw new NullPointerException();
      }

      provider_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The selected network policy provider.
     * </pre>
     *
     * <code>.google.container.v1beta1.NetworkPolicy.Provider provider = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProvider() {

      provider_ = 0;
      onChanged();
      return this;
    }

    private boolean enabled_;
    /**
     *
     *
     * <pre>
     * Whether network policy is enabled on the cluster.
     * </pre>
     *
     * <code>bool enabled = 2;</code>
     *
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     *
     *
     * <pre>
     * Whether network policy is enabled on the cluster.
     * </pre>
     *
     * <code>bool enabled = 2;</code>
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
     * Whether network policy is enabled on the cluster.
     * </pre>
     *
     * <code>bool enabled = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {

      enabled_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.NetworkPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.NetworkPolicy)
  private static final com.google.container.v1beta1.NetworkPolicy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.NetworkPolicy();
  }

  public static com.google.container.v1beta1.NetworkPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkPolicy> PARSER =
      new com.google.protobuf.AbstractParser<NetworkPolicy>() {
        @java.lang.Override
        public NetworkPolicy parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new NetworkPolicy(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<NetworkPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.NetworkPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
