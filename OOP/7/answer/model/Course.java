package com.model;

import com.model.service.Student;

import java.util.LinkedList;
import java.util.List;

public class Course extends BaseEntity{

    private List<Student> student=new LinkedList<>();

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
