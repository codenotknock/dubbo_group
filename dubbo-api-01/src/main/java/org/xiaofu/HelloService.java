    package org.xiaofu;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

@javax.annotation.Generated(
value = "by Dubbo generator",
comments = "Source: HelloService.proto")
public interface HelloService {
static final String JAVA_SERVICE_NAME = "org.xiaofu.HelloService";
static final String SERVICE_NAME = ".HelloService";

    // FIXME, initialize Dubbo3 stub when interface loaded, thinking of new ways doing this.
    static final boolean inited = HelloServiceDubbo.init();

    org.xiaofu.HelloResponse sayHello(org.xiaofu.HelloRequest request);

    CompletableFuture<org.xiaofu.HelloResponse> sayHelloAsync(org.xiaofu.HelloRequest request);


}
