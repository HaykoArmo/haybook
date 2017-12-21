package com.haybook;

/**
 * Created by Hayk.dadian on 12/21/2017.
 */
public interface UserRepository {
    void create(User user);

    void delete(User user);

    void update(User user);

    User getById(long id);

    User getByEmail(String email);
}
