package bsu.by.katomakhina.entity;

import bsu.by.katomakhina.enumFS.Subject;
import bsu.by.katomakhina.valid.MarkValid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.09.2017.
 */
public class Faculty {
    private int groupName;

    private List<Group> groups = new ArrayList<>();

    public Faculty(String next) {
        groups = new ArrayList<>();
    }

    public Faculty(int groupName) {
        this.groupName = groupName;
        groups = new ArrayList<>();
    }


    public double getAverageMark() {
        List<Double> marks = new ArrayList<>();

        for (Group group : groups) {
            marks.add(group.getAverageMark());
        }

        return MarkValid.getAverageMark(marks);
    }

    public double getAverageMark(Subject subject) {
        List<Double> marks = new ArrayList<>();

        for (Group group : groups) {
            marks.add(group.getAverageMark(subject));
        }

        return MarkValid.getAverageMark(marks);
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public int getGroupName() {
        return groupName;
    }

    public void setGroupName(int groupName) {
        this.groupName = groupName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}