package Nikolay.OOP-Nikolay.lesson5.exercise1.service;

import Nikolay.OOP-Nikolay.lesson5.exercise1.model.Student;
import Nikolay.OOP-Nikolay.lesson5.exercise1.model.StudentGroup;
import Nikolay.OOP-Nikolay.lesson5.exercise1.model.Teacher;

import java.util.List;

public class StudentGroupService {
    private final StudentGroup studentGroup = new StudentGroup();
    private Integer maxGroupId = 0;
    public void createStudentGroup(Teacher teacher, List<Student> studentList){
        studentGroup.setGroupId(++maxGroupId);
        studentGroup.setTeacher(teacher);
        studentGroup.setStudentList(studentList);
    }
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}
