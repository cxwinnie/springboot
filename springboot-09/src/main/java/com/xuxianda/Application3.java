package com.xuxianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Xianda Xu on 2018/4/1.
 */
@SpringBootApplication
@MyLog("my springboot")
public class Application3 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application3.class, args);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBeansOfType(Runnable.class));
        context.close();
    }

}
