// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface NetworkConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.NetworkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [network][google.container.v1beta1.NetworkConfig.network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks)
   * to which the cluster is connected. Example:
   * projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 1;</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [network][google.container.v1beta1.NetworkConfig.network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks)
   * to which the cluster is connected. Example:
   * projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 1;</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();

  /**
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the
   * cluster is connected. Example:
   * projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the
   * cluster is connected. Example:
   * projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString
      getSubnetworkBytes();

  /**
   * <pre>
   * Whether Intra-node visibility is enabled for this cluster.
   * This makes same node pod to pod traffic visible for VPC network.
   * </pre>
   *
   * <code>bool enable_intra_node_visibility = 5;</code>
   * @return The enableIntraNodeVisibility.
   */
  boolean getEnableIntraNodeVisibility();

  /**
   * <pre>
   * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules
   * will be disabled when default_snat_status is disabled. When disabled is set
   * to false, default IP masquerade rules will be applied to the nodes to
   * prevent sNAT on cluster internal traffic.
   * </pre>
   *
   * <code>.google.container.v1beta1.DefaultSnatStatus default_snat_status = 7;</code>
   * @return Whether the defaultSnatStatus field is set.
   */
  boolean hasDefaultSnatStatus();
  /**
   * <pre>
   * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules
   * will be disabled when default_snat_status is disabled. When disabled is set
   * to false, default IP masquerade rules will be applied to the nodes to
   * prevent sNAT on cluster internal traffic.
   * </pre>
   *
   * <code>.google.container.v1beta1.DefaultSnatStatus default_snat_status = 7;</code>
   * @return The defaultSnatStatus.
   */
  com.google.container.v1beta1.DefaultSnatStatus getDefaultSnatStatus();
  /**
   * <pre>
   * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules
   * will be disabled when default_snat_status is disabled. When disabled is set
   * to false, default IP masquerade rules will be applied to the nodes to
   * prevent sNAT on cluster internal traffic.
   * </pre>
   *
   * <code>.google.container.v1beta1.DefaultSnatStatus default_snat_status = 7;</code>
   */
  com.google.container.v1beta1.DefaultSnatStatusOrBuilder getDefaultSnatStatusOrBuilder();

  /**
   * <pre>
   * The desired datapath provider for this cluster. By default, uses the
   * IPTables-based kube-proxy implementation.
   * </pre>
   *
   * <code>.google.container.v1beta1.DatapathProvider datapath_provider = 11;</code>
   * @return The enum numeric value on the wire for datapathProvider.
   */
  int getDatapathProviderValue();
  /**
   * <pre>
   * The desired datapath provider for this cluster. By default, uses the
   * IPTables-based kube-proxy implementation.
   * </pre>
   *
   * <code>.google.container.v1beta1.DatapathProvider datapath_provider = 11;</code>
   * @return The datapathProvider.
   */
  com.google.container.v1beta1.DatapathProvider getDatapathProvider();
}
