package org.xiaofu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaofu
 * @date 2024/08/20
 * @program dubbo_group
 * @description rest协议模拟开发
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private String orderNo;

    private double price;
}
