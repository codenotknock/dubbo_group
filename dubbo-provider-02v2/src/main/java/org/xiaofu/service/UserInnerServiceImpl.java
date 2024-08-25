package org.xiaofu.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.xiaofu.entity.User;

/**
 * @author xiaofu
 * @date 2024/08/18
 * @program dubbo_group
 * @description UserService api 实现
 **/
// 注册中心的group是对某些服务进行隔离；Dubbo的group体现的是对一个服务的多种实现方式,version一般与其同时使用
@DubboService(group = "user1", version="v1")  // group 指定服务的分组
public class UserInnerServiceImpl implements UserService{
    @Override
    public boolean login(User user) {
        System.out.println("UserInnerServiceImpl.login.user:" + user.toString());
        if ("xiaofu".equals(user.getName()) && "123456".equals(user.getPassword())) {
            return true;
        }

        return false;
    }
}
