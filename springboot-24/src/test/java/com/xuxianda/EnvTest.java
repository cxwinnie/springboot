package com.xuxianda;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Xianda Xu on 2018/4/16.
 * springboot会优先加载测试环境下的配置文件
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties={""})
public class EnvTest {

    @Autowired
    private Environment environment;

    @Test
    public void testValue(){
        Assert.assertEquals("zhangsan",environment.getProperty("app.name"));
    }

}
