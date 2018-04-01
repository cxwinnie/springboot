package com.xuxianda;

import com.google.gson.Gson;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * Created by Xianda Xu on 2018/4/1.
 */
@SpringBootConfiguration
public class UserConfiguration {

    @Bean
    @ConditionalOnProperty(value = "runnalbe.enabled",havingValue = "true",matchIfMissing=true)
    public Runnable getRunnable(){
        return ()->{};
    }

    /**
     * 根据jvm中是否有Gson这个class类来判断
     * @return
     */
    @Bean
    @ConditionalOnClass(value = Gson.class)
    public Runnable getGSONRunnable(){
        return ()->{};
    }

    @Bean
    @ConditionalOnBean(name = "user")
    public Runnable getBeanRunnable(){
        return ()->{};
    }

}
