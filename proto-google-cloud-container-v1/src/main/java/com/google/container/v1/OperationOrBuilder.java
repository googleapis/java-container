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

public interface OperationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.Operation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The server-assigned ID for the operation.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The server-assigned ID for the operation.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the operation
   * is taking place.
   * This field is deprecated, use location instead.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   *
   * @return The zone.
   */
  @java.lang.Deprecated
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the operation
   * is taking place.
   * This field is deprecated, use location instead.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   *
   * @return The bytes for zone.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * The operation type.
   * </pre>
   *
   * <code>.google.container.v1.Operation.Type operation_type = 3;</code>
   *
   * @return The enum numeric value on the wire for operationType.
   */
  int getOperationTypeValue();
  /**
   *
   *
   * <pre>
   * The operation type.
   * </pre>
   *
   * <code>.google.container.v1.Operation.Type operation_type = 3;</code>
   *
   * @return The operationType.
   */
  com.google.container.v1.Operation.Type getOperationType();

  /**
   *
   *
   * <pre>
   * The current status of the operation.
   * </pre>
   *
   * <code>.google.container.v1.Operation.Status status = 4;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * The current status of the operation.
   * </pre>
   *
   * <code>.google.container.v1.Operation.Status status = 4;</code>
   *
   * @return The status.
   */
  com.google.container.v1.Operation.Status getStatus();

  /**
   *
   *
   * <pre>
   * Detailed operation progress, if available.
   * </pre>
   *
   * <code>string detail = 8;</code>
   *
   * @return The detail.
   */
  java.lang.String getDetail();
  /**
   *
   *
   * <pre>
   * Detailed operation progress, if available.
   * </pre>
   *
   * <code>string detail = 8;</code>
   *
   * @return The bytes for detail.
   */
  com.google.protobuf.ByteString getDetailBytes();

  /**
   *
   *
   * <pre>
   * If an error has occurred, a textual description of the error.
   * </pre>
   *
   * <code>string status_message = 5;</code>
   *
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();
  /**
   *
   *
   * <pre>
   * If an error has occurred, a textual description of the error.
   * </pre>
   *
   * <code>string status_message = 5;</code>
   *
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString getStatusMessageBytes();

  /**
   *
   *
   * <pre>
   * Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 6;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 6;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * Server-defined URL for the target of the operation.
   * </pre>
   *
   * <code>string target_link = 7;</code>
   *
   * @return The targetLink.
   */
  java.lang.String getTargetLink();
  /**
   *
   *
   * <pre>
   * Server-defined URL for the target of the operation.
   * </pre>
   *
   * <code>string target_link = 7;</code>
   *
   * @return The bytes for targetLink.
   */
  com.google.protobuf.ByteString getTargetLinkBytes();

  /**
   *
   *
   * <pre>
   * [Output only] The name of the Google Compute Engine
   * [zone](/compute/docs/regions-zones/regions-zones#available) or
   * [region](/compute/docs/regions-zones/regions-zones#available) in which
   * the cluster resides.
   * </pre>
   *
   * <code>string location = 9;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * [Output only] The name of the Google Compute Engine
   * [zone](/compute/docs/regions-zones/regions-zones#available) or
   * [region](/compute/docs/regions-zones/regions-zones#available) in which
   * the cluster resides.
   * </pre>
   *
   * <code>string location = 9;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * [Output only] The time the operation started, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string start_time = 10;</code>
   *
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   *
   *
   * <pre>
   * [Output only] The time the operation started, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string start_time = 10;</code>
   *
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString getStartTimeBytes();

  /**
   *
   *
   * <pre>
   * [Output only] The time the operation completed, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string end_time = 11;</code>
   *
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   *
   *
   * <pre>
   * [Output only] The time the operation completed, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string end_time = 11;</code>
   *
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString getEndTimeBytes();

  /**
   *
   *
   * <pre>
   * Which conditions caused the current cluster state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition cluster_conditions = 13;</code>
   */
  java.util.List<com.google.container.v1.StatusCondition> getClusterConditionsList();
  /**
   *
   *
   * <pre>
   * Which conditions caused the current cluster state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition cluster_conditions = 13;</code>
   */
  com.google.container.v1.StatusCondition getClusterConditions(int index);
  /**
   *
   *
   * <pre>
   * Which conditions caused the current cluster state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition cluster_conditions = 13;</code>
   */
  int getClusterConditionsCount();
  /**
   *
   *
   * <pre>
   * Which conditions caused the current cluster state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition cluster_conditions = 13;</code>
   */
  java.util.List<? extends com.google.container.v1.StatusConditionOrBuilder>
      getClusterConditionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Which conditions caused the current cluster state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition cluster_conditions = 13;</code>
   */
  com.google.container.v1.StatusConditionOrBuilder getClusterConditionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Which conditions caused the current node pool state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition nodepool_conditions = 14;</code>
   */
  java.util.List<com.google.container.v1.StatusCondition> getNodepoolConditionsList();
  /**
   *
   *
   * <pre>
   * Which conditions caused the current node pool state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition nodepool_conditions = 14;</code>
   */
  com.google.container.v1.StatusCondition getNodepoolConditions(int index);
  /**
   *
   *
   * <pre>
   * Which conditions caused the current node pool state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition nodepool_conditions = 14;</code>
   */
  int getNodepoolConditionsCount();
  /**
   *
   *
   * <pre>
   * Which conditions caused the current node pool state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition nodepool_conditions = 14;</code>
   */
  java.util.List<? extends com.google.container.v1.StatusConditionOrBuilder>
      getNodepoolConditionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Which conditions caused the current node pool state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition nodepool_conditions = 14;</code>
   */
  com.google.container.v1.StatusConditionOrBuilder getNodepoolConditionsOrBuilder(int index);
}
