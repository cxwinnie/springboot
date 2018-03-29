package com.xuxianda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by Xianda Xu on 2018/3/29.
 * 两种获取配置的方法
 * 配置文件默认的文件名为application.properties
 * 默认的位置在classpath根目录，或者classpath:/config目录下
 */
@Configuration
public class UserConfig {

    @Value("${port}")
    private String port;

    @Autowired
    private Environment environment;

    public void show(){
        System.out.println(environment.getProperty("port"));
        System.out.println(port);
        System.out.println(environment.getProperty("app.name"));
    }

}
