/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.xiaofu;

import org.apache.dubbo.common.URL;

import java.util.concurrent.TimeUnit;

import static org.apache.dubbo.common.constants.CommonConstants.DEFAULT_TIMEOUT;
import static org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_KEY;

import static org.xiaofu.DemoServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

public final class DubboDemoServiceGrpc {
private DubboDemoServiceGrpc() {}

public static class DubboDemoServiceStub implements IDemoService {

protected URL url;

protected DemoServiceGrpc.DemoServiceBlockingStub blockingStub;
protected DemoServiceGrpc.DemoServiceFutureStub futureStub;
protected DemoServiceGrpc.DemoServiceStub stub;

public DubboDemoServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url) {
this.url = url;

blockingStub = DemoServiceGrpc.newBlockingStub(channel).build(channel, callOptions);
futureStub = DemoServiceGrpc.newFutureStub(channel).build(channel, callOptions);
stub = DemoServiceGrpc.newStub(channel).build(channel, callOptions);
}

        /**
         * <pre>
         *  Sends a greeting
         * </pre>
         */
    public org.xiaofu.ResponseData service(org.xiaofu.RequestData request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .service(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<org.xiaofu.ResponseData> serviceAsync(org.xiaofu.RequestData request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .service(request);
    }

    public void service(org.xiaofu.RequestData request, io.grpc.stub.StreamObserver<org.xiaofu.ResponseData> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .service(request, responseObserver);
    }

}

public static DubboDemoServiceStub getDubboStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url) {
return new DubboDemoServiceStub(channel, callOptions, url);
}

public interface IDemoService {
        /**
         * <pre>
         *  Sends a greeting
         * </pre>
         */
    default public org.xiaofu.ResponseData service(org.xiaofu.RequestData request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        /**
         * <pre>
         *  Sends a greeting
         * </pre>
         */
    default public com.google.common.util.concurrent.ListenableFuture<org.xiaofu.ResponseData> serviceAsync(org.xiaofu.RequestData request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        /**
         * <pre>
         *  Sends a greeting
         * </pre>
         */
    public void service(org.xiaofu.RequestData request, io.grpc.stub.StreamObserver<org.xiaofu.ResponseData> responseObserver);

}

    /**
     * <pre>
     *  The greeting service definition.
     * </pre>
     */
public static abstract class DemoServiceImplBase implements IDemoService, io.grpc.BindableService {

private IDemoService proxiedImpl;

public final void setProxiedImpl(IDemoService proxiedImpl) {
this.proxiedImpl = proxiedImpl;
}

        /**
         * <pre>
         *  Sends a greeting
         * </pre>
         */
    @java.lang.Override
    public final org.xiaofu.ResponseData service(org.xiaofu.RequestData request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        /**
         * <pre>
         *  Sends a greeting
         * </pre>
         */
    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<org.xiaofu.ResponseData> serviceAsync(org.xiaofu.RequestData request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        public void service(org.xiaofu.RequestData request,
        io.grpc.stub.StreamObserver<org.xiaofu.ResponseData> responseObserver) {
        asyncUnimplementedUnaryCall(org.xiaofu.DemoServiceGrpc.getServiceMethod(), responseObserver);
        }

@java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
    .addMethod(
    org.xiaofu.DemoServiceGrpc.getServiceMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    org.xiaofu.RequestData,
    org.xiaofu.ResponseData>(
    proxiedImpl, METHODID_SERVICE)))
.build();
}
}
    private static final int METHODID_SERVICE = 0;

private static final class MethodHandlers
<Req, Resp> implements
io.grpc.stub.ServerCalls.UnaryMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.ServerStreamingMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.ClientStreamingMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.BidiStreamingMethod
<Req, Resp> {
private final IDemoService serviceImpl;
private final int methodId;

MethodHandlers(IDemoService serviceImpl, int methodId) {
this.serviceImpl = serviceImpl;
this.methodId = methodId;
}

@java.lang.Override
@java.lang.SuppressWarnings("unchecked")
public void invoke(Req request, io.grpc.stub.StreamObserver
<Resp> responseObserver) {
    switch (methodId) {
            case METHODID_SERVICE:
            serviceImpl.service((org.xiaofu.RequestData) request,
            (io.grpc.stub.StreamObserver<org.xiaofu.ResponseData>) responseObserver);
            break;
    default:
    throw new java.lang.AssertionError();
    }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver
    <Req> invoke(io.grpc.stub.StreamObserver
        <Resp> responseObserver) {
            switch (methodId) {
            default:
            throw new java.lang.AssertionError();
            }
            }
            }

            }
