// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface IstioConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.IstioConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether Istio is enabled for this cluster.
   * </pre>
   *
   * <code>bool disabled = 1 [deprecated = true];</code>
   * @return The disabled.
   */
  @java.lang.Deprecated boolean getDisabled();

  /**
   * <pre>
   * The specified Istio auth mode, either none, or mutual TLS.
   * </pre>
   *
   * <code>.google.container.v1beta1.IstioConfig.IstioAuthMode auth = 2 [deprecated = true];</code>
   * @return The enum numeric value on the wire for auth.
   */
  @java.lang.Deprecated int getAuthValue();
  /**
   * <pre>
   * The specified Istio auth mode, either none, or mutual TLS.
   * </pre>
   *
   * <code>.google.container.v1beta1.IstioConfig.IstioAuthMode auth = 2 [deprecated = true];</code>
   * @return The auth.
   */
  @java.lang.Deprecated com.google.container.v1beta1.IstioConfig.IstioAuthMode getAuth();
}
