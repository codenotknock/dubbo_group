package org.xiaofu.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.xiaofu.entity.User;

/**
 * @author xiaofu
 * @date 2024/08/18
 * @program dubbo_group
 * @description UserService api 实现
 **/

@DubboService
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
