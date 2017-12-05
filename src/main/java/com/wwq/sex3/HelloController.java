package com.wwq.sex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
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

    @Value("${icupSize}")
    private String cupSize;
    @Value("${iage}")
    private int age;
    @Value("${content}")
    private String content;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello World!\n"+"罩杯:"+cupSize+"年龄"+age+"\ncontent:"+content+girlProperties.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}
