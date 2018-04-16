package com.xuxianda;

import com.xuxianda.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Xianda Xu on 2018/4/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @MockBean
    private UserMapper userMapper;

    @Test
    public void testCreateUser(){
        BDDMockito.given(userMapper.createUser("admin")).willReturn(Integer.valueOf(1));
        BDDMockito.given(userMapper.createUser("")).willReturn(Integer.valueOf(0));
        BDDMockito.given(userMapper.createUser(null)).willThrow(NullPointerException.class);

        Assert.assertEquals(Integer.valueOf(1),userMapper.createUser("admin"));
        Assert.assertEquals(Integer.valueOf(0),userMapper.createUser(""));
    }

}
