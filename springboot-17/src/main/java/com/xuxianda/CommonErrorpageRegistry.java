package com.xuxianda;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;

/**
 * Created by Xianda Xu on 2018/4/11.
 */
//@Component
public class CommonErrorpageRegistry implements ErrorPageRegistrar{
    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND,"/404.html");
        ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/500.html");
        ErrorPage arg = new ErrorPage(IllegalArgumentException.class,"/arg.html");
        registry.addErrorPages(e404,e500,arg);
    }
}
