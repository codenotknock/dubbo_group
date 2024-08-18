package org.xiaofu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author xiaofu
 * @date 2024/08/18
 * @program dubbo_group
 * @description User
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {
    String name;
    String password;
}
