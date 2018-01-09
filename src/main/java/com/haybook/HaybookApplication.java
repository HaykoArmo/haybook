package com.haybook;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.annotation.PostConstruct;

//aspecti hamara
@EnableAspectJAutoProxy
@SpringBootApplication
public class HaybookApplication implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(HaybookApplication.class, args);
    }

    @PostConstruct
    public void after() {

        User user = new User("email", "name");
        userRepository.create(user);
        User u = userRepository.getById(0);

        System.out.println(u);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public int sum(int a, int b) {
        return a+b;
    }
}
