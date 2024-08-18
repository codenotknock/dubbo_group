package org.xiaofu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

@Slf4j
public class ProviderMain {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext-provider.xml");
        classPathXmlApplicationContext.start();
        log.info("ProviderMain 启动成功，，，");
        // 阻塞
        new CountDownLatch(1).await();
    }
}
