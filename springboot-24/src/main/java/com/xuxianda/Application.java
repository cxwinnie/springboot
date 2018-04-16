package com.xuxianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Xianda Xu on 2018/4/16.
 * springboot测试步骤
 * 直接在测试类上加如下2个注解
 *  @RunWith(SpringRunner.class)
 *  @SpringBootTest
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    }

}
