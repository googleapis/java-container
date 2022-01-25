// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface NodeConfigDefaultsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NodeConfigDefaults)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * GCFS (Google Container File System, a.k.a Riptide) options.
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
   * @return Whether the gcfsConfig field is set.
   */
  boolean hasGcfsConfig();
  /**
   * <pre>
   * GCFS (Google Container File System, a.k.a Riptide) options.
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
   * @return The gcfsConfig.
   */
  com.google.container.v1.GcfsConfig getGcfsConfig();
  /**
   * <pre>
   * GCFS (Google Container File System, a.k.a Riptide) options.
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
   */
  com.google.container.v1.GcfsConfigOrBuilder getGcfsConfigOrBuilder();
}