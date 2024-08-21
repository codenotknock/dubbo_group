package org.xiaofu;


import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@EnableDubbo
public class TripleProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(TripleProviderApplication.class, args);
        System.out.println("TripleProviderApplication 启动成功...");
    }
}
