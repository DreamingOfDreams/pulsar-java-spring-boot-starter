// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Example.proto

package io.github.majusko.pulsar.msg;

public final class Example {
  private Example() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_github_majusko_pulsar_msg_ProtoMsg_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_github_majusko_pulsar_msg_ProtoMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rExample.proto\022\034io.github.majusko.pulsa" +
      "r.msg\"\030\n\010ProtoMsg\022\014\n\004data\030\001 \001(\tB\002P\001b\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_io_github_majusko_pulsar_msg_ProtoMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_github_majusko_pulsar_msg_ProtoMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_github_majusko_pulsar_msg_ProtoMsg_descriptor,
        new String[] { "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
