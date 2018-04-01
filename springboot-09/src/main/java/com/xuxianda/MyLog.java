package com.xuxianda;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by Xianda Xu on 2018/4/1.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportSelector.class)
public @interface MyLog {
    String value() default "";
}
