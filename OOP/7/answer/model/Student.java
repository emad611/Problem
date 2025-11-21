package com.model.service;
import com.model.BaseEntity;
import com.model.Course;

import java.util.LinkedList;
import java.util.List;


public class Student extends BaseEntity {

   private List<Course>course=new LinkedList<>();

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }
}
