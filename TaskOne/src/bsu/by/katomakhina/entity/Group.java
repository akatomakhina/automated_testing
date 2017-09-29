package bsu.by.katomakhina.entity;

import bsu.by.katomakhina.enumFS.Subject;
import bsu.by.katomakhina.valid.MarkValid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.09.2017.
 */
public class Group {
    private int groupName;

    private List<Student> studentList = new ArrayList<>();

    public Group(int groupName) {
        this.groupName = groupName;
        studentList = new ArrayList<>();
    }

    public Group() {
        studentList = new ArrayList<Student>();
    }

    public double getAverageMark() {
        ArrayList<Double> marks = new ArrayList<>();

        for (Student student : studentList) {
            marks.add(student.getAverageMark());
        }

        return MarkValid.getAverageMark(marks);
    }

    public double getAverageMark(Subject subject) {
        ArrayList<Double> marks = new ArrayList<>();

        for (Student student : studentList) {
            marks.add(student.getAverageMark(subject));
        }

        return MarkValid.getAverageMark(marks);
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public int getGroupName() {
        return groupName;
    }

    public void setGroupName(int groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
