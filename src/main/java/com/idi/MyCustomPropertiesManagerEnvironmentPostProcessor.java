package com.idi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author Evgeny Borisov
 */
public class MyCustomPropertiesManagerEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {

       /* AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);
        context.close();
        context.registerBean();
        environment.getPropertySources().ad*/
    }
}
