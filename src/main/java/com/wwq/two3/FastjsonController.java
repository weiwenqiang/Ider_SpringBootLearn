package com.wwq.two3;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.xml.parsers.FactoryConfigurationError;
import java.util.Date;
import java.util.List;

/**
 * Created by wwq on 2017/12/4.
 */
//@RestController
//@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
public class FastjsonController extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        /**
         * 1，需要先定义一个转换消息的对象
         * 2.添加fastjson 的配置信息，比如，是否要格式化返回的json数据
         * 3.在converter中添加配置信息
         * 4.添加到converters中
         */
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        fastConverter.setFastJsonConfig(fastJsonConfig);
        converters.add(fastConverter);
    }

    @RequestMapping("/user")
    public UserFastjson hello(){
        UserFastjson user = new UserFastjson();
        user.setName("张无忌");
        user.setCreateTime(new Date());
        user.setAge(28);
        user.setRemarks("不返回备注");
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(FastjsonController.class, args);
    }
}
