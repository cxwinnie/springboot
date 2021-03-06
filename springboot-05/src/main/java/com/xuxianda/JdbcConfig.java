package com.xuxianda;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Xianda Xu on 2018/4/1.
 */
@Configuration
public class JdbcConfig {

    @Value("${url}")
    private String url;

    @Value("${driverClassName}")
    private String driverClassName;

    public void show(){
        System.out.println("url:" + url);
        System.out.println("driverClassName:" + driverClassName);
    }

}
