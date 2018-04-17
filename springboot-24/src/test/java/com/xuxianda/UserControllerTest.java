package com.xuxianda;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Xianda Xu on 2018/04/17 09:49.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHome() {
        String body = this.restTemplate.getForObject("/home", String.class);
        Assert.assertEquals(body,"home");
    }

    @Test
    public void testShow() {
        String body = this.restTemplate.getForObject("/show?id=1", String.class);
        Assert.assertEquals(body,"show");
    }

}
