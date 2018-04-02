package com.xuxianda;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Xianda Xu on 2018/4/2.
 */
public class MyApplicationEvent extends ApplicationEvent {

    private static final long serialVersionUID = -9181557133525643777L;

    public MyApplicationEvent(Object source) {
        super(source);
    }
}
