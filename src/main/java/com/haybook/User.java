package com.haybook;

import javax.persistence.*;

/**
 * Created by Hayk.dadian on 12/19/2017.
 */
@Table(name = "Users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public User(String email, String username) {
        this.username = username;
        this.email = email;
    }

    @Column
    private String username;
    @Column
    private String email;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
