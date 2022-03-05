package com.sparta.action_test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;
}
