package com.xuxianda;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

/**
 * Created by Xianda Xu on 2018/04/03 15:12.
 */
@Order(2)
@Component
public class ServerStartReport implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("=========应用开始"+ LocalTime.now().toString());
    }
}
