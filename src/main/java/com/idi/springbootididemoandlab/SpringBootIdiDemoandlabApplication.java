package com.idi.springbootididemoandlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringBootIdiDemoandlabApplication {

    public static void main(String[] args) {

//        SpringApplicationBuilder builder = new SpringApplicationBuilder();
//        builder.profiles().properties().build().run(SpringBootIdiDemoandlabApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootIdiDemoandlabApplication.class, args);
        System.out.println();
    }

}
