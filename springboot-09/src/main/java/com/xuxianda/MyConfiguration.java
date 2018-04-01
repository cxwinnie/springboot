package com.xuxianda;

import org.springframework.context.annotation.Bean;

/**
 * Created by Xianda Xu on 2018/4/1.
 */
public class MyConfiguration {

    @Bean
    private Runnable createRunnable1(){
        return ()->{};
    }

    @Bean
    private Runnable createRunnable2(){
        return ()->{};
    }

}
