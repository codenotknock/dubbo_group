package org.xiaofu.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.xiaofu.entity.Order;

/**
 * @author xiaofu
 * @date 2024/08/20
 * @program dubbo_group
 * @description OrderIServiceImpl
 **/
@DubboService
public class OrderIServiceImpl implements OrderService{
    @Override
    public Order getOrder(Long id) {
        System.out.println("OrderIServiceImpl.getOrder.id: " + id);
        return new Order(String.valueOf(id), 999.0);
    }
}
