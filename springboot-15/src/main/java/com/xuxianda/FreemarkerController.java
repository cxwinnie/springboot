package com.xuxianda;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Xianda Xu on 2018/4/10.
 * 在spring boot中使用freemarker的步骤
 * 1：在pom.xml里面加入如下依赖
 *   <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-freemarker</artifactId>
     </dependency>
   2：默认路径在classpath:/templates，默认的文件扩展名为ftl（详细见类FreeMarkerProperties.java）
 */
@Controller
public class FreemarkerController {

    @GetMapping("/reg")
    public String reg(){
        return "reg";
    }

    @GetMapping("/logout")
    public String logout(Model model){
        model.addAttribute("userName","admin");
        model.addAttribute("password","123545");
        return "logout";
    }

}
