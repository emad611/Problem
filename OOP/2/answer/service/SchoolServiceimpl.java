package com.model.service;

import com.model.BaseSchoolService;
// احنا هنا عملنا abstract class علشان نقدر نستخدم الميثود الى imp,noimpl ولانك وارث من interface ف اشطا عادى
public abstract class SchoolServiceImpl implements BaseSchoolService {
   // هنا هنضيف الطالب ونرجعه عادى
    @Override
    public  Student AddStudent(Student student){
        return student;
    }
    // هنا هنطبع بيانات الطالب
    @Override
    public  void ShowStudent(Student student){
        System.out.println(student.getName()+" "+student.getAge()+" "+student.getId());
    }
}
