package com.xworkz.course.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CourseDTO {

    private int id;
    private String name;
    private int age;
    private String email;
    private long phonenumber;
    private String password;
    private String conformpassword;



}
