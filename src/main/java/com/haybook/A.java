package com.haybook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Hayk.dadian on 12/12/2017.
 */
@Component
public class A {
    @Autowired
    private UserService userService;

    public void m() {
        System.out.println(userService.get(1));
    }
}
