package com.xuxianda;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.List;

/**
 * Created by Xianda Xu on 2018/4/2.
 */
public class EchoBeanPostProcessor implements BeanPostProcessor {

    private List<String> packages;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        for(String pack : packages){
            if(bean.getClass().getName().startsWith(pack)){
                System.out.println("echo bean :"+bean.getClass().getName());
            }
        }
        return bean;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }
}
