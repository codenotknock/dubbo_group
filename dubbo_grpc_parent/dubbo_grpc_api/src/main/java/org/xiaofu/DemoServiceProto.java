// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DemoService.proto

package org.xiaofu;

public final class DemoServiceProto {
  private DemoServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DemoService.proto\"\033\n\013RequestData\022\014\n\004na" +
      "me\030\001 \001(\t\"\037\n\014ResponseData\022\017\n\007message\030\001 \001(" +
      "\t27\n\013DemoService\022(\n\007service\022\014.RequestDat" +
      "a\032\r.ResponseData\"\000B \n\norg.xiaofuB\020DemoSe" +
      "rviceProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RequestData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RequestData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestData_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_ResponseData_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ResponseData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseData_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
