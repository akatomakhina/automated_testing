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

        System.out.print("Enter a familyName: ");
        familyName = scanner.next();

        System.out.print("Enter a name: ");
        name = scanner.next();

        return student;
    }
}
