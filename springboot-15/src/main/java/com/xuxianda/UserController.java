package com.xuxianda;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by Xianda Xu on 2018/4/5.
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user/home", method = RequestMethod.GET)
    public String home() {
        return "user home";
    }

    @GetMapping(value = "/user/show")
    public String show() {
        return "user show";
    }

    @PostMapping(value = "/user/create")
    public String create(@RequestBody Map userName) {
        return "user create:"+userName;
    }

    @GetMapping("/user/{id}")
    public String display(@PathVariable(name = "id") String id) {
        return "user display id = " + id;
    }

}
