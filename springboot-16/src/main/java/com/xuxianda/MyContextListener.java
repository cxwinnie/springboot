package com.xuxianda;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDateTime;

/**
 * Created by Xianda Xu on 2018/04/11 15:04.
 */
@WebListener
public class MyContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("app start："+ LocalDateTime.now().toString());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
