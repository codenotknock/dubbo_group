package org.xiaofu.service;

import org.apache.dubbo.common.stream.StreamObserver;

/**
 * @author xiaofu
 * @date 2024/08/22
 * @program dubbo_group
 * @description triple java接口的方式开发：不支持异构系统
 **/

public interface UserService {
    // 一元操作
    String userServiceUnary(String name);

    // 服务端流式 RPC
    void userServiceServerStream(String name, StreamObserver<String> streamObserver);

    // 双向流式 RPC
    StreamObserver<String> userServiceStream(StreamObserver<String> streamObserver);

}
