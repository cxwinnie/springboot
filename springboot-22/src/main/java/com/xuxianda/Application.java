package com.xuxianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Xianda Xu on 2018/4/15.
 * springboot的默认日志级别是info
 * 可以logging.level.*=debug设置，*可以是包，也可以是某各类
 * 日志级别：TRACE, DEBUG, INFO, WARN, ERROR, FATAL, OFF
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        context.getBean(UserDao.class).log();
        context.close();
    }

}
