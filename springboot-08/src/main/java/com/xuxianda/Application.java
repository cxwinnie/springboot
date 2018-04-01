package com.xuxianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Xianda Xu on 2018/4/1.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        System.out.println(context.getBeansOfType(EncodeConvert.class));
        System.out.println(context.getBeansOfType(Runnable.class));
        context.close();
    }

}
