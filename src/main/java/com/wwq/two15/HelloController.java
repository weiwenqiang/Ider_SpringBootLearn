package com.wwq.two15;

import com.wwq.sex3.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by wwq on 2017/12/1.
 */
@RestController
@SpringBootApplication
@Configuration
public class HelloController {


    @RequestMapping("/index")
    public String index(Map<String,Object> map){
        map.put("name", "Andy");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}
