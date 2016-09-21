package com.mrvnflx.spring.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by mrvnf on 9/20/2016.
 */

@SpringBootApplication
@EnableZuulProxy
public class SpringZuulApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringZuulApplication.class, args);
    }
}
