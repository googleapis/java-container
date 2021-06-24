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

public interface SetMonitoringServiceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.SetMonitoringServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The projectId.
   */
  @java.lang.Deprecated
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for projectId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The zone.
   */
  @java.lang.Deprecated
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for zone.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The clusterId.
   */
  @java.lang.Deprecated
  java.lang.String getClusterId();
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for clusterId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getClusterIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The monitoring service the cluster should use to write metrics.
   * Currently available options:
   * * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring
   * service with a Kubernetes-native resource model
   * * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no
   *   longer available as of GKE 1.15).
   * * `none` - No metrics will be exported from the cluster.
   * If left as an empty string,`monitoring.googleapis.com/kubernetes` will be
   * used for GKE 1.14+ or `monitoring.googleapis.com` for earlier versions.
   * </pre>
   *
   * <code>string monitoring_service = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The monitoringService.
   */
  java.lang.String getMonitoringService();
  /**
   *
   *
   * <pre>
   * Required. The monitoring service the cluster should use to write metrics.
   * Currently available options:
   * * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring
   * service with a Kubernetes-native resource model
   * * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no
   *   longer available as of GKE 1.15).
   * * `none` - No metrics will be exported from the cluster.
   * If left as an empty string,`monitoring.googleapis.com/kubernetes` will be
   * used for GKE 1.14+ or `monitoring.googleapis.com` for earlier versions.
   * </pre>
   *
   * <code>string monitoring_service = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for monitoringService.
   */
  com.google.protobuf.ByteString getMonitoringServiceBytes();

  /**
   *
   *
   * <pre>
   * The name (project, location, cluster) of the cluster to set monitoring.
   * Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`.
   * </pre>
   *
   * <code>string name = 6;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name (project, location, cluster) of the cluster to set monitoring.
   * Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`.
   * </pre>
   *
   * <code>string name = 6;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
