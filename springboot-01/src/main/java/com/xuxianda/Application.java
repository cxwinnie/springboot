package com.xuxianda;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Xianda Xu on 2018/03/28 17:40.
 */
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class,User.class,UserDao.class,UserService.class,UserController.class);
        System.out.println(context.getBean(MyBean.class));
        System.out.println(context.getBean("myBean"));
        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean("getRunnableFactoryBean"));
        System.out.println(context.getBean("&getRunnableFactoryBean"));
        System.out.println(context.getBean(RunnableFactoryBean.class));
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(UserDao.class));
        System.out.println(context.getBean(UserService.class));
        System.out.println(context.getBean(UserController.class));
        User user = context.getBean(User.class);
        System.out.println(user.toString());
        context.close();
    }

}
