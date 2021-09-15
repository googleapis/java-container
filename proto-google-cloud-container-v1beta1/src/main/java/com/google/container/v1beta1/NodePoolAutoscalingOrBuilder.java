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

public interface NodePoolAutoscalingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.NodePoolAutoscaling)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Is autoscaling enabled for this node pool.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * Minimum number of nodes in the NodePool. Must be &gt;= 1 and &lt;=
   * max_node_count.
   * </pre>
   *
   * <code>int32 min_node_count = 2;</code>
   *
   * @return The minNodeCount.
   */
  int getMinNodeCount();

  /**
   *
   *
   * <pre>
   * Maximum number of nodes in the NodePool. Must be &gt;= min_node_count. There
   * has to be enough quota to scale up the cluster.
   * </pre>
   *
   * <code>int32 max_node_count = 3;</code>
   *
   * @return The maxNodeCount.
   */
  int getMaxNodeCount();

  /**
   *
   *
   * <pre>
   * Can this node pool be deleted automatically.
   * </pre>
   *
   * <code>bool autoprovisioned = 4;</code>
   *
   * @return The autoprovisioned.
   */
  boolean getAutoprovisioned();
}
