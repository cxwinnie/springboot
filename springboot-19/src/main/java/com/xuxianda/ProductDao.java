package com.xuxianda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Xianda Xu on 2018/4/13.
 */
@Repository
public class ProductDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void test1(){
        jdbcTemplate.execute("insert into t_user values (2,'张安','asfd','12345')");
    }

    @Transactional//事务处理
    public void batchInsert(String ...names){
        for(String name : names){
            jdbcTemplate.execute("insert into t_user values ( 2,'"+name+"','asfd','12345')");
        }
    }

}
