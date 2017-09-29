package bsu.by.katomakhina.entity;

import bsu.by.katomakhina.enumFS.Subject;
import bsu.by.katomakhina.valid.MarkValid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.09.2017.
 */
public class University {
    private String name;

    private List<Faculty> faculties = new ArrayList<>();;

    public University() {
        faculties = new ArrayList<>();
    }

    public University(String name) {
        this.name = name;
        faculties = new ArrayList<>();
    }

    public double getAverageMark() {
        List<Double> marks = new ArrayList<>();

        for (Faculty faculty : faculties) {
            marks.add(faculty.getAverageMark());
        }

        return MarkValid.getAverageMark(marks);
    }

    public double getAverageMark(Subject subject) {
        List<Double> marks = new ArrayList<>();

        for (Faculty faculty : faculties) {
            marks.add(faculty.getAverageMark(subject));
        }

        return MarkValid.getAverageMark(marks);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }
}
