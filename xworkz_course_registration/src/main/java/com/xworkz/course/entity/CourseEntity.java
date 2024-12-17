package com.xworkz.course.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name="course_table")
@NamedQuery(name="getNameByEmailAndPassword" ,query="select rk.name from CourseEntity rk where rk.email =:byEmail and rk.password= :byPassword")
@NamedQuery(name="getAll" ,query="select rk from CourseEntity rk")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;
    @Column(name="email")
    private String email;
    @Column(name="phonenumber")
    private long phonenumber;

    @Column(name="password")
    private String password;
    @Column(name="conformpassword")
    private String conformpassword;

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public long phonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String password() {
        return password;
    }

    public String conformpassword() {
        return conformpassword;
    }

    public void setConformpassword(String conformpassword) {
        this.conformpassword = conformpassword;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
