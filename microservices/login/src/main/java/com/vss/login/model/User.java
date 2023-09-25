package com.vss.login.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class User {
    @Id
    @GeneratedValue(generator = "user_generator",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_sequence_generator",sequenceName = "user_seq",allocationSize = 1000)
    private int userId;

    @Column(nullable = false,unique = true)
    private String nationalId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private  String lastName;

    @Column(nullable = false)
    private char[] password;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false , unique = true)
    private int contactNumber;

    @Column(nullable = false)
    private Timestamp firstLoginStamp;

    @Column(nullable = false)
    private Timestamp lastLoginStamp;

    @ManyToOne
    @JoinColumn(name = "role_id",nullable = false)
    private Role roleId;

}
