package org.xiaofu.service;

import org.apache.dubbo.rpc.protocol.rest.support.ContentType;
import org.xiaofu.entity.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author xiaofu
 * @date 2024/08/18
 * @program dubbo_group
 * @description UserService api
 **/
@Path("users")
@Consumes({MediaType.APPLICATION_JSON})  // client给服务端发送请求的数据 相当于@Resquest
@Produces({ContentType.APPLICATION_JSON_UTF_8})  // 服务端给client发送的数据 相当于@ResponseBody
public interface UserService {

    /**
     * 登录
     * @param user
     * @return
     */
    @GET
    public boolean login(User user);
}
