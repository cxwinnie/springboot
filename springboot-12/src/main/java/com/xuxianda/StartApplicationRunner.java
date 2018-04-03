package com.xuxianda;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by Xianda Xu on 2018/04/03 15:31.
 */
@Component
public class StartApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("传入参数为："+ Arrays.asList(args.getSourceArgs()));
    }
}
