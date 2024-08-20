package org.xiaofu.service;

import io.grpc.stub.StreamObserver;
import org.apache.dubbo.config.annotation.DubboService;
import org.xiaofu.DubboDemoServiceGrpc;
import org.xiaofu.RequestData;
import org.xiaofu.ResponseData;

/**
 * @author xiaofu
 * @date 2024/08/21
 * @program dubbo_group
 * @description DemoServiceImpl
 **/

@DubboService
public class DemoServiceImpl extends DubboDemoServiceGrpc.DemoServiceImplBase {


    @Override
    public void service(RequestData request, StreamObserver<ResponseData> responseObserver) {
        System.out.println("DemoServiceImpl.service: " + request.getName());

        responseObserver.onNext(ResponseData.newBuilder().setMessage("result...... ").build());
        responseObserver.onCompleted();

    }
}
