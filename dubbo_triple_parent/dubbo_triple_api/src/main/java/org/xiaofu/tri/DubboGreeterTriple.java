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

    package org.xiaofu.tri;

import org.apache.dubbo.common.stream.StreamObserver;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.PathResolver;
import org.apache.dubbo.rpc.RpcException;
import org.apache.dubbo.rpc.ServerService;
import org.apache.dubbo.rpc.TriRpcStatus;
import org.apache.dubbo.rpc.model.MethodDescriptor;
import org.apache.dubbo.rpc.model.ServiceDescriptor;
import org.apache.dubbo.rpc.model.StubMethodDescriptor;
import org.apache.dubbo.rpc.model.StubServiceDescriptor;
import org.apache.dubbo.rpc.stub.BiStreamMethodHandler;
import org.apache.dubbo.rpc.stub.ServerStreamMethodHandler;
import org.apache.dubbo.rpc.stub.StubInvocationUtil;
import org.apache.dubbo.rpc.stub.StubInvoker;
import org.apache.dubbo.rpc.stub.StubMethodHandler;
import org.apache.dubbo.rpc.stub.StubSuppliers;
import org.apache.dubbo.rpc.stub.UnaryStubMethodHandler;

import com.google.protobuf.Message;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.concurrent.CompletableFuture;

public final class DubboGreeterTriple {

    public static final String SERVICE_NAME = Greeter.SERVICE_NAME;

    private static final StubServiceDescriptor serviceDescriptor = new StubServiceDescriptor(SERVICE_NAME,Greeter.class);

    static {
        org.apache.dubbo.rpc.protocol.tri.service.SchemaDescriptorRegistry.addSchemaDescriptor(SERVICE_NAME,GreeterOuterClass.getDescriptor());
        StubSuppliers.addSupplier(SERVICE_NAME, DubboGreeterTriple::newStub);
        StubSuppliers.addSupplier(Greeter.JAVA_SERVICE_NAME,  DubboGreeterTriple::newStub);
        StubSuppliers.addDescriptor(SERVICE_NAME, serviceDescriptor);
        StubSuppliers.addDescriptor(Greeter.JAVA_SERVICE_NAME, serviceDescriptor);
    }

    @SuppressWarnings("all")
    public static Greeter newStub(Invoker<?> invoker) {
        return new GreeterStub((Invoker<Greeter>)invoker);
    }

