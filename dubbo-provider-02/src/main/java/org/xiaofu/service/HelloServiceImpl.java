package org.xiaofu.service;

import org.xiaofu.HelloRequest;
import org.xiaofu.HelloResponse;
import org.xiaofu.HelloService;

import java.util.concurrent.CompletableFuture;

/**
 * @author xiaofu
 * @date 2024/08/19
 * @program dubbo_group
 * @description HelloServiceImpl  protobuf
 **/

public class HelloServiceImpl implements HelloService {
    @Override
    public HelloResponse sayHello(HelloRequest request) {
        System.out.println("HelloServiceImpl.sayHello request:" + request.getName());
        return HelloResponse.newBuilder().setResult("sayHello result").build();
    }

    @Override
    public CompletableFuture<HelloResponse> sayHelloAsync(HelloRequest request) {
        return CompletableFuture.completedFuture(sayHello(request));
    }
}
