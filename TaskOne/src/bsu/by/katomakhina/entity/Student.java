package bsu.by.katomakhina.entity;

import bsu.by.katomakhina.enumFS.Subject;
import bsu.by.katomakhina.valid.MarkValid;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by user on 12.09.2017.
 */
public class Student {
    String name;
    String familyName;
    Map<Subject, ArrayList<Integer>> studentMarks = new HashMap<>();

    public Student() {
        for (Subject subject : Subject.values()) { //по всем enum-ам
            studentMarks.put(subject, new ArrayList<>());
        }
    }

    public boolean addMark(Subject subject, int mark) {
        if ((mark > 0 && mark <= 10) && studentMarks.containsKey(subject)) {
            studentMarks.get(subject).add(mark);
            return true;
        }
        return false;
    }

    public void addMark(Subject subject, ArrayList<Integer> marks) {
        marks.forEach((a) -> addMark(subject, a)); //весь список оценок из листа в студента
    }

    public static List<Integer> addMarks(int mark) {
        List<Integer> integerList = new ArrayList<Integer>() {{
            add(mark);
        }};
        return integerList;
    }

    public double getAverageMark(Subject subject) {
        if (studentMarks.containsKey(subject)) {
            List<Double> average = studentMarks.get(subject) //оценки именно по этому предмету
                    .stream() //переводит лист в поток
                    .mapToDouble(a -> a) //переводит инт в дабл
                    .boxed().collect(Collectors.toList());
            return MarkValid.getAverageMark(average);
            //из листа интов в лист даблов
        }

        return 0;
    }

    public double getAverageMark() {
        ArrayList<Double> marks = new ArrayList<>();
        for (Subject subject : Subject.values()) {
            marks.add(getAverageMark(subject));
        }

        return MarkValid.getAverageMark(marks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Map<Subject, ArrayList<Integer>> getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(Map<Subject, ArrayList<Integer>> studentMarks) {
        this.studentMarks = studentMarks;
    }


    public List getMarks(Subject subject) {
        return studentMarks.get(subject);
    }

    public Map<Subject, ArrayList<Integer>> getMarks() {
        return studentMarks;
    }

    public void setMarks(Map<Subject, ArrayList<Integer>> marks) {
        this.studentMarks = marks;
    }
}
