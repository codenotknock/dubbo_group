package org.xiaofu;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xiaofu.entity.User;
import org.xiaofu.service.UserService;

/**
 * @author xiaofu
 * @date 2024/08/18
 * @program dubbo_group
 * @description ClientApplication consumer
 **/

@Slf4j
@SpringBootApplication
@EnableDubbo
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);

//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext-consumer.xml");
//        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
//        boolean login = userService.login(new User("xiaofu", "123456"));
//        log.info("userService.login：" + String.valueOf(login));
    }
}
