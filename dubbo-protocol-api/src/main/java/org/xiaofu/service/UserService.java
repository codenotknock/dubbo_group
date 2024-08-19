package org.xiaofu.service;

import org.xiaofu.entity.User;

/**
 * @author xiaofu
 * @date 2024/08/18
 * @program dubbo_group
 * @description UserService api
 **/
public interface UserService {

    /**
     * 登录
     * @param user
     * @return
     */
    public boolean login(User user);
}
