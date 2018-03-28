package com.xuxianda;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Xianda Xu on 2018/3/28.
 */
public class Cat  implements InitializingBean,DisposableBean{
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("======afterPropertiesSet=======");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("=========destroy===========");
    }
}
