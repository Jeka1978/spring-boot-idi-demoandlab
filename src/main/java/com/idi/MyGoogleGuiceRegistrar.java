package com.idi;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.logging.Handler;

/**
 * @author Evgeny Borisov
 */
public class MyGoogleGuiceRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
     /*   for () {
            Class classMarkedWithSingleton= Handler.class;
            GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
            beanDefinition.setBeanClassName(classMarkedWithSingleton.getName());
            String beanName = importBeanNameGenerator.generateBeanName(beanDefinition, registry);
            registry.registerBeanDefinition(beanName,beanDefinition);
        }*/
    }
}
