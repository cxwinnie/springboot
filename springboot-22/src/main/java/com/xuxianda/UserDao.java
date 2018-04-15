package com.xuxianda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Xianda Xu on 2018/4/15.
 */
@Component
public class UserDao {

    Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void log(){
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

}
