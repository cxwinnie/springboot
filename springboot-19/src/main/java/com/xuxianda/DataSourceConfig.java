package com.xuxianda;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * Created by Xianda Xu on 2018/4/15.
 */
@SpringBootConfiguration
public class DataSourceConfig {

    @Autowired
    private Environment evi;

    /**
     * 自定义druid连接池  方法一
     * @return
     */
    /*@Bean
    @ConfigurationProperties(prefix="app.datasource")
    public DataSource dataSource() {
        return new DruidDataSource();
    }*/

    /**
     * 自定义连接池 方法二
     * @return
     */
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(evi.getProperty("app.datasource.url"));
        dataSource.setUsername(evi.getProperty("app.datasource.username"));
        dataSource.setPassword(evi.getProperty("app.datasource.password"));
        return dataSource;
    }

}
