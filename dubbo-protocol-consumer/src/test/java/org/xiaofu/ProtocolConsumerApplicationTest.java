package org.xiaofu;

import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.xiaofu.entity.User;
import org.xiaofu.service.UserService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProtocolConsumerApplicationTest {

    @DubboReference
    private UserService userService;

    @Test
    void test1() {
        boolean login = userService.login(new User("xiaofu", "123456"));
        System.out.println("userService.login result: " + login);
    }

}
