package com.springboot.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class GlobalException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                         Object handler, Exception e) {
        ModelAndView mv =new ModelAndView();
        if(e instanceof NullPointerException) {
            mv.setViewName("error5");
        }
        if(e instanceof ArithmeticException) {
            mv.setViewName("error6");
        }
        mv.addObject("error",e.toString());
        return mv;
    }
}
