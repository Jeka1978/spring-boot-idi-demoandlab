package com.idi.springbootididemoandlab;

import com.idi.MyGoogleGuiceRegistrar;
import com.idi.springbootididemoandlab.dao.CustomerDao;
import com.idi.springbootididemoandlab.model.Customer;
import com.zaxxer.hikari.HikariDataSource;
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
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.TransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.List;

@SpringBootApplication
//@EntityScan  don't put in case you need to scan the root
//@EnableJpaRepositories(basePackages = )
public class SpringBootIdiDemoandlabApplication {


//    @Bean
//    TransactionManager
    /*
    @Bean
    public DataSource dataSource(){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setPassword();
        dataSource.setUsername();
        dataSource.setJdbcUrl();
        dataSource.setDriverClassName(DybaseDriver.class);
    }

    @Bean
    public EntityManagerFactory entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setPackagesToScan("com.idi.model");
        factoryBean.setDataSource();
    }
*/

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
