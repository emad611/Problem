package pack1;

import com.model.service.Teacher;

public class MainStudent {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("emad");
        teacher.setId("2");

        Student student = new Student();
        student.setName("emad");
        student.setId("123");
        student.setGrade(5);
    }
}
