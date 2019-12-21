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

public interface AddonsConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.AddonsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Configuration for the HTTP (L7) load balancing controller addon, which
   * makes it easy to set up HTTP load balancers for services in a cluster.
   * </pre>
   *
   * <code>.google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
   *
   * @return Whether the httpLoadBalancing field is set.
   */
  boolean hasHttpLoadBalancing();
  /**
   *
   *
   * <pre>
   * Configuration for the HTTP (L7) load balancing controller addon, which
   * makes it easy to set up HTTP load balancers for services in a cluster.
   * </pre>
   *
   * <code>.google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
   *
   * @return The httpLoadBalancing.
   */
  com.google.container.v1.HttpLoadBalancing getHttpLoadBalancing();
  /**
   *
   *
   * <pre>
   * Configuration for the HTTP (L7) load balancing controller addon, which
   * makes it easy to set up HTTP load balancers for services in a cluster.
   * </pre>
   *
   * <code>.google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
   */
  com.google.container.v1.HttpLoadBalancingOrBuilder getHttpLoadBalancingOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for the horizontal pod autoscaling feature, which
   * increases or decreases the number of replica pods a replication controller
   * has based on the resource usage of the existing pods.
   * </pre>
   *
   * <code>.google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
   *
   * @return Whether the horizontalPodAutoscaling field is set.
   */
  boolean hasHorizontalPodAutoscaling();
  /**
   *
   *
   * <pre>
   * Configuration for the horizontal pod autoscaling feature, which
   * increases or decreases the number of replica pods a replication controller
   * has based on the resource usage of the existing pods.
   * </pre>
   *
   * <code>.google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
   *
   * @return The horizontalPodAutoscaling.
   */
  com.google.container.v1.HorizontalPodAutoscaling getHorizontalPodAutoscaling();
  /**
   *
   *
   * <pre>
   * Configuration for the horizontal pod autoscaling feature, which
   * increases or decreases the number of replica pods a replication controller
   * has based on the resource usage of the existing pods.
   * </pre>
   *
   * <code>.google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
   */
  com.google.container.v1.HorizontalPodAutoscalingOrBuilder getHorizontalPodAutoscalingOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for the Kubernetes Dashboard.
   * This addon is deprecated, and will be disabled in 1.15. It is recommended
   * to use the Cloud Console to manage and monitor your Kubernetes clusters,
   * workloads and applications. For more information, see:
   * https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
   * </pre>
   *
   * <code>.google.container.v1.KubernetesDashboard kubernetes_dashboard = 3 [deprecated = true];
   * </code>
   *
   * @return Whether the kubernetesDashboard field is set.
   */
  @java.lang.Deprecated
  boolean hasKubernetesDashboard();
  /**
   *
   *
   * <pre>
   * Configuration for the Kubernetes Dashboard.
   * This addon is deprecated, and will be disabled in 1.15. It is recommended
   * to use the Cloud Console to manage and monitor your Kubernetes clusters,
   * workloads and applications. For more information, see:
   * https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
   * </pre>
   *
   * <code>.google.container.v1.KubernetesDashboard kubernetes_dashboard = 3 [deprecated = true];
   * </code>
   *
   * @return The kubernetesDashboard.
   */
  @java.lang.Deprecated
  com.google.container.v1.KubernetesDashboard getKubernetesDashboard();
  /**
   *
   *
   * <pre>
   * Configuration for the Kubernetes Dashboard.
   * This addon is deprecated, and will be disabled in 1.15. It is recommended
   * to use the Cloud Console to manage and monitor your Kubernetes clusters,
   * workloads and applications. For more information, see:
   * https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
   * </pre>
   *
   * <code>.google.container.v1.KubernetesDashboard kubernetes_dashboard = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.container.v1.KubernetesDashboardOrBuilder getKubernetesDashboardOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for NetworkPolicy. This only tracks whether the addon
   * is enabled or not on the Master, it does not track whether network policy
   * is enabled for the nodes.
   * </pre>
   *
   * <code>.google.container.v1.NetworkPolicyConfig network_policy_config = 4;</code>
   *
   * @return Whether the networkPolicyConfig field is set.
   */
  boolean hasNetworkPolicyConfig();
  /**
   *
   *
   * <pre>
   * Configuration for NetworkPolicy. This only tracks whether the addon
   * is enabled or not on the Master, it does not track whether network policy
   * is enabled for the nodes.
   * </pre>
   *
   * <code>.google.container.v1.NetworkPolicyConfig network_policy_config = 4;</code>
   *
   * @return The networkPolicyConfig.
   */
  com.google.container.v1.NetworkPolicyConfig getNetworkPolicyConfig();
  /**
   *
   *
   * <pre>
   * Configuration for NetworkPolicy. This only tracks whether the addon
   * is enabled or not on the Master, it does not track whether network policy
   * is enabled for the nodes.
   * </pre>
   *
   * <code>.google.container.v1.NetworkPolicyConfig network_policy_config = 4;</code>
   */
  com.google.container.v1.NetworkPolicyConfigOrBuilder getNetworkPolicyConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for the Cloud Run addon, which allows the user to use a
   * managed Knative service.
   * </pre>
   *
   * <code>.google.container.v1.CloudRunConfig cloud_run_config = 7;</code>
   *
   * @return Whether the cloudRunConfig field is set.
   */
  boolean hasCloudRunConfig();
  /**
   *
   *
   * <pre>
   * Configuration for the Cloud Run addon, which allows the user to use a
   * managed Knative service.
   * </pre>
   *
   * <code>.google.container.v1.CloudRunConfig cloud_run_config = 7;</code>
   *
   * @return The cloudRunConfig.
   */
  com.google.container.v1.CloudRunConfig getCloudRunConfig();
  /**
   *
   *
   * <pre>
   * Configuration for the Cloud Run addon, which allows the user to use a
   * managed Knative service.
   * </pre>
   *
   * <code>.google.container.v1.CloudRunConfig cloud_run_config = 7;</code>
   */
  com.google.container.v1.CloudRunConfigOrBuilder getCloudRunConfigOrBuilder();
}
