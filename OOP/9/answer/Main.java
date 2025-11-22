package com.java;

import com.model.service.Teacher;
import pack1.Student;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("emad");
        teacher.setId("567");
        //teacher.setActive(true);
        Student student = new Student();
        student.setName("Ahmed");
        student.setId("568");
       // student.setGrade(5);

        System.out.println(teacher.getId());

        System.out.println(student.getId());


    }
}
