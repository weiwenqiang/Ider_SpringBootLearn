package com.wwq.two2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wwq on 2017/12/1.
 */
@RestController
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class UserJsonController {


    @RequestMapping("/user")
    public User hello(){
        User user = new User();
        user.setName("张无忌");
        user.setAge(28);
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserJsonController.class, args);
    }


}
