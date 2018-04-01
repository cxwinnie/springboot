package com.xuxianda;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by Xianda Xu on 2018/4/1.
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println(annotationMetadata.getAnnotationAttributes(MyLog.class.getName()));
        return new String[]{"com.xuxianda.MyConfiguration",User.class.getName()};
    }
}
