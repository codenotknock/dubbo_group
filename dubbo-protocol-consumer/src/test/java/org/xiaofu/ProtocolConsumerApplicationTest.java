package org.xiaofu;

import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.xiaofu.entity.Order;
import org.xiaofu.service.OrderService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProtocolConsumerApplicationTest {

    @DubboReference(url = "rest://192.168.0.105:9001/xiaofu/org.xiaofu.service.OrderService", protocol = "rest")
    private OrderService orderService;

    @Test
    void test1() {
        Order order = orderService.getOrder(2L);
        System.out.println("orderService.getOrder result: " + order);
    }

}
