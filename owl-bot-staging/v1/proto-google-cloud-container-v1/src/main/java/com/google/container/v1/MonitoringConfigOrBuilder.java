// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface MonitoringConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.MonitoringConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
   * @return Whether the componentConfig field is set.
   */
  boolean hasComponentConfig();
  /**
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
   * @return The componentConfig.
   */
  com.google.container.v1.MonitoringComponentConfig getComponentConfig();
  /**
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1.MonitoringComponentConfig component_config = 1;</code>
   */
  com.google.container.v1.MonitoringComponentConfigOrBuilder getComponentConfigOrBuilder();
}