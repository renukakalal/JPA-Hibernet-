package com.xworkz.course.service;

import com.xworkz.course.dto.CourseDTO;
import com.xworkz.course.entity.CourseEntity;

import java.util.List;

public interface CourseService {

     boolean save(CourseDTO courseDTO);
     String getNameByEmailAndPassword(String email,String password);
     boolean validPassword(CourseDTO courseDTO);
     List<CourseEntity>  getAll(String name);


}
