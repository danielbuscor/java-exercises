package oop.practice3;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupId;
    private List<Student> students;
    private List<Subject> subjects;


    public Group(int groupId) {
        this.groupId = groupId;
        this.students = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

}
