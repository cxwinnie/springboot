package com.xuxianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by Xianda Xu on 2018/4/13.
 */
@SpringBootApplication
@EnableTransactionManagement//支持事务
public class Application {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        DataSource dataSource = context.getBean(DataSource.class);
        /*Connection connection = dataSource.getConnection();
        System.out.println(connection.getCatalog());
        connection.close();
        System.out.println(context.getBean(JdbcTemplate.class));*/
        ProductDao productDao = context.getBean(ProductDao.class);
        //productDao.test1();
        productDao.batchInsert(new String[]{"张三","李四","王五"});
        System.out.println(dataSource.getClass().toString());
        context.close();
    }

}
