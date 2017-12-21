package com.haybook;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Hayk.dadian on 12/21/2017.
 */
@Transactional
@Repository
public class UserRepositoryimpl implements UserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(User user) {
        if (entityManager.contains(user))

            entityManager.remove(user);

        else

            entityManager.remove(entityManager.merge(user));


    }

    @Override
    public void update(User user) {
        entityManager.merge(user);

        return;
    }

    @Override
    public User getById(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public User getByEmail(String email) {
        return null;
    }
}
