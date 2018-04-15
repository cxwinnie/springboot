package com.xuxianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Xianda Xu on 2018/4/15.
 * AOP开发流程
 * 1：spring-boot-start-aop，加入依赖，默认开启了AOP的支持
 * 2：写一个Aspect，封装横切关注点（日志，监控等等），需要配置通知（前置通知，后置通知等等）和切入点
 * 3：这个Aspect需要纳入到spring容器管理，并且需要加入@Aspect注解
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        IUserDao userDao = context.getBean(IUserDao.class);
        System.out.println(userDao.getClass());
        userDao.add("张三","123456");
        context.close();
    }

}
