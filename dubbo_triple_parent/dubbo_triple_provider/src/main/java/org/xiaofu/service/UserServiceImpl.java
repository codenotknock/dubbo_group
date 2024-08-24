package org.xiaofu.service;

import org.apache.dubbo.common.stream.StreamObserver;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author xiaofu
 * @date 2024/08/22
 * @program dubbo_group
 * @description UserServiceImpl
 **/

//@DubboService // todo 临时注释，避免影响 DemoProtocolsServiceImpl 的测试
public class UserServiceImpl implements UserService {
    @Override
    public String userServiceUnary(String name) {
        System.out.println("UserServiceImpl.userServiceUnary name:" + name);
        return "one method invoke";
    }

    @Override
    public void userServiceServerStream(String name, StreamObserver<String> streamObserver) {
        System.out.println("UserServiceImpl.userServiceServerStream name:" + name);
        streamObserver.onNext("serverStream return ");
        streamObserver.onCompleted();

    }

    @Override
    public StreamObserver<String> userServiceStream(StreamObserver<String> streamObserver) {
        System.out.println("UserServiceImpl.userServiceStream");
        return new StreamObserver<String>() {
            @Override
            public void onNext(String data) {
                System.out.println("data = " + data);
                streamObserver.onNext("bi stream return");
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("UserServiceImpl.userServiceStream onCompleted");
            }
        };
    }
}
