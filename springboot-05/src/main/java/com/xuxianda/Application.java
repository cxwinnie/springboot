package com.xuxianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by Xianda Xu on 2018/3/29.
 */
@SpringBootApplication
public class Application {

    @Bean
    public Runnable getRunnable(){
        return ()->{
            System.out.println("=============getRunnable============");
        };
    }

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        context.getBean(Runnable.class).run();
        System.out.println(context.getEnvironment().getProperty("local.ip"));
        context.getBean(UserConfig.class).show();
        context.close();
    }

}
