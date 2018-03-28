package com.xuxianda;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Xianda Xu on 2018/3/28.
 */
public class RunnableFactoryBean implements FactoryBean<Jeep> {
    @Override
    public Jeep getObject() throws Exception {
        return new Jeep();
    }

    @Override
    public Class<Jeep> getObjectType() {
        return Jeep.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
