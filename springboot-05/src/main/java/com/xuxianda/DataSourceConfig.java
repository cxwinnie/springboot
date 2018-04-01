package com.xuxianda;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Xianda Xu on 2018/4/1.
 *
 */
@Component
@ConfigurationProperties("ds")//以ds为前缀（详见springboot官方文档）
public class DataSourceConfig {

    private String url;

    private String driverClassName;

    private String username;

    private String password;

    public void show(){
        System.out.println("ds.url:"+url);
        System.out.println("ds.driverClassName:"+driverClassName);
        System.out.println("ds.username:"+username);
        System.out.println("ds.password:"+password);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
