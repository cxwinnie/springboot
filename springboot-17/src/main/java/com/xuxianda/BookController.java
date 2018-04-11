package com.xuxianda;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

/**
 * Created by Xianda Xu on 2018/4/11.
 */
@RestController
public class BookController {
    /**
     * 仅限于本类的异常，其他类的异常无法捕捉
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public String error(Exception e){
        return "exception" + e.getClass().getName();
    }

    @GetMapping("/book/error1")
    public String error1() throws FileNotFoundException{
        throw new FileNotFoundException("file not found");
    }

    @GetMapping("/book/error2")
    public String error2() throws ClassNotFoundException{
        throw new ClassNotFoundException("file not found");
    }

}
