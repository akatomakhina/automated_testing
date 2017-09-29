package bsu.by.katomakhina;

import bsu.by.katomakhina.entity.Faculty;
import bsu.by.katomakhina.entity.Group;
import bsu.by.katomakhina.entity.Student;
import bsu.by.katomakhina.enumFS.Subject;
import bsu.by.katomakhina.exception.BadStudentException;
import bsu.by.katomakhina.read.StudentReader;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 13.09.2017.
 */
public class Main {
    public static void main(String[] args) throws BadStudentException, IOException {
        Student student = new Student();
        List<Student> studentList = new ArrayList<Student>();
        List<Integer> integerList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        Faculty faculty;
        Subject subject;
        Group group;
        String tmp;

        System.out.print("Enter a faculty: ");
        faculty =  new Faculty(scanner.next());

        System.out.print("Enter group of students: ");
        group = new Group(scanner.nextInt());

        System.out.print("Enter a subject: ");
        tmp = scanner.next();
        subject = Subject.valueOf(tmp.toUpperCase());

        System.out.print("Enter amount of students: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            student = StudentReader.ReadFromConsole(System.in);

            System.out.print("Enter amount marks: ");
            int k = scanner.nextInt();
            System.out.print("Enter a marks: ");
            for (int j = 0; j < k; j++) {
                integerList = Student.addMarks(scanner.nextInt());
            }
            studentList.add(student);
            System.out.print(student + " marks and subject is: ");
            System.out.print(subject + " ");
            student.addMark(subject, (ArrayList<Integer>) integerList);
            System.out.println(student.getAverageMark());
            group.addStudent(student);
        }
        System.out.println(group.getAverageMark(subject));
        faculty.addGroup(group);
        System.out.println(group.getAverageMark(subject));
    }
}
