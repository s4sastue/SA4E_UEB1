package com.SA4E.UEB1.T2.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: FireflyCommunication.proto")
public final class UpdaterGrpc {

  private UpdaterGrpc() {}

  public static final String SERVICE_NAME = "Updater";

  // Static method descriptors that strictly reflect the com.SA4E.UEB1.T2.proto.
  private static volatile io.grpc.MethodDescriptor<com.SA4E.UEB1.T2.proto.FireflyCommunication.UpdateStateRequest,
      com.SA4E.UEB1.T2.proto.FireflyCommunication.GetStateReply> getUpdateStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateState",
      requestType = com.SA4E.UEB1.T2.proto.FireflyCommunication.UpdateStateRequest.class,
      responseType = com.SA4E.UEB1.T2.proto.FireflyCommunication.GetStateReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.SA4E.UEB1.T2.proto.FireflyCommunication.UpdateStateRequest,
      com.SA4E.UEB1.T2.proto.FireflyCommunication.GetStateReply> getUpdateStateMethod() {
    io.grpc.MethodDescriptor<com.SA4E.UEB1.T2.proto.FireflyCommunication.UpdateStateRequest, com.SA4E.UEB1.T2.proto.FireflyCommunication.GetStateReply> getUpdateStateMethod;
    if ((getUpdateStateMethod = UpdaterGrpc.getUpdateStateMethod) == null) {
      synchronized (UpdaterGrpc.class) {
        if ((getUpdateStateMethod = UpdaterGrpc.getUpdateStateMethod) == null) {
          UpdaterGrpc.getUpdateStateMethod = getUpdateStateMethod =
              io.grpc.MethodDescriptor.<com.SA4E.UEB1.T2.proto.FireflyCommunication.UpdateStateRequest, com.SA4E.UEB1.T2.proto.FireflyCommunication.GetStateReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Updater", "updateState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SA4E.UEB1.T2.proto.FireflyCommunication.UpdateStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SA4E.UEB1.T2.proto.FireflyCommunication.GetStateReply.getDefaultInstance()))
                  .setSchemaDescriptor(new UpdaterMethodDescriptorSupplier("updateState"))
                  .build();
          }
        }
     }
     return getUpdateStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdaterStub newStub(io.grpc.Channel channel) {
    return new UpdaterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdaterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UpdaterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdaterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UpdaterFutureStub(channel);
  }

  /**
   */
  public static abstract class UpdaterImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateState(com.SA4E.UEB1.T2.proto.FireflyCommunication.UpdateStateRequest request,
        io.grpc.stub.StreamObserver<com.SA4E.UEB1.T2.proto.FireflyCommunication.GetStateReply> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.SA4E.UEB1.T2.proto.FireflyCommunication.UpdateStateRequest,
                com.SA4E.UEB1.T2.proto.FireflyCommunication.GetStateReply>(
                  this, METHODID_UPDATE_STATE)))
          .build();
    }
  }

  /**
   */
  public static final class UpdaterStub extends io.grpc.stub.AbstractStub<UpdaterStub> {
    private UpdaterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdaterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdaterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdaterStub(channel, callOptions);
    }

    /**
     */
    public void updateState(com.SA4E.UEB1.T2.proto.FireflyCommunication.UpdateStateRequest request,
        io.grpc.stub.StreamObserver<com.SA4E.UEB1.T2.proto.FireflyCommunication.GetStateReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UpdaterBlockingStub extends io.grpc.stub.AbstractStub<UpdaterBlockingStub> {
    private UpdaterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdaterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdaterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdaterBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.SA4E.UEB1.T2.proto.FireflyCommunication.GetStateReply updateState(com.SA4E.UEB1.T2.proto.FireflyCommunication.UpdateStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateStateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UpdaterFutureStub extends io.grpc.stub.AbstractStub<UpdaterFutureStub> {
    private UpdaterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdaterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdaterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdaterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.SA4E.UEB1.T2.proto.FireflyCommunication.GetStateReply> updateState(
        com.SA4E.UEB1.T2.proto.FireflyCommunication.UpdateStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_STATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UpdaterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UpdaterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_STATE:
          serviceImpl.updateState((com.SA4E.UEB1.T2.proto.FireflyCommunication.UpdateStateRequest) request,
              (io.grpc.stub.StreamObserver<com.SA4E.UEB1.T2.proto.FireflyCommunication.GetStateReply>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UpdaterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UpdaterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SA4E.UEB1.T2.proto.FireflyCommunication.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Updater");
    }
  }

  private static final class UpdaterFileDescriptorSupplier
      extends UpdaterBaseDescriptorSupplier {
    UpdaterFileDescriptorSupplier() {}
  }

  private static final class UpdaterMethodDescriptorSupplier
      extends UpdaterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UpdaterMethodDescriptorSupplier(String methodName) {
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
      synchronized (UpdaterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdaterFileDescriptorSupplier())
              .addMethod(getUpdateStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
