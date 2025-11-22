package com.java;
public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("emad");
        teacher.setSalary(1400);

         try{
             for(int i = 1; i <= 6; i++){
                 Student student = new Student();
                 student.setId(i);
                 student.setName("student " + i);
                 student.setGrade("G "+i);
                 teacher.addStudent(student);
                 System.out.println("Added student: " + student.getName());
             }
         }catch(Exception e){
             System.out.println(e.getMessage());
             
         }

        System.out.println("many of student: "+teacher.getStudentCount());


    }
}
