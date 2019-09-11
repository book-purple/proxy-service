package com.proxyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * Written by Gaurav Sharma on 11 Sep 2019
 */
@SpringBootApplication
@ComponentScan({"com.proxyservice"})
public class ProxyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxyServiceApplication.class, args);
    }
}
