package org.xiaofu;


import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@EnableDubbo
public class GrpcProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrpcProviderApplication.class, args);
        System.out.println("GrpcProviderApplication 启动成功...");
    }
}
