package com.model;

import com.model.service.SchoolServiceImpl;
import com.model.service.Student;

public class SchoolServiceImpl2 extends SchoolServiceImpl {
    @Override
    public  void ShowStudent(Student student){
        System.out.println("Inside ShowStudent");
        System.out.println(student.getName()+" "+student.getAge()+" "+student.getId());
    }
}
