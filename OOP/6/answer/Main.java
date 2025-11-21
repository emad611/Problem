package com.model;


import com.model.service.Email;
import com.model.service.Student;

// relationship
public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("emad");
        student.setId("123");
         Email email1=new Email();
         email1.setEmail("emad12@gmail.com");
         email1.setId("1");
         email1.setNumber("01001830204");

        Email email2=new Email();
        email2.setEmail("emad13@gmail.com");
        email2.setId("2");
        email2.setNumber("01116883723");

        student.getEmails().add(email1);
        student.getEmails().add(email2);

        email1.setStudent(student);
        email2.setStudent(student);

        System.out.println(email1.getStudent().getName());
        System.out.println(email2.getStudent().getName());

        System.out.println(student.getEmails().get(0).getEmail());
        System.out.println(student.getEmails().get(1).getEmail());





    }
}
