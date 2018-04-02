package com.xuxianda;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Xianda Xu on 2018/4/2.
 * 自定义监听器
 */
@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
    @Override
    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        System.out.println("==========================="+myApplicationEvent.getClass());
    }
}
