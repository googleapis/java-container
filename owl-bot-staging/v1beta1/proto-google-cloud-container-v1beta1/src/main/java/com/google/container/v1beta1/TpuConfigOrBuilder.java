// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface TpuConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.TpuConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether Cloud TPU integration is enabled or not.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * Whether to use service networking for Cloud TPU or not.
   * </pre>
   *
   * <code>bool use_service_networking = 2;</code>
   * @return The useServiceNetworking.
   */
  boolean getUseServiceNetworking();

  /**
   * <pre>
   * IPv4 CIDR block reserved for Cloud TPU in the VPC.
   * </pre>
   *
   * <code>string ipv4_cidr_block = 3;</code>
   * @return The ipv4CidrBlock.
   */
  java.lang.String getIpv4CidrBlock();
  /**
   * <pre>
   * IPv4 CIDR block reserved for Cloud TPU in the VPC.
   * </pre>
   *
   * <code>string ipv4_cidr_block = 3;</code>
   * @return The bytes for ipv4CidrBlock.
   */
  com.google.protobuf.ByteString
      getIpv4CidrBlockBytes();
}