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
 * WorkloadMetadataConfig defines the metadata configuration to expose to
 * workloads on the node pool.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.WorkloadMetadataConfig}
 */
public final class WorkloadMetadataConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.WorkloadMetadataConfig)
    WorkloadMetadataConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WorkloadMetadataConfig.newBuilder() to construct.
  private WorkloadMetadataConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WorkloadMetadataConfig() {
    nodeMetadata_ = 0;
    mode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WorkloadMetadataConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private WorkloadMetadataConfig(
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

              nodeMetadata_ = rawValue;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              mode_ = rawValue;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_WorkloadMetadataConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_WorkloadMetadataConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.WorkloadMetadataConfig.class,
            com.google.container.v1beta1.WorkloadMetadataConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * NodeMetadata is the configuration for if and how to expose the node
   * metadata to the workload running on the node.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata}
   */
  public enum NodeMetadata implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not set.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Prevent workloads not in hostNetwork from accessing certain VM metadata,
     * specifically kube-env, which contains Kubelet credentials, and the
     * instance identity token.
     * Metadata concealment is a temporary security solution available while the
     * bootstrapping process for cluster nodes is being redesigned with
     * significant security improvements.  This feature is scheduled to be
     * deprecated in the future and later removed.
     * </pre>
     *
     * <code>SECURE = 1;</code>
     */
    SECURE(1),
    /**
     *
     *
     * <pre>
     * Expose all VM metadata to pods.
     * </pre>
     *
     * <code>EXPOSE = 2;</code>
     */
    EXPOSE(2),
    /**
     *
     *
     * <pre>
     * Run the GKE Metadata Server on this node. The GKE Metadata Server exposes
     * a metadata API to workloads that is compatible with the V1 Compute
     * Metadata APIs exposed by the Compute Engine and App Engine Metadata
     * Servers. This feature can only be enabled if Workload Identity is enabled
     * at the cluster level.
     * </pre>
     *
     * <code>GKE_METADATA_SERVER = 3;</code>
     */
    GKE_METADATA_SERVER(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not set.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Prevent workloads not in hostNetwork from accessing certain VM metadata,
     * specifically kube-env, which contains Kubelet credentials, and the
     * instance identity token.
     * Metadata concealment is a temporary security solution available while the
     * bootstrapping process for cluster nodes is being redesigned with
     * significant security improvements.  This feature is scheduled to be
     * deprecated in the future and later removed.
     * </pre>
     *
     * <code>SECURE = 1;</code>
     */
    public static final int SECURE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Expose all VM metadata to pods.
     * </pre>
     *
     * <code>EXPOSE = 2;</code>
     */
    public static final int EXPOSE_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Run the GKE Metadata Server on this node. The GKE Metadata Server exposes
     * a metadata API to workloads that is compatible with the V1 Compute
     * Metadata APIs exposed by the Compute Engine and App Engine Metadata
     * Servers. This feature can only be enabled if Workload Identity is enabled
     * at the cluster level.
     * </pre>
     *
     * <code>GKE_METADATA_SERVER = 3;</code>
     */
    public static final int GKE_METADATA_SERVER_VALUE = 3;

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
    public static NodeMetadata valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NodeMetadata forNumber(int value) {
      switch (value) {
        case 0:
          return UNSPECIFIED;
        case 1:
          return SECURE;
        case 2:
          return EXPOSE;
        case 3:
          return GKE_METADATA_SERVER;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NodeMetadata> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<NodeMetadata> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NodeMetadata>() {
          public NodeMetadata findValueByNumber(int number) {
            return NodeMetadata.forNumber(number);
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
      return com.google.container.v1beta1.WorkloadMetadataConfig.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final NodeMetadata[] VALUES = values();

    public static NodeMetadata valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private NodeMetadata(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata)
  }

  /**
   *
   *
   * <pre>
   * Mode is the configuration for how to expose metadata to workloads running
   * on the node.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.WorkloadMetadataConfig.Mode}
   */
  public enum Mode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not set.
     * </pre>
     *
     * <code>MODE_UNSPECIFIED = 0;</code>
     */
    MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Expose all Compute Engine metadata to pods.
     * </pre>
     *
     * <code>GCE_METADATA = 1;</code>
     */
    GCE_METADATA(1),
    /**
     *
     *
     * <pre>
     * Run the GKE Metadata Server on this node. The GKE Metadata Server exposes
     * a metadata API to workloads that is compatible with the V1 Compute
     * Metadata APIs exposed by the Compute Engine and App Engine Metadata
     * Servers. This feature can only be enabled if Workload Identity is enabled
     * at the cluster level.
     * </pre>
     *
     * <code>GKE_METADATA = 2;</code>
     */
    GKE_METADATA(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not set.
     * </pre>
     *
     * <code>MODE_UNSPECIFIED = 0;</code>
     */
    public static final int MODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Expose all Compute Engine metadata to pods.
     * </pre>
     *
     * <code>GCE_METADATA = 1;</code>
     */
    public static final int GCE_METADATA_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Run the GKE Metadata Server on this node. The GKE Metadata Server exposes
     * a metadata API to workloads that is compatible with the V1 Compute
     * Metadata APIs exposed by the Compute Engine and App Engine Metadata
     * Servers. This feature can only be enabled if Workload Identity is enabled
     * at the cluster level.
     * </pre>
     *
     * <code>GKE_METADATA = 2;</code>
     */
    public static final int GKE_METADATA_VALUE = 2;

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
    public static Mode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Mode forNumber(int value) {
      switch (value) {
        case 0:
          return MODE_UNSPECIFIED;
        case 1:
          return GCE_METADATA;
        case 2:
          return GKE_METADATA;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Mode> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Mode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Mode>() {
          public Mode findValueByNumber(int number) {
            return Mode.forNumber(number);
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
      return com.google.container.v1beta1.WorkloadMetadataConfig.getDescriptor()
          .getEnumTypes()
          .get(1);
    }

    private static final Mode[] VALUES = values();

    public static Mode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Mode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.WorkloadMetadataConfig.Mode)
  }

  public static final int NODE_METADATA_FIELD_NUMBER = 1;
  private int nodeMetadata_;
  /**
   *
   *
   * <pre>
   * NodeMetadata is the configuration for how to expose metadata to the
   * workloads running on the node.
   * </pre>
   *
   * <code>
   * .google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata node_metadata = 1 [deprecated = true];
   * </code>
   *
   * @deprecated google.container.v1beta1.WorkloadMetadataConfig.node_metadata is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=3792
   * @return The enum numeric value on the wire for nodeMetadata.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public int getNodeMetadataValue() {
    return nodeMetadata_;
  }
  /**
   *
   *
   * <pre>
   * NodeMetadata is the configuration for how to expose metadata to the
   * workloads running on the node.
   * </pre>
   *
   * <code>
   * .google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata node_metadata = 1 [deprecated = true];
   * </code>
   *
   * @deprecated google.container.v1beta1.WorkloadMetadataConfig.node_metadata is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=3792
   * @return The nodeMetadata.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata getNodeMetadata() {
    @SuppressWarnings("deprecation")
    com.google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata result =
        com.google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata.valueOf(nodeMetadata_);
    return result == null
        ? com.google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata.UNRECOGNIZED
        : result;
  }

  public static final int MODE_FIELD_NUMBER = 2;
  private int mode_;
  /**
   *
   *
   * <pre>
   * Mode is the configuration for how to expose metadata to workloads running
   * on the node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.WorkloadMetadataConfig.Mode mode = 2;</code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  @java.lang.Override
  public int getModeValue() {
    return mode_;
  }
  /**
   *
   *
   * <pre>
   * Mode is the configuration for how to expose metadata to workloads running
   * on the node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.WorkloadMetadataConfig.Mode mode = 2;</code>
   *
   * @return The mode.
   */
  @java.lang.Override
  public com.google.container.v1beta1.WorkloadMetadataConfig.Mode getMode() {
    @SuppressWarnings("deprecation")
    com.google.container.v1beta1.WorkloadMetadataConfig.Mode result =
        com.google.container.v1beta1.WorkloadMetadataConfig.Mode.valueOf(mode_);
    return result == null
        ? com.google.container.v1beta1.WorkloadMetadataConfig.Mode.UNRECOGNIZED
        : result;
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
    if (nodeMetadata_
        != com.google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata.UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, nodeMetadata_);
    }
    if (mode_
        != com.google.container.v1beta1.WorkloadMetadataConfig.Mode.MODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, mode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nodeMetadata_
        != com.google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata.UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, nodeMetadata_);
    }
    if (mode_
        != com.google.container.v1beta1.WorkloadMetadataConfig.Mode.MODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, mode_);
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
    if (!(obj instanceof com.google.container.v1beta1.WorkloadMetadataConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.WorkloadMetadataConfig other =
        (com.google.container.v1beta1.WorkloadMetadataConfig) obj;

    if (nodeMetadata_ != other.nodeMetadata_) return false;
    if (mode_ != other.mode_) return false;
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
    hash = (37 * hash) + NODE_METADATA_FIELD_NUMBER;
    hash = (53 * hash) + nodeMetadata_;
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + mode_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.WorkloadMetadataConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.WorkloadMetadataConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.WorkloadMetadataConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.WorkloadMetadataConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.WorkloadMetadataConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.WorkloadMetadataConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.WorkloadMetadataConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.WorkloadMetadataConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.WorkloadMetadataConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.WorkloadMetadataConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.WorkloadMetadataConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.WorkloadMetadataConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.WorkloadMetadataConfig prototype) {
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
   * WorkloadMetadataConfig defines the metadata configuration to expose to
   * workloads on the node pool.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.WorkloadMetadataConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.WorkloadMetadataConfig)
      com.google.container.v1beta1.WorkloadMetadataConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_WorkloadMetadataConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_WorkloadMetadataConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.WorkloadMetadataConfig.class,
              com.google.container.v1beta1.WorkloadMetadataConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.WorkloadMetadataConfig.newBuilder()
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
      nodeMetadata_ = 0;

      mode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_WorkloadMetadataConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.WorkloadMetadataConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.WorkloadMetadataConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.WorkloadMetadataConfig build() {
      com.google.container.v1beta1.WorkloadMetadataConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.WorkloadMetadataConfig buildPartial() {
      com.google.container.v1beta1.WorkloadMetadataConfig result =
          new com.google.container.v1beta1.WorkloadMetadataConfig(this);
      result.nodeMetadata_ = nodeMetadata_;
      result.mode_ = mode_;
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
      if (other instanceof com.google.container.v1beta1.WorkloadMetadataConfig) {
        return mergeFrom((com.google.container.v1beta1.WorkloadMetadataConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.WorkloadMetadataConfig other) {
      if (other == com.google.container.v1beta1.WorkloadMetadataConfig.getDefaultInstance())
        return this;
      if (other.nodeMetadata_ != 0) {
        setNodeMetadataValue(other.getNodeMetadataValue());
      }
      if (other.mode_ != 0) {
        setModeValue(other.getModeValue());
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
      com.google.container.v1beta1.WorkloadMetadataConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.container.v1beta1.WorkloadMetadataConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int nodeMetadata_ = 0;
    /**
     *
     *
     * <pre>
     * NodeMetadata is the configuration for how to expose metadata to the
     * workloads running on the node.
     * </pre>
     *
     * <code>
     * .google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata node_metadata = 1 [deprecated = true];
     * </code>
     *
     * @deprecated google.container.v1beta1.WorkloadMetadataConfig.node_metadata is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=3792
     * @return The enum numeric value on the wire for nodeMetadata.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public int getNodeMetadataValue() {
      return nodeMetadata_;
    }
    /**
     *
     *
     * <pre>
     * NodeMetadata is the configuration for how to expose metadata to the
     * workloads running on the node.
     * </pre>
     *
     * <code>
     * .google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata node_metadata = 1 [deprecated = true];
     * </code>
     *
     * @deprecated google.container.v1beta1.WorkloadMetadataConfig.node_metadata is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=3792
     * @param value The enum numeric value on the wire for nodeMetadata to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setNodeMetadataValue(int value) {

      nodeMetadata_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * NodeMetadata is the configuration for how to expose metadata to the
     * workloads running on the node.
     * </pre>
     *
     * <code>
     * .google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata node_metadata = 1 [deprecated = true];
     * </code>
     *
     * @deprecated google.container.v1beta1.WorkloadMetadataConfig.node_metadata is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=3792
     * @return The nodeMetadata.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public com.google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata getNodeMetadata() {
      @SuppressWarnings("deprecation")
      com.google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata result =
          com.google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata.valueOf(nodeMetadata_);
      return result == null
          ? com.google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * NodeMetadata is the configuration for how to expose metadata to the
     * workloads running on the node.
     * </pre>
     *
     * <code>
     * .google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata node_metadata = 1 [deprecated = true];
     * </code>
     *
     * @deprecated google.container.v1beta1.WorkloadMetadataConfig.node_metadata is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=3792
     * @param value The nodeMetadata to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setNodeMetadata(
        com.google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nodeMetadata_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * NodeMetadata is the configuration for how to expose metadata to the
     * workloads running on the node.
     * </pre>
     *
     * <code>
     * .google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata node_metadata = 1 [deprecated = true];
     * </code>
     *
     * @deprecated google.container.v1beta1.WorkloadMetadataConfig.node_metadata is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=3792
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearNodeMetadata() {

      nodeMetadata_ = 0;
      onChanged();
      return this;
    }

    private int mode_ = 0;
    /**
     *
     *
     * <pre>
     * Mode is the configuration for how to expose metadata to workloads running
     * on the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.WorkloadMetadataConfig.Mode mode = 2;</code>
     *
     * @return The enum numeric value on the wire for mode.
     */
    @java.lang.Override
    public int getModeValue() {
      return mode_;
    }
    /**
     *
     *
     * <pre>
     * Mode is the configuration for how to expose metadata to workloads running
     * on the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.WorkloadMetadataConfig.Mode mode = 2;</code>
     *
     * @param value The enum numeric value on the wire for mode to set.
     * @return This builder for chaining.
     */
    public Builder setModeValue(int value) {

      mode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mode is the configuration for how to expose metadata to workloads running
     * on the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.WorkloadMetadataConfig.Mode mode = 2;</code>
     *
     * @return The mode.
     */
    @java.lang.Override
    public com.google.container.v1beta1.WorkloadMetadataConfig.Mode getMode() {
      @SuppressWarnings("deprecation")
      com.google.container.v1beta1.WorkloadMetadataConfig.Mode result =
          com.google.container.v1beta1.WorkloadMetadataConfig.Mode.valueOf(mode_);
      return result == null
          ? com.google.container.v1beta1.WorkloadMetadataConfig.Mode.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Mode is the configuration for how to expose metadata to workloads running
     * on the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.WorkloadMetadataConfig.Mode mode = 2;</code>
     *
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(com.google.container.v1beta1.WorkloadMetadataConfig.Mode value) {
      if (value == null) {
        throw new NullPointerException();
      }

      mode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mode is the configuration for how to expose metadata to workloads running
     * on the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.WorkloadMetadataConfig.Mode mode = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMode() {

      mode_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.WorkloadMetadataConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.WorkloadMetadataConfig)
  private static final com.google.container.v1beta1.WorkloadMetadataConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.WorkloadMetadataConfig();
  }

  public static com.google.container.v1beta1.WorkloadMetadataConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkloadMetadataConfig> PARSER =
      new com.google.protobuf.AbstractParser<WorkloadMetadataConfig>() {
        @java.lang.Override
        public WorkloadMetadataConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new WorkloadMetadataConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<WorkloadMetadataConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkloadMetadataConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.WorkloadMetadataConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
