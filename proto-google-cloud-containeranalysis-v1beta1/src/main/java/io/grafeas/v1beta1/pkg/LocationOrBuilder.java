// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/package/package.proto

package io.grafeas.v1beta1.pkg;

public interface LocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.package.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
   * denoting the package manager version distributing a package.
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
   */
  java.lang.String getCpeUri();
  /**
   * <pre>
   * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
   * denoting the package manager version distributing a package.
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
   */
  com.google.protobuf.ByteString
      getCpeUriBytes();

  /**
   * <pre>
   * The version installed at this location.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version version = 2;</code>
   */
  boolean hasVersion();
  /**
   * <pre>
   * The version installed at this location.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version version = 2;</code>
   */
  io.grafeas.v1beta1.pkg.Version getVersion();
  /**
   * <pre>
   * The version installed at this location.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version version = 2;</code>
   */
  io.grafeas.v1beta1.pkg.VersionOrBuilder getVersionOrBuilder();

  /**
   * <pre>
   * The path from which we gathered that this package/version is installed.
   * </pre>
   *
   * <code>string path = 3;</code>
   */
  java.lang.String getPath();
  /**
   * <pre>
   * The path from which we gathered that this package/version is installed.
   * </pre>
   *
   * <code>string path = 3;</code>
   */
  com.google.protobuf.ByteString
      getPathBytes();
}
