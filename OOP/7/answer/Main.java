package com.model;


import com.model.service.Student;

//  Aggregation relationship
public class Main {
    public static void main(String[] args) {
Student student1 = new Student();
student1.setId("12");
student1.setName("emad");

Student student2 = new Student();
student2.setId("13");
student2.setName("magdey");

Course course1 = new Course();
course1.setId("1");
course1.setName("java");

Course course2 = new Course();
course2.setId("2");
course2.setName("python");

student1.getCourse().add(course1);//يضيف course1 للطالب student1
student1.getCourse().add(course2);//يضيف course2 للطالب student1
 student2.getCourse().add(course2);


course1.getStudent().add(student1);//يعني الطالب 1 أصبح مسجل في course1.
course1.getStudent().add(student2);//ضيف الطالب student2 داخل الكورس course1

        System.out.println(student2.getCourse().size());
        System.out.println(student1.getCourse().size());
        System.out.println(course1.getStudent().size());
        System.out.println(course2.getStudent().size());



    }
}
