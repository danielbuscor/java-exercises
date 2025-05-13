package oop.practice3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private double grade;
    private int studentId;
    private List<Subject> subjects;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentId = generateStudentId();
        this.subjects = new ArrayList<>();
    }

    public int generateStudentId() {
        return (int) (Math.random() * 1000);
    }

    public void displayInformation() {
        System.out.println("*********************");
        System.out.println("Student name: " + this.name +
                "\nAge: " + this.age +
                "\nGrade: " + this.grade +
                "\nStudent Id: " + this.studentId);

        if(!subjects.isEmpty()){
            System.out.println("Subjects: ");
            for (Subject subject : subjects){
                System.out.println("- " + subject.getName() + "(Teacher: " + subject.getTeacher() + ")");
            }
        }
    }

    public void addSubject(String name, String teacher) {
        this.subjects.add(new Subject(name, teacher));
    }

    public List<Subject> getSubjects() {
        return new ArrayList<>(subjects);
    }

}
