package org.xiaofu;

import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.xiaofu.entity.User;
import org.xiaofu.service.UserService;

@SpringBootTest
class ConsumerApplicationTest {

    private static final Logger log = LoggerFactory.getLogger(ConsumerApplicationTest.class);
    @DubboReference(url = "dubbo://192.168.0.105:20880/org.xiaofu.service.UserService")
    private UserService userService;

    @Test
    void contextLoads() {
        boolean login = userService.login(new User("xiaofu", "123456"));
        log.info("contextLoads.userService.login:" + login);
    }
}
