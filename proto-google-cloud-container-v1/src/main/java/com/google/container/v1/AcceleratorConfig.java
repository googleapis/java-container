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
 * AcceleratorConfig represents a Hardware Accelerator request.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.AcceleratorConfig}
 */
public final class AcceleratorConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.AcceleratorConfig)
    AcceleratorConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AcceleratorConfig.newBuilder() to construct.
  private AcceleratorConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AcceleratorConfig() {
    acceleratorType_ = "";
    gpuPartitionSize_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AcceleratorConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_AcceleratorConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_AcceleratorConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.AcceleratorConfig.class,
            com.google.container.v1.AcceleratorConfig.Builder.class);
  }

  public static final int ACCELERATOR_COUNT_FIELD_NUMBER = 1;
  private long acceleratorCount_;
  /**
   *
   *
   * <pre>
   * The number of the accelerator cards exposed to an instance.
   * </pre>
   *
   * <code>int64 accelerator_count = 1;</code>
   *
   * @return The acceleratorCount.
   */
  @java.lang.Override
  public long getAcceleratorCount() {
    return acceleratorCount_;
  }

  public static final int ACCELERATOR_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object acceleratorType_;
  /**
   *
   *
   * <pre>
   * The accelerator type resource name. List of supported accelerators
   * [here](https://cloud.google.com/compute/docs/gpus)
   * </pre>
   *
   * <code>string accelerator_type = 2;</code>
   *
   * @return The acceleratorType.
   */
  @java.lang.Override
  public java.lang.String getAcceleratorType() {
    java.lang.Object ref = acceleratorType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      acceleratorType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The accelerator type resource name. List of supported accelerators
   * [here](https://cloud.google.com/compute/docs/gpus)
   * </pre>
   *
   * <code>string accelerator_type = 2;</code>
   *
   * @return The bytes for acceleratorType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAcceleratorTypeBytes() {
    java.lang.Object ref = acceleratorType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      acceleratorType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GPU_PARTITION_SIZE_FIELD_NUMBER = 3;
  private volatile java.lang.Object gpuPartitionSize_;
  /**
   *
   *
   * <pre>
   * Size of partitions to create on the GPU. Valid values are described in the
   * NVIDIA [mig user
   * guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
   * </pre>
   *
   * <code>string gpu_partition_size = 3;</code>
   *
   * @return The gpuPartitionSize.
   */
  @java.lang.Override
  public java.lang.String getGpuPartitionSize() {
    java.lang.Object ref = gpuPartitionSize_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gpuPartitionSize_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Size of partitions to create on the GPU. Valid values are described in the
   * NVIDIA [mig user
   * guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
   * </pre>
   *
   * <code>string gpu_partition_size = 3;</code>
   *
   * @return The bytes for gpuPartitionSize.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGpuPartitionSizeBytes() {
    java.lang.Object ref = gpuPartitionSize_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      gpuPartitionSize_ = b;
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
    if (acceleratorCount_ != 0L) {
      output.writeInt64(1, acceleratorCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(acceleratorType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, acceleratorType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gpuPartitionSize_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, gpuPartitionSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (acceleratorCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, acceleratorCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(acceleratorType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, acceleratorType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gpuPartitionSize_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, gpuPartitionSize_);
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
    if (!(obj instanceof com.google.container.v1.AcceleratorConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.AcceleratorConfig other =
        (com.google.container.v1.AcceleratorConfig) obj;

    if (getAcceleratorCount() != other.getAcceleratorCount()) return false;
    if (!getAcceleratorType().equals(other.getAcceleratorType())) return false;
    if (!getGpuPartitionSize().equals(other.getGpuPartitionSize())) return false;
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
    hash = (37 * hash) + ACCELERATOR_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getAcceleratorCount());
    hash = (37 * hash) + ACCELERATOR_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getAcceleratorType().hashCode();
    hash = (37 * hash) + GPU_PARTITION_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getGpuPartitionSize().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.AcceleratorConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AcceleratorConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.AcceleratorConfig prototype) {
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
   * AcceleratorConfig represents a Hardware Accelerator request.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.AcceleratorConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.AcceleratorConfig)
      com.google.container.v1.AcceleratorConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AcceleratorConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AcceleratorConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.AcceleratorConfig.class,
              com.google.container.v1.AcceleratorConfig.Builder.class);
    }

    // Construct using com.google.container.v1.AcceleratorConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      acceleratorCount_ = 0L;

      acceleratorType_ = "";

      gpuPartitionSize_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AcceleratorConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.AcceleratorConfig getDefaultInstanceForType() {
      return com.google.container.v1.AcceleratorConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.AcceleratorConfig build() {
      com.google.container.v1.AcceleratorConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.AcceleratorConfig buildPartial() {
      com.google.container.v1.AcceleratorConfig result =
          new com.google.container.v1.AcceleratorConfig(this);
      result.acceleratorCount_ = acceleratorCount_;
      result.acceleratorType_ = acceleratorType_;
      result.gpuPartitionSize_ = gpuPartitionSize_;
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
      if (other instanceof com.google.container.v1.AcceleratorConfig) {
        return mergeFrom((com.google.container.v1.AcceleratorConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.AcceleratorConfig other) {
      if (other == com.google.container.v1.AcceleratorConfig.getDefaultInstance()) return this;
      if (other.getAcceleratorCount() != 0L) {
        setAcceleratorCount(other.getAcceleratorCount());
      }
      if (!other.getAcceleratorType().isEmpty()) {
        acceleratorType_ = other.acceleratorType_;
        onChanged();
      }
      if (!other.getGpuPartitionSize().isEmpty()) {
        gpuPartitionSize_ = other.gpuPartitionSize_;
        onChanged();
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
            case 8:
              {
                acceleratorCount_ = input.readInt64();

                break;
              } // case 8
            case 18:
              {
                acceleratorType_ = input.readStringRequireUtf8();

                break;
              } // case 18
            case 26:
              {
                gpuPartitionSize_ = input.readStringRequireUtf8();

                break;
              } // case 26
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

    private long acceleratorCount_;
    /**
     *
     *
     * <pre>
     * The number of the accelerator cards exposed to an instance.
     * </pre>
     *
     * <code>int64 accelerator_count = 1;</code>
     *
     * @return The acceleratorCount.
     */
    @java.lang.Override
    public long getAcceleratorCount() {
      return acceleratorCount_;
    }
    /**
     *
     *
     * <pre>
     * The number of the accelerator cards exposed to an instance.
     * </pre>
     *
     * <code>int64 accelerator_count = 1;</code>
     *
     * @param value The acceleratorCount to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorCount(long value) {

      acceleratorCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of the accelerator cards exposed to an instance.
     * </pre>
     *
     * <code>int64 accelerator_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorCount() {

      acceleratorCount_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object acceleratorType_ = "";
    /**
     *
     *
     * <pre>
     * The accelerator type resource name. List of supported accelerators
     * [here](https://cloud.google.com/compute/docs/gpus)
     * </pre>
     *
     * <code>string accelerator_type = 2;</code>
     *
     * @return The acceleratorType.
     */
    public java.lang.String getAcceleratorType() {
      java.lang.Object ref = acceleratorType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        acceleratorType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The accelerator type resource name. List of supported accelerators
     * [here](https://cloud.google.com/compute/docs/gpus)
     * </pre>
     *
     * <code>string accelerator_type = 2;</code>
     *
     * @return The bytes for acceleratorType.
     */
    public com.google.protobuf.ByteString getAcceleratorTypeBytes() {
      java.lang.Object ref = acceleratorType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        acceleratorType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The accelerator type resource name. List of supported accelerators
     * [here](https://cloud.google.com/compute/docs/gpus)
     * </pre>
     *
     * <code>string accelerator_type = 2;</code>
     *
     * @param value The acceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      acceleratorType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The accelerator type resource name. List of supported accelerators
     * [here](https://cloud.google.com/compute/docs/gpus)
     * </pre>
     *
     * <code>string accelerator_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorType() {

      acceleratorType_ = getDefaultInstance().getAcceleratorType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The accelerator type resource name. List of supported accelerators
     * [here](https://cloud.google.com/compute/docs/gpus)
     * </pre>
     *
     * <code>string accelerator_type = 2;</code>
     *
     * @param value The bytes for acceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      acceleratorType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object gpuPartitionSize_ = "";
    /**
     *
     *
     * <pre>
     * Size of partitions to create on the GPU. Valid values are described in the
     * NVIDIA [mig user
     * guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * </pre>
     *
     * <code>string gpu_partition_size = 3;</code>
     *
     * @return The gpuPartitionSize.
     */
    public java.lang.String getGpuPartitionSize() {
      java.lang.Object ref = gpuPartitionSize_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gpuPartitionSize_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Size of partitions to create on the GPU. Valid values are described in the
     * NVIDIA [mig user
     * guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * </pre>
     *
     * <code>string gpu_partition_size = 3;</code>
     *
     * @return The bytes for gpuPartitionSize.
     */
    public com.google.protobuf.ByteString getGpuPartitionSizeBytes() {
      java.lang.Object ref = gpuPartitionSize_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        gpuPartitionSize_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Size of partitions to create on the GPU. Valid values are described in the
     * NVIDIA [mig user
     * guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * </pre>
     *
     * <code>string gpu_partition_size = 3;</code>
     *
     * @param value The gpuPartitionSize to set.
     * @return This builder for chaining.
     */
    public Builder setGpuPartitionSize(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      gpuPartitionSize_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Size of partitions to create on the GPU. Valid values are described in the
     * NVIDIA [mig user
     * guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * </pre>
     *
     * <code>string gpu_partition_size = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGpuPartitionSize() {

      gpuPartitionSize_ = getDefaultInstance().getGpuPartitionSize();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Size of partitions to create on the GPU. Valid values are described in the
     * NVIDIA [mig user
     * guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * </pre>
     *
     * <code>string gpu_partition_size = 3;</code>
     *
     * @param value The bytes for gpuPartitionSize to set.
     * @return This builder for chaining.
     */
    public Builder setGpuPartitionSizeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      gpuPartitionSize_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.AcceleratorConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.AcceleratorConfig)
  private static final com.google.container.v1.AcceleratorConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.AcceleratorConfig();
  }

  public static com.google.container.v1.AcceleratorConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcceleratorConfig> PARSER =
      new com.google.protobuf.AbstractParser<AcceleratorConfig>() {
        @java.lang.Override
        public AcceleratorConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AcceleratorConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcceleratorConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.AcceleratorConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
