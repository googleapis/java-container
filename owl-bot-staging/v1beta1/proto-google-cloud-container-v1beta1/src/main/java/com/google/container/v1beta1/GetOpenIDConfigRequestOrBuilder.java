// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface GetOpenIDConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.GetOpenIDConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The cluster (project, location, cluster name) to get the discovery document
   * for. Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The cluster (project, location, cluster name) to get the discovery document
   * for. Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();
}