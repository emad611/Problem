package com.model;

import com.model.service.Student;
//هنا عملنا interface يعنى مينفعش اعمل اوبجكت منى
public interface BaseSchoolService {

    Student AddStudent(Student student);//هنا علشان اضيف طالب لازم اعدل البيانات ومادام انى راح اعدل يبقى لازم احط بيناته من خلال الباراميتر
     void ShowStudent(Student student);//هنا فقط لطبع بيانات الطالب

}
