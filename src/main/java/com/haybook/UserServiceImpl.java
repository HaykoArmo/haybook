package com.haybook;

import org.springframework.stereotype.Component;

/**
 * Created by Hayk.dadian on 12/12/2017.
 */
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User get(int id) {
        return new User(id);
    }
}
