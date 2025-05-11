package oop.practice3;

public class Main {
    public static void main(String[] args) {
        Admin admin1 = new Admin("Daniel");
        admin1.adminInfo();
        Group group1 = new Group(1);
        Student daniel = new Student("Daniel", 38, 100.00);
        Student melina = new Student("Melina", 39, 100.00);
        daniel.displayInformation();
        daniel.addSubject("Math", "Prof. Portillo");
        daniel.addSubject("Phisics", "Prof. Henry");
        melina.addSubject("Farmacologia", "Dr. Zabala");
        melina.addSubject("Anatomia", "Dr. Rojas");
        daniel.displayInformation();
        melina.displayInformation();

    }
}
