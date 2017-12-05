package com.wwq.one5;

import com.wwq.MainApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wwq on 2017/12/1.
 */
@RestController
@SpringBootApplication
@Configuration
public class HelloController {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        System.out.print("进入了 HelloController");
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}
