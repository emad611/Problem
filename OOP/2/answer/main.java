package com.model;


import com.model.service.SchoolServiceImpl;
import com.model.service.Student;

public class Main {
    public static void main(String[] args) {
       Student student=new Student();
       student.setName("Emad");
        student.setAge(23);
        student.setId("123");
        SchoolServiceImpl baseSchoolService1=new SchoolServiceImpl1();
        System.out.println(baseSchoolService1.AddStudent(student).getName());
        baseSchoolService1.ShowStudent(student);
        System.out.println("--------------");
        SchoolServiceImpl baseSchoolService2=new SchoolServiceImpl2();
        System.out.println(baseSchoolService2.AddStudent(student).getName());
        baseSchoolService2.ShowStudent(student);
    }
}
