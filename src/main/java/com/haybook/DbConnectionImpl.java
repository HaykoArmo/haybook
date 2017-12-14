package com.haybook;

import org.springframework.stereotype.Component;

/**
 * Created by Hayk.dadian on 12/14/2017.
 */
@Component
public class DbConnectionImpl implements DbConnection {

    @Override
    public void connect(String Url) {
        System.out.println("connect");
    }

}
