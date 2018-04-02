package com.xuxianda;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by Xianda Xu on 2018/4/2.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EchoImportBeanDefinitionRegistrar.class)
public @interface EnableEcho {

    String[] packages();

}
