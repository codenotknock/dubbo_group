package org.xiaofu;

import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GrpcConsumerApplicationTest {

    @DubboReference(url = "xxx", protocol = "grpc")
    private DubboDemoServiceGrpc.IDemoService iDemoService;

    @Test
    void test1() {
        ResponseData responseData = iDemoService.service(RequestData.newBuilder().setName("xiaofu").build());
        System.out.println("DubboDemoServiceGrpc.demoService.service result:" + responseData);
    }

}
