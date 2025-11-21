package com.model;

import com.model.service.SchoolServiceImpl;
import com.model.service.Student;

public class SchoolServiceImpl1 extends SchoolServiceImpl {
    @Override
    public Student AddStudent(Student student){
        System.out.println("Add Student");
        return student;
    }
}
