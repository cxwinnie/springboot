package com.xuxianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Xianda Xu on 2018/4/1.
 * @EnableConfigurationProperties 是用来启用一个特性的，这个特性就是，可以把配置文件的属性注入到bean里面去，即启用@ConfigurationProperties注解
 * @EnableAsync 启用异步执行，需要配合@Async使用
 */

//@EnableConfigurationProperties
@SpringBootApplication
/*@EnableAsync//启用异步执行*/
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        System.out.println(context.getBean(TomcatProperties.class));
        context.getBean(Jeep.class).run();
        System.out.println("==========");
        context.close();
    }

}
