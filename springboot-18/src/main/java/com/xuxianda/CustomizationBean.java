package com.xuxianda;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Xianda Xu on 2018/4/13.
 * 设置web容器属性
 */
@Component
public class CustomizationBean implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>  {
    @Override
    public void customize(ConfigurableServletWebServerFactory server) {
        System.out.println(server.getClass().toString());
        //server.setPort(8888);
    }
}
