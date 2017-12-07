package com.wwq.two13;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注意：
 * 1.在Thymeleaf 模板文件中，标签是需要闭合的，3.0之前是需要闭合的
 * 2. thymeleaf 3.0+ 是可以不强制要求闭合的。
 * 
 * 3. 支持同时使用多个模板引擎，比如：thymeleaf和freemarker 可以并存。
 * 
 * 
 * @author Angel -- 守护天使
 * @version v.0.1
 * @date 2016年12月24日
 */
@Controller
@RequestMapping("/templates")
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class TemplatesController {

	public static void main(String[] args) {
		SpringApplication.run(TemplatesController.class, args);
	}
	/**
	 * 映射地址是：/templates/hello
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(Map<String,Object> map){
		//返回的是ModelAndView对象;
//		ModelAndView mv = new ModelAndView("hello");
//		return mv;
		map.put("name","Andy");
		return "hello";
	}
	
	@RequestMapping("/helloFtl")
	public String helloFtl(Map<String,Object> map){
		map.put("name","Andy");
		return "helloFtl";
	}
	
}
