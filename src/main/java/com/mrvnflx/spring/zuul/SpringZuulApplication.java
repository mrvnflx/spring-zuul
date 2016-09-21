package com.mrvnflx.spring.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by mrvnf on 9/20/2016.
 */

@SpringBootApplication
@EnableZuulProxy
@ComponentScan
public class SpringZuulApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringZuulApplication.class, args);
    }
}
