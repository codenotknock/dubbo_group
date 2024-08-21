package org.xiaofu;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class TripleConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TripleConsumerApplication.class, args);
        System.out.println("TripleConsumerApplication 启动成功，，，");
    }
}
