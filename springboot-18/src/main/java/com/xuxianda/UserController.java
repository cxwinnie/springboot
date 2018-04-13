package com.xuxianda;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Xianda Xu on 2018/4/13.
 */
@RestController
public class UserController {

    @RequestMapping("/user/home")
    public String home(){
        return "user/home";
    }

}
