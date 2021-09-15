// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface NodeNetworkConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.NodeNetworkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Input only. Whether to create a new range for pod IPs in this node pool.
   * Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they
   * are not specified.
   * If neither `create_pod_range` or `pod_range` are specified, the
   * cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is
   * used.
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>bool create_pod_range = 4 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The createPodRange.
   */
  boolean getCreatePodRange();

  /**
   * <pre>
   * The ID of the secondary range for pod IPs.
   * If `create_pod_range` is true, this ID is used for the new range.
   * If `create_pod_range` is false, uses an existing secondary range with this
   * ID.
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>string pod_range = 5;</code>
   * @return The podRange.
   */
  java.lang.String getPodRange();
  /**
   * <pre>
   * The ID of the secondary range for pod IPs.
   * If `create_pod_range` is true, this ID is used for the new range.
   * If `create_pod_range` is false, uses an existing secondary range with this
   * ID.
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>string pod_range = 5;</code>
   * @return The bytes for podRange.
   */
  com.google.protobuf.ByteString
      getPodRangeBytes();

  /**
   * <pre>
   * The IP address range for pod IPs in this node pool.
   * Only applicable if `create_pod_range` is true.
   * Set to blank to have a range chosen with the default size.
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) to pick a specific range to use.
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>string pod_ipv4_cidr_block = 6;</code>
   * @return The podIpv4CidrBlock.
   */
  java.lang.String getPodIpv4CidrBlock();
  /**
   * <pre>
   * The IP address range for pod IPs in this node pool.
   * Only applicable if `create_pod_range` is true.
   * Set to blank to have a range chosen with the default size.
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) to pick a specific range to use.
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>string pod_ipv4_cidr_block = 6;</code>
   * @return The bytes for podIpv4CidrBlock.
   */
  com.google.protobuf.ByteString
      getPodIpv4CidrBlockBytes();
}
