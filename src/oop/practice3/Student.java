package oop.practice3;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInformation() {
        System.out.println("Student name: " + this.name + "\nAge: " + this.age + "\n Grade: " + this.grade);
    }
}
