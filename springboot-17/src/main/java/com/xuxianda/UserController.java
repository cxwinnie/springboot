package com.xuxianda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Xianda Xu on 2018/04/11 16:40.
 */
@RestController
public class UserController {

    @GetMapping("/user/home")
    public String login(){
        System.out.println("/user/home");
        return "user home";
    }

    @GetMapping("/user/error")
    public String error(){
        throw new IllegalArgumentException("arg is error");
    }

}
