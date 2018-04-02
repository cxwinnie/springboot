package com.xuxianda;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by Xianda Xu on 2018/4/2.
 */
public class EchoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        Map<String, Object> attr = annotationMetadata.getAnnotationAttributes(EnableEcho.class.getName());
        String[] packArr = (String[])attr.get("packages");
        List<String> packages = Arrays.asList(packArr);

        BeanDefinitionBuilder bdb = BeanDefinitionBuilder.rootBeanDefinition(EchoBeanPostProcessor.class);
        bdb.addPropertyValue("packages",packages);

        beanDefinitionRegistry.registerBeanDefinition(EchoBeanPostProcessor.class.getName(),bdb.getBeanDefinition());
    }
}
