package org.xiaofu.service;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author xiaofu
 * @date 2024/08/22
 * @program dubbo_group
 * @description DemoProtocolsServiceImpl 同时支持多种协议调用
 **/
// weight 结合权重的随机访问负载均衡算法
@DubboService(protocol = {"one", "two"}, registry = {"shanghai"}, weight = 2)
public class DemoProtocolsServiceImpl implements DemoProtocolsService{
    @Override
    public void show(String name) {
        System.out.printf("DemoProtocolsServiceImpl.show name:" + name);
    }
}
