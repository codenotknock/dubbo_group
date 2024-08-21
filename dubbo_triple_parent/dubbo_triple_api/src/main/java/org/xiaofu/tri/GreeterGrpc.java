package org.xiaofu.tri;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.2)",
    comments = "Source: greeter.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.xiaofu.tri.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.xiaofu.tri.GreeterRequest,
      org.xiaofu.tri.GreeterReply> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greet",
      requestType = org.xiaofu.tri.GreeterRequest.class,
      responseType = org.xiaofu.tri.GreeterReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.xiaofu.tri.GreeterRequest,
      org.xiaofu.tri.GreeterReply> getGreetMethod() {
    io.grpc.MethodDescriptor<org.xiaofu.tri.GreeterRequest, org.xiaofu.tri.GreeterReply> getGreetMethod;
    if ((getGreetMethod = GreeterGrpc.getGreetMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getGreetMethod = GreeterGrpc.getGreetMethod) == null) {
          GreeterGrpc.getGreetMethod = getGreetMethod =
              io.grpc.MethodDescriptor.<org.xiaofu.tri.GreeterRequest, org.xiaofu.tri.GreeterReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xiaofu.tri.GreeterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xiaofu.tri.GreeterReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("greet"))
              .build();
        }
      }
    }
    return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.xiaofu.tri.GreeterRequest,
      org.xiaofu.tri.GreeterReply> getGreetServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetServerStream",
      requestType = org.xiaofu.tri.GreeterRequest.class,
      responseType = org.xiaofu.tri.GreeterReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.xiaofu.tri.GreeterRequest,
      org.xiaofu.tri.GreeterReply> getGreetServerStreamMethod() {
    io.grpc.MethodDescriptor<org.xiaofu.tri.GreeterRequest, org.xiaofu.tri.GreeterReply> getGreetServerStreamMethod;
    if ((getGreetServerStreamMethod = GreeterGrpc.getGreetServerStreamMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getGreetServerStreamMethod = GreeterGrpc.getGreetServerStreamMethod) == null) {
          GreeterGrpc.getGreetServerStreamMethod = getGreetServerStreamMethod =
              io.grpc.MethodDescriptor.<org.xiaofu.tri.GreeterRequest, org.xiaofu.tri.GreeterReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greetServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xiaofu.tri.GreeterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xiaofu.tri.GreeterReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("greetServerStream"))
              .build();
        }
      }
    }
    return getGreetServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.xiaofu.tri.GreeterRequest,
      org.xiaofu.tri.GreeterReply> getGreetStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetStream",
      requestType = org.xiaofu.tri.GreeterRequest.class,
      responseType = org.xiaofu.tri.GreeterReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.xiaofu.tri.GreeterRequest,
      org.xiaofu.tri.GreeterReply> getGreetStreamMethod() {
    io.grpc.MethodDescriptor<org.xiaofu.tri.GreeterRequest, org.xiaofu.tri.GreeterReply> getGreetStreamMethod;
    if ((getGreetStreamMethod = GreeterGrpc.getGreetStreamMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getGreetStreamMethod = GreeterGrpc.getGreetStreamMethod) == null) {
          GreeterGrpc.getGreetStreamMethod = getGreetStreamMethod =
              io.grpc.MethodDescriptor.<org.xiaofu.tri.GreeterRequest, org.xiaofu.tri.GreeterReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greetStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xiaofu.tri.GreeterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xiaofu.tri.GreeterReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("greetStream"))
              .build();
        }
      }
    }
    return getGreetStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterStub>() {
        @java.lang.Override
        public GreeterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterStub(channel, callOptions);
        }
      };
    return GreeterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub>() {
        @java.lang.Override
        public GreeterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterBlockingStub(channel, callOptions);
        }
      };
    return GreeterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub>() {
        @java.lang.Override
        public GreeterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterFutureStub(channel, callOptions);
        }
      };
    return GreeterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * unary
     * </pre>
     */
    default void greet(org.xiaofu.tri.GreeterRequest request,
        io.grpc.stub.StreamObserver<org.xiaofu.tri.GreeterReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     * <pre>
     * serverStream
     * </pre>
     */
    default void greetServerStream(org.xiaofu.tri.GreeterRequest request,
        io.grpc.stub.StreamObserver<org.xiaofu.tri.GreeterReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetServerStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * bi streaming
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.xiaofu.tri.GreeterRequest> greetStream(
        io.grpc.stub.StreamObserver<org.xiaofu.tri.GreeterReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGreetStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Greeter.
   */
  public static abstract class GreeterImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GreeterGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Greeter.
   */
  public static final class GreeterStub
      extends io.grpc.stub.AbstractAsyncStub<GreeterStub> {
    private GreeterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public void greet(org.xiaofu.tri.GreeterRequest request,
        io.grpc.stub.StreamObserver<org.xiaofu.tri.GreeterReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * serverStream
     * </pre>
     */
    public void greetServerStream(org.xiaofu.tri.GreeterRequest request,
        io.grpc.stub.StreamObserver<org.xiaofu.tri.GreeterReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGreetServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * bi streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.xiaofu.tri.GreeterRequest> greetStream(
        io.grpc.stub.StreamObserver<org.xiaofu.tri.GreeterReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGreetStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Greeter.
   */
  public static final class GreeterBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GreeterBlockingStub> {
    private GreeterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public org.xiaofu.tri.GreeterReply greet(org.xiaofu.tri.GreeterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * serverStream
     * </pre>
     */
    public java.util.Iterator<org.xiaofu.tri.GreeterReply> greetServerStream(
        org.xiaofu.tri.GreeterRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGreetServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Greeter.
   */
  public static final class GreeterFutureStub
      extends io.grpc.stub.AbstractFutureStub<GreeterFutureStub> {
    private GreeterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.xiaofu.tri.GreeterReply> greet(
        org.xiaofu.tri.GreeterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_GREET_SERVER_STREAM = 1;
  private static final int METHODID_GREET_STREAM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((org.xiaofu.tri.GreeterRequest) request,
              (io.grpc.stub.StreamObserver<org.xiaofu.tri.GreeterReply>) responseObserver);
          break;
        case METHODID_GREET_SERVER_STREAM:
          serviceImpl.greetServerStream((org.xiaofu.tri.GreeterRequest) request,
              (io.grpc.stub.StreamObserver<org.xiaofu.tri.GreeterReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetStream(
              (io.grpc.stub.StreamObserver<org.xiaofu.tri.GreeterReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGreetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.xiaofu.tri.GreeterRequest,
              org.xiaofu.tri.GreeterReply>(
                service, METHODID_GREET)))
        .addMethod(
          getGreetServerStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.xiaofu.tri.GreeterRequest,
              org.xiaofu.tri.GreeterReply>(
                service, METHODID_GREET_SERVER_STREAM)))
        .addMethod(
          getGreetStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.xiaofu.tri.GreeterRequest,
              org.xiaofu.tri.GreeterReply>(
                service, METHODID_GREET_STREAM)))
        .build();
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.xiaofu.tri.GreeterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GreeterMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getGreetMethod())
              .addMethod(getGreetServerStreamMethod())
              .addMethod(getGreetStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
