package com.xuxianda;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Xianda Xu on 2018/4/2.
 */
@Component
public class MyEventHandle {

    @EventListener
    public void event(Object event){
        System.out.println("MyEventHandle 接收到事件：" + event.getClass());
    }

    @EventListener
    public void event2(ContextStoppedEvent event){
        System.out.println("应用停止事件：" + event.getClass());
    }

}
