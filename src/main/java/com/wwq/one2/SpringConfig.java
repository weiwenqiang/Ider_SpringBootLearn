package com.wwq.one2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wwq on 2017/12/1.
 */

/**
 * 通过该注解来表明该类是一个Spring的配置，相当于一个xml
 */
@Configuration
/**
 * 配置扫描包
 */
@ComponentScan(basePackages = "com.wwq.one2")
public class SpringConfig {

    /**
     * 通过该注解来表明是一个Bean对象，相当于xml的<bean>
     */
    @Bean
    public UserDao getUserDao(){
        return new UserDao();//直接new做演示
    }
}
