package oop.practice3;

public class Student {
    private String name;
    private int age;
    private double grade;
    private int studentId;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentId = generateStudentId();
    }

    public int generateStudentId() {
        int studentID =  (int) (Math.random() * 1000);
        return studentID;
    }

    public void displayInformation() {
        System.out.println("Student name: " + this.name + "\nAge: " + this.age + "\n Grade: " + this.grade +
                "\nStudent Id: " + this.studentId);
    }
}
