package org.xiaofu.service;

import org.apache.dubbo.rpc.protocol.rest.support.ContentType;
import org.xiaofu.entity.Order;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author xiaofu
 * @date 2024/08/20
 * @program dubbo_group
 * @description OrderService rest协议模拟开发
 **/
@Path("orders")
@Consumes({MediaType.APPLICATION_JSON})  // client给服务端发送请求的数据 相当于@Resquest
@Produces({ContentType.APPLICATION_JSON_UTF_8})  // 服务端给client发送的数据 相当于@ResponseBody
public interface OrderService {

    @GET
    @Path("{id}")
    Order getOrder(@PathParam("id") Long id);
}
