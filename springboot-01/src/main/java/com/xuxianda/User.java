package com.xuxianda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * Created by Xianda Xu on 2018/3/28.
 */
@Component//没有明确角色时使用
public class User {

    @Autowired//Spring自带注解
    private UserController userController;

    @Resource//JSR-250注解
    private Cat cat;

    @Inject//JSR-330注解
    private Dog dog;

    @Override
    public String toString() {
        return "User{" +
                "userController=" + userController +
                '}';
    }
}
