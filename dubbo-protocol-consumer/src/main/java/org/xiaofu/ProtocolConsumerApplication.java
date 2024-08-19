package org.xiaofu;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ProtocolConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProtocolConsumerApplication.class, args);
        System.out.println("ProtocolConsumerApplication 启动成功，，，");
    }
}
