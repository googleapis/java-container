// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface EphemeralStorageLocalSsdConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.EphemeralStorageLocalSsdConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Number of local SSDs to use to back ephemeral storage. Uses NVMe
   * interfaces. Each local SSD is 375 GB in size.
   * If zero, it means to disable using local SSDs as ephemeral storage.
   * The limit for this value is dependent upon the maximum number of
   * disks available on a machine per zone. See:
   * https://cloud.google.com/compute/docs/disks/local-ssd
   * for more information.
   * </pre>
   *
   * <code>int32 local_ssd_count = 1;</code>
   * @return The localSsdCount.
   */
  int getLocalSsdCount();
}
