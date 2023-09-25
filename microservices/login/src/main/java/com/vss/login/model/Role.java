package com.vss.login.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(generator = "role_generator",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "role_sequence_generator" , sequenceName = "role_seq" , allocationSize = 25)
    private int roleId;

    @Column(unique = true,nullable = false)
    private String roleName;

    @Column(unique = true,nullable = false)
    private String roleValue;

    @OneToMany(mappedBy = "roleId")
    private Set<User> userSet;
}
