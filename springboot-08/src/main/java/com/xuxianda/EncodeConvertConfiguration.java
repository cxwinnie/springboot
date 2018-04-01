package com.xuxianda;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @Conditional 基于条件的自动配置，一般配合Condition接口一起使用，只有接口（一个或多个）都返回true，才装配，否则不装配
 * 它可以用在方法上面，则只对该方法起作用，也可以用在类上，对该类下的所有方法起作用
 * Created by Xianda Xu on 2018/4/1.
 */
@SpringBootConfiguration
public class EncodeConvertConfiguration {

    @Bean
    @Conditional(GBKCondition.class)
    public GBKEncodeConvert getGBKEncodeConvert(){
        return new GBKEncodeConvert();
    }

    @Bean
    @Conditional(UTF8Condition.class)
    public UTF8EncodeConvert getUTF8EncodeConvert(){
        return new UTF8EncodeConvert();
    }

}
