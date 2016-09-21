package com.mrvnflx.spring.zuul.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mrvnf on 9/20/2016.
 */
@Controller
public class SpringZuulController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(HttpServletRequest httpServletRequest) {
        if (StringUtils.isNotEmpty(httpServletRequest.getHeader("name"))) {
            return "helloGreeting";
        } else {
            return "justHello";
        }
    }

    @RequestMapping(value = "/helloGreeting", method = RequestMethod.GET)
    @ResponseBody public String helloGreeting(HttpServletRequest httpServletRequest) {
        return "Hello, " + httpServletRequest.getHeader("name") + "!";
    }
}
