package com.xuxianda;

import com.xuxianda.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Xianda Xu on 2018/04/17 09:49.
 * @WebMvcTest 不需要运行在web环境下，但是需要指定controllers，
 */
@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest2 {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testHome() throws Exception {
        this.mvc.perform(get("/home").accept(MediaType.TEXT_PLAIN)).andExpect(status().isOk()).andExpect(content().string("home"));
    }

    @Test
    public void testShow() throws Exception {
        this.mvc.perform(get("/show").param("id","1").accept(MediaType.TEXT_PLAIN));
        this.mvc.perform(get("/show").param("id","1").accept(MediaType.TEXT_PLAIN)).andExpect(status().isOk()).andExpect(content().string("show"));
    }
}
