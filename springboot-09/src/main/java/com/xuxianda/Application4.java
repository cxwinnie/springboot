package com.xuxianda;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Xianda Xu on 2018/4/1.
 */
//@SpringBootApplication
//@EnableEcho(packages = {"com.xuxianda.bean1","com.xuxianda.bean2"})
public class Application4 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application4.class, args);
        context.close();
    }

}
