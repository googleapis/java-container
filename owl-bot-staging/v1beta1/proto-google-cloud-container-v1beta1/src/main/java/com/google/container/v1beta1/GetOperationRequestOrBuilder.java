// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface GetOperationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.GetOperationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @return The projectId.
   */
  @java.lang.Deprecated java.lang.String getProjectId();
  /**
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for projectId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @return The zone.
   */
  @java.lang.Deprecated java.lang.String getZone();
  /**
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for zone.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * Required. Deprecated. The server-assigned `name` of the operation.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string operation_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @return The operationId.
   */
  @java.lang.Deprecated java.lang.String getOperationId();
  /**
   * <pre>
   * Required. Deprecated. The server-assigned `name` of the operation.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string operation_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for operationId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getOperationIdBytes();

  /**
   * <pre>
   * The name (project, location, operation id) of the operation to get.
   * Specified in the format `projects/&#42;&#47;locations/&#42;&#47;operations/&#42;`.
   * </pre>
   *
   * <code>string name = 5;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name (project, location, operation id) of the operation to get.
   * Specified in the format `projects/&#42;&#47;locations/&#42;&#47;operations/&#42;`.
   * </pre>
   *
   * <code>string name = 5;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
