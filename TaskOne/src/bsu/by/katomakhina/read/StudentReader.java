package bsu.by.katomakhina.read;

import bsu.by.katomakhina.entity.Student;
import bsu.by.katomakhina.enumFS.Subject;
import bsu.by.katomakhina.exception.BadStudentException;

import java.io.InputStream;
import java.util.*;

/**
 * Created by user on 13.09.2017.
 */
public class StudentReader {
    public static Student ReadFromConsole(InputStream is) throws IllegalArgumentException, BadStudentException {
        Scanner scanner = new Scanner(is);

        Student student = new Student();
        String familyName;
        String name;
        /*Subject subject;*/
        /*String tmp;*/

        /*List<Integer> integerList = new ArrayList<Integer>();*/

        System.out.print("Enter a familyName: ");
        familyName = scanner.next();

        System.out.print("Enter a name: ");
        name = scanner.next();

        /*System.out.print("Enter a subject: ");
        tmp = scanner.next();
        subject = Subject.valueOf(tmp.toUpperCase());

        System.out.print("Enter amount marks: ");
        int n = scanner.nextInt();
        System.out.print("Enter a marks: ");
        for (int i = 0; i < n; i++) {
            integerList = Student.addMarks(scanner.nextInt());
        }

        System.out.print(name + " " + familyName + " marks and subject is: ");
        System.out.print(subject + " ");
        student.addMark(subject, (ArrayList<Integer>) integerList);
        System.out.println(student.getAverageMark());*/

        return student;
    }
}
