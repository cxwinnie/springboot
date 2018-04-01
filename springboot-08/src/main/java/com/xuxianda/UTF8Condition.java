package com.xuxianda;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Xianda Xu on 2018/4/1.
 */
public class UTF8Condition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String encoding = System.getProperty("file.encoding");
        if(encoding != null){
            return "utf-8".equals(encoding.toLowerCase());
        }
        return false;
    }
}
