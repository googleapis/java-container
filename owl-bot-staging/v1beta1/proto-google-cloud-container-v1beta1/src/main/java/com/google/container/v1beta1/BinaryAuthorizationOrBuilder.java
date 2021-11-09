// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface BinaryAuthorizationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.BinaryAuthorization)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Enable Binary Authorization for this cluster. If enabled, all container
   * images will be validated by Google Binauthz.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  boolean getEnabled();
}
