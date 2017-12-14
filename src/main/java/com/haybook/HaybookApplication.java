package com.haybook;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class HaybookApplication implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @PostConstruct
    void startup() {
        DbConnection dbConnectionImpl = (DbConnection) applicationContext.getBean("dbConnectionImpl");
        dbConnectionImpl.connect("adgh456122156");
        System.out.println("Starting");
        System.out.println(dbConnectionImpl);
        DbConnection dbConnectionImpl2 = (DbConnection) applicationContext.getBean("dbConnectionImpl");
        System.out.println(dbConnectionImpl2);

    }

    public static void main(String[] args) {
        SpringApplication.run(HaybookApplication.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
