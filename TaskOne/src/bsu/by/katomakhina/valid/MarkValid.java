package bsu.by.katomakhina.valid;

import bsu.by.katomakhina.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.09.2017.
 */
public class MarkValid {
    public static double getAverageMark(List<Double> marks) {
        double sum = 0;
        for (Double mark : marks) {
            sum += mark;
        }
        return marks.isEmpty() ? 0 : 1.0 * sum / marks.size();
    }
}

