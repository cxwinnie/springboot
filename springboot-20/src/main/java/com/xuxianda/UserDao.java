package com.xuxianda;

import org.springframework.stereotype.Repository;

/**
 * Created by Xianda Xu on 2018/4/15.
 */
@Repository
public class UserDao implements IUserDao {

    public void add(String userName,String password){
        System.out.println(userName + ":" + password);
    }

}
