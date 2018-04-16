package com.xuxianda;

import com.xuxianda.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Xianda Xu on 2018/4/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=TestConfigurationBean.class)
public class ApplicationContextTest {

    @Autowired
    public ApplicationContext applicationContext;

    @Test
    public void testNull(){
        Assert.assertNotNull(applicationContext.getBean(User.class));
        Assert.assertNotNull(applicationContext.getBean(Runnable.class));
    }

}
