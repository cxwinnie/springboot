package com.xuxianda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Xianda Xu on 2018/3/28.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Override
    public String toString() {
        return "UserController{" +
                "userService=" + userService +
                '}';
    }
}
