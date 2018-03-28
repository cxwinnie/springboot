package com.xuxianda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Xianda Xu on 2018/3/28.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }
}
