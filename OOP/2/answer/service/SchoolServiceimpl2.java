package com.model;

import com.model.service.SchoolServiceImpl;
import com.model.service.Student;

public class SchoolServiceImpl2 extends SchoolServiceImpl {
//هنا عملنا ميثود واحده بس override لانها imp method ف عادى وفى نفس الوقت طبقنا الشروط
    @Override
    public  void ShowStudent(Student student){
        System.out.println("Inside ShowStudent");
        System.out.println(student.getName()+" "+student.getAge()+" "+student.getId());
    }
}
