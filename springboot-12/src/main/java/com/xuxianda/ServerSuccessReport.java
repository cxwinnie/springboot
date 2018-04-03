package com.xuxianda;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Xianda Xu on 2018/04/03 15:12.
 */
@Order(1)
@Component
public class ServerSuccessReport implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("=========应用已经成功启动=========");
    }
}
