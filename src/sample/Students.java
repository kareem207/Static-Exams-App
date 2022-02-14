package sample;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private final List<Student> studentList;

    public Students() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student getStudent(String username, String password) {
        for (Student student: studentList) {
            if(student.getUserName().equals(username) && student.getPassword().equals(password)) {
                return student;
            }
        }
        return null;
    }

}
