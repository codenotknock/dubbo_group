package org.xiaofu.service;

import org.apache.dubbo.common.stream.StreamObserver;
import org.apache.dubbo.config.annotation.DubboService;
import org.xiaofu.tri.DubboGreeterTriple;
import org.xiaofu.tri.GreeterReply;
import org.xiaofu.tri.GreeterRequest;

/**
 * @author xiaofu
 * @date 2024/08/21
 * @program dubbo_group
 * @description DemoServiceImpl
 **/

@DubboService
public class GreeterImpl extends DubboGreeterTriple.GreeterImplBase {

    @Override
    public void greet(GreeterRequest request, StreamObserver<GreeterReply> responseObserver) {
        System.out.println("GreeterImpl.greet: " + request.getName());
        super.greet(request, responseObserver);
    }
}
