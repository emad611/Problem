package com.java;

public class Teacher extends BaseEntity {
    private double salary;
    private Student[] students = new Student[5];//عملنا مصفوفة من الطلاب تضم عددمن الطلاب
    private int studentCount = 0;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
//  Exceptionعلشان نتحقق وبالمره نتقن نوع اخر   هنا عملنا الشرط وعملنا
    public boolean addStudent(Student s) throws Exception {
        // checked Exception must try,catch
        if(studentCount>5){
            if (studentCount >= 5) {
               // trow to Exception
                throw new Exception("can not add more than 5 students");

            }
        }
        students[studentCount]=s;//s[0]=الطالب الاول s[1]=معلوومات الطالب الثانى
        studentCount++;// هنا زودنا العداد
        return true;

    }
}
