package com.xuxianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * Created by Xianda Xu on 2018/4/1.
 * @Import用于导入一个或多个类，bean会被初始化进入Spring容器中
 */
@SpringBootApplication
@Import({User.class,MyConfiguration.class})
public class Application2 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application2.class, args);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBeansOfType(Runnable.class));
        context.close();
    }

}
