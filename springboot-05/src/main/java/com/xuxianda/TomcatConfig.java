package com.xuxianda;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * 支持数据、集合，配置方式参考tomcat.properties
 * Created by Xianda Xu on 2018/4/1.
 */
@Configuration
@ConfigurationProperties("tomcat")
public class TomcatConfig {

    private List<String> host;

    private String[] port;

    public List<String> getHost() {
        return host;
    }

    public void setHost(List<String> host) {
        this.host = host;
    }

    public String[] getPort() {
        return port;
    }

    public void setPort(String[] port) {
        this.port = port;
    }

    public void show(){
        System.out.println(host.toString());
        System.out.println(Arrays.asList(port).toString());
    }

}
