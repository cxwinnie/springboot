package com.xuxianda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Xianda Xu on 2018/03/28 17:42.
 */
@Configuration
public class MyConfig {

    @Bean(name = "myBean")
    @Scope("prototype")//多例   singleton单例
    public MyBean getMyBean(){
        return new MyBean();
    }

}
