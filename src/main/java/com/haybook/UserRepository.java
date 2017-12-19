package com.haybook;

/**
 * Created by Hayk.dadian on 12/19/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

import javax.persistence.PersistenceContexts;
import javax.transaction.Transactional;

import java.util.List;


@Repository

@Transactional

public class UserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    // ------------------------

    // PUBLIC METHODS

    // ------------------------


    /**
     * Save the user in the database.
     */

    public void create(User user) {
        entityManager.persist(user);
    }


    public void delete(User user) {

        if (entityManager.contains(user))

            entityManager.remove(user);

        else

            entityManager.remove(entityManager.merge(user));

        return;

    }
}