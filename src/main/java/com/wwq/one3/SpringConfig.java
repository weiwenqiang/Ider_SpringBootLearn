package com.wwq.one3;

import com.wwq.one2.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

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

@PropertySource(value = {""},ignoreResourceNotFound = true)
public class SpringConfig {

    /**
     * 通过该注解来表明是一个Bean对象，相当于xml的<bean>
     */
    @Bean
    public UserDao getUserDao(){
        return new UserDao();//直接new做演示
    }

    @Value("${jdbc.driverClassName}")
    private String driverClassName;

//    @Bean(destroyMethod = "close")
//    public BoneCPDataSource boneCPDataSource{
//        BoneCPDataSource boneCPDataSource = new BoneCPDataSource();
//        boneCPDataSource.setDriverClass(driverClassName);
//        return boneCPDataSource;
//    }
}
