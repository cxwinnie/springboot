package com.xuxianda;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * Created by Xianda Xu on 2018/04/03 14:26.
 * ApplicationContextInitializer 接口在spring容器执行refreshed之前的一个回掉
 * 使用步骤：
 * 1：写一个类，实现ApplicationContextInitializer接口
 * 2：注册ApplicationContextInitializer
 *
 * 注册方法
 * 1：SpringApplication.addInitializers
 *
 *
 * CommandLineRunner 接口是在容器启动成功后的最后一步回掉
 * 使用步骤：
 * 1：写一个类，实现CommandLineRunner解耦
 * 2：把该类纳入spring容器的管理
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.addInitializers(new MyApplicationContextInitializer());
        ConfigurableApplicationContext context = app.run("aaa","bbb");
        ApplicationArguments bean = context.getBean(ApplicationArguments.class);
        System.out.println(Arrays.asList(bean.getSourceArgs()));
        context.close();
    }

}
