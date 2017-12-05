package com.wwq.one6;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wwq on 2017/12/1.
 */
@RestController
/**
 * 去掉这个类的自动配置，变为手动配置
 */
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@Configuration
public class HelloController {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        System.out.print("进入了 HelloController");
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(HelloController.class);
        /**
         * banner.txt 可以替换banner , 这里可以设置关掉Banner显示..
         */
        application.setBannerMode(Mode.OFF);
        application.run(args);
    }
}
