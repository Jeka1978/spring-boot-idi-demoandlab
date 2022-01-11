package com.idi.springbootididemoandlab;

import com.idi.MyGoogleGuiceRegistrar;
import com.idi.springbootididemoandlab.dao.CustomerDao;
import com.idi.springbootididemoandlab.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

@SpringBootApplication
@EntityScan(basePackages = "com.idi.model")
public class SpringBootIdiDemoandlabApplication {


    public static void main(String[] args) {

        List<String> configurationNames = SpringFactoriesLoader
                .loadFactoryNames(EnableAutoConfiguration.class, ClassLoader.getSystemClassLoader());


//        SpringApplicationBuilder builder = new SpringApplicationBuilder();
//        builder.profiles().properties().build().run(SpringBootIdiDemoandlabApplication.class, args);
        List<String> envPPs = SpringFactoriesLoader.loadFactoryNames(EnvironmentPostProcessor.class,ClassLoader.getSystemClassLoader());

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootIdiDemoandlabApplication.class, args);
        System.out.println();

        context.getBean(CustomerDao.class).save(Customer.builder().age(50).name("Moshe").build());
        System.out.println();
    }

}
