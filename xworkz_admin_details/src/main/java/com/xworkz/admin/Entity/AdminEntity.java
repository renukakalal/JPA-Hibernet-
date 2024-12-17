package com.xworkz.admin.Entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "admin_table")
public class AdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="conformpassword")
    private String conformpassword;
    @Column(name="phonenumber")
    private long phonenumber;


}
