package com.wwq.two10;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wwq on 2017/12/5.
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String defaultExceptionHandler(HttpServletRequest req, Exception e){
        //是返回的String.

        //ModelAndView -- 介绍 模板引擎...?
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName(viewName);

        return "全局捕获异常，对不起，服务器繁忙，请稍后再试！";
    }
}
