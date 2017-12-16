package com.haybook;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * Created by Hayk.dadian on 12/14/2017.
 */
@Component
public class DbConnectionImpl implements DbConnection {
    @PreDestroy
    public void print(){
        System.out.println("sdgadfyry");
    }
    @Override
    public void connect(String Url) {
        System.out.println("connect");
    }

}
