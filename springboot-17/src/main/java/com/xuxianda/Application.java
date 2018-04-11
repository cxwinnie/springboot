package com.xuxianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Xianda Xu on 2018/04/11 16:39.
 *  拦截器的使用步骤
 *  1.写一个拦截器，实现HandlerInterceptor
 *  2.写一个类，继承WebMvcConfigurationSupport，重写addInterceptors方法，把上一步的拦截器加进去
 *
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
