package org.xiaofu;

import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.xiaofu.tri.DubboGreeterTriple;
import org.xiaofu.tri.GreeterRequest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TripleConsumerApplicationTest {

    // registry 指定注册中心
    @DubboReference(url = "xxx", protocol = "tri", registry = {"beijing"})
    private DubboGreeterTriple.GreeterImplBase greeterImplBase;

    @Test
    void test1() {
        greeterImplBase.greet(GreeterRequest.newBuilder().setName("xiaofu").build(), null);
    }

}
