package com.xuxianda;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Xianda Xu on 2018/4/1.
 */
@Configuration
@PropertySource("classpath:/jdbc.properties")
@PropertySource("classpath:/ds.properties")
@PropertySource("classpath:/tomcat.properties")
public class FileConfig {
}
