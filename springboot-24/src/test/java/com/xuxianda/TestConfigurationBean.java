package com.xuxianda;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by Xianda Xu on 2018/4/16.
 */
@TestConfiguration
public class TestConfigurationBean {

    @Bean
    public Runnable createRunnable(){
        return ()->{
            System.out.println(123456);
        };
    }

}