    private static final StubMethodDescriptor greetMethod = new StubMethodDescriptor("greet",
    org.xiaofu.tri.GreeterRequest.class, org.xiaofu.tri.GreeterReply.class, serviceDescriptor, MethodDescriptor.RpcType.UNARY,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), org.xiaofu.tri.GreeterRequest::parseFrom,
    org.xiaofu.tri.GreeterReply::parseFrom);

    private static final StubMethodDescriptor greetAsyncMethod = new StubMethodDescriptor("greet",
    org.xiaofu.tri.GreeterRequest.class, java.util.concurrent.CompletableFuture.class, serviceDescriptor, MethodDescriptor.RpcType.UNARY,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), org.xiaofu.tri.GreeterRequest::parseFrom,
    org.xiaofu.tri.GreeterReply::parseFrom);

    private static final StubMethodDescriptor greetProxyAsyncMethod = new StubMethodDescriptor("greetAsync",
    org.xiaofu.tri.GreeterRequest.class, org.xiaofu.tri.GreeterReply.class, serviceDescriptor, MethodDescriptor.RpcType.UNARY,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), org.xiaofu.tri.GreeterRequest::parseFrom,
    org.xiaofu.tri.GreeterReply::parseFrom);


    /**
         * <pre>
         *  serverStream
         * </pre>
         */
    private static final StubMethodDescriptor greetServerStreamMethod = new StubMethodDescriptor("greetServerStream",
    org.xiaofu.tri.GreeterRequest.class, org.xiaofu.tri.GreeterReply.class, serviceDescriptor, MethodDescriptor.RpcType.SERVER_STREAM,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), org.xiaofu.tri.GreeterRequest::parseFrom,
    org.xiaofu.tri.GreeterReply::parseFrom);



    /**
         * <pre>
         *  bi streaming
         * </pre>
         */
    private static final StubMethodDescriptor greetStreamMethod = new StubMethodDescriptor("greetStream",
    org.xiaofu.tri.GreeterRequest.class, org.xiaofu.tri.GreeterReply.class, serviceDescriptor, MethodDescriptor.RpcType.BI_STREAM,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), org.xiaofu.tri.GreeterRequest::parseFrom,
    org.xiaofu.tri.GreeterReply::parseFrom);

    public static class GreeterStub implements Greeter{
        private final Invoker<Greeter> invoker;

        public GreeterStub(Invoker<Greeter> invoker) {
            this.invoker = invoker;
        }

        @Override
        public org.xiaofu.tri.GreeterReply greet(org.xiaofu.tri.GreeterRequest request){
            return StubInvocationUtil.unaryCall(invoker, greetMethod, request);
        }

        public CompletableFuture<org.xiaofu.tri.GreeterReply> greetAsync(org.xiaofu.tri.GreeterRequest request){
            return StubInvocationUtil.unaryCall(invoker, greetAsyncMethod, request);
        }

        @Override
        public void greet(org.xiaofu.tri.GreeterRequest request, StreamObserver<org.xiaofu.tri.GreeterReply> responseObserver){
            StubInvocationUtil.unaryCall(invoker, greetMethod , request, responseObserver);
        }

            /**
         * <pre>
         *  serverStream
         * </pre>
         */
        @Override
        public void greetServerStream(org.xiaofu.tri.GreeterRequest request, StreamObserver<org.xiaofu.tri.GreeterReply> responseObserver){
            StubInvocationUtil.serverStreamCall(invoker, greetServerStreamMethod , request, responseObserver);
        }

            /**
         * <pre>
         *  bi streaming
         * </pre>
         */
        @Override
        public StreamObserver<org.xiaofu.tri.GreeterRequest> greetStream(StreamObserver<org.xiaofu.tri.GreeterReply> responseObserver){
            return StubInvocationUtil.biOrClientStreamCall(invoker, greetStreamMethod , responseObserver);
        }

    }

    public static abstract class GreeterImplBase implements Greeter, ServerService<Greeter> {

        private <T, R> BiConsumer<T, StreamObserver<R>> syncToAsync(java.util.function.Function<T, R> syncFun) {
            return new BiConsumer<T, StreamObserver<R>>() {
                @Override
                public void accept(T t, StreamObserver<R> observer) {
                    try {
                        R ret = syncFun.apply(t);
                        observer.onNext(ret);
                        observer.onCompleted();
                    } catch (Throwable e) {
                        observer.onError(e);
                    }
                }
            };
        }

        @Override
        public final Invoker<Greeter> getInvoker(URL url) {
            PathResolver pathResolver = url.getOrDefaultFrameworkModel()
            .getExtensionLoader(PathResolver.class)
            .getDefaultExtension();
            Map<String,StubMethodHandler<?, ?>> handlers = new HashMap<>();

            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/greet" );
            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/greetAsync" );
            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/greetServerStream" );
            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/greetServerStreamAsync" );
            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/greetStream" );
            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/greetStreamAsync" );

            BiConsumer<org.xiaofu.tri.GreeterRequest, StreamObserver<org.xiaofu.tri.GreeterReply>> greetFunc = this::greet;
            handlers.put(greetMethod.getMethodName(), new UnaryStubMethodHandler<>(greetFunc));
            BiConsumer<org.xiaofu.tri.GreeterRequest, StreamObserver<org.xiaofu.tri.GreeterReply>> greetAsyncFunc = syncToAsync(this::greet);
            handlers.put(greetProxyAsyncMethod.getMethodName(), new UnaryStubMethodHandler<>(greetAsyncFunc));

            handlers.put(greetServerStreamMethod.getMethodName(), new ServerStreamMethodHandler<>(this::greetServerStream));


            handlers.put(greetStreamMethod.getMethodName(), new BiStreamMethodHandler<>(this::greetStream));

            return new StubInvoker<>(this, url, Greeter.class, handlers);
        }


        @Override
        public org.xiaofu.tri.GreeterReply greet(org.xiaofu.tri.GreeterRequest request){
            throw unimplementedMethodException(greetMethod);
        }


            /**
         * <pre>
         *  serverStream
         * </pre>
         */
        @Override
        public void greetServerStream(org.xiaofu.tri.GreeterRequest request, StreamObserver<org.xiaofu.tri.GreeterReply> responseObserver){
            throw unimplementedMethodException(greetServerStreamMethod);
        }

        @Override
        public StreamObserver<org.xiaofu.tri.GreeterRequest> greetStream(StreamObserver<org.xiaofu.tri.GreeterReply> responseObserver){
            throw unimplementedMethodException(greetStreamMethod);
        }


        @Override
        public final ServiceDescriptor getServiceDescriptor() {
            return serviceDescriptor;
        }
        private RpcException unimplementedMethodException(StubMethodDescriptor methodDescriptor) {
            return TriRpcStatus.UNIMPLEMENTED.withDescription(String.format("Method %s is unimplemented",
                "/" + serviceDescriptor.getInterfaceName() + "/" + methodDescriptor.getMethodName())).asException();
        }
    }

}
