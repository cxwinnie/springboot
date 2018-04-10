package com.xuxianda;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xx on 2017/4/26.
 * 在springboot里面使用jsp，需要另外加入tomcat-embed-jasper依赖
 */
@Controller
public class LoginController {

    @PostMapping("/login")
    public String say(@RequestParam("userName") String userName, @RequestParam("password") String password){
        if(userName.equals(password)){
            return "ok";
        }
        return "fail";
    }

    @GetMapping("/login")
    public String loginIndex(Model model){
        model.addAttribute("value","asdfasdf");
        return "index";
    }
}
