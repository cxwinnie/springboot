package com.xuxianda;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by Xianda Xu on 2018/4/1.
 */
@Component
public class Jeep implements Runnable {

    @Override
    @Async
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("======="+i+"========");
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
