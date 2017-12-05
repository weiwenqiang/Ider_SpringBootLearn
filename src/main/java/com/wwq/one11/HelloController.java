package com.wwq.one11;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;

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
    public String hello() {
        System.out.print("进入了 HelloController 自定义消息转换器，测试是否乱码");
        return "进入了 HelloController 自定义消息转换器，测试是否乱码";
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(HelloController.class);
        /**
         * banner.txt 可以替换banner , 这里可以设置关掉Banner显示..
         */
        application.setBannerMode(Mode.OFF);
        application.run(args);
    }

    /**
     * 自定义消息转化器
     * @return
     */
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("ISO-8859-1"));
        return converter;
    }

}
