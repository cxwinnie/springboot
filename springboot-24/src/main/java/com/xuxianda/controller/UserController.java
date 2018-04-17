package com.xuxianda.controller;

import com.xuxianda.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Xianda Xu on 2018/04/17 09:45.
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/show")
    public String show(@RequestParam("id") String id){
        return "show";
    }

}
