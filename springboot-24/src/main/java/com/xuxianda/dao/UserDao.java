package com.xuxianda.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Xianda Xu on 2018/4/16.
 */
@Repository
public class UserDao {

    public Integer addUser(String userName){
        System.out.println("userdao addUser [username=]"+userName+"]");
        if(userName == null){
            return 0;
        }
        return 1;
    }

}
