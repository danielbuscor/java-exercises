package oop.practice3;

public class Main {
    public static void main(String[] args) {
        Student daniel = new Student("Daniel", 38, 100.00);
        Student melina = new Student("Melina", 39, 100.00);

        daniel.addSubject("Math", "Prof. Portillo");
        daniel.addSubject("Phisics", "Prof. Henry");
        melina.addSubject("Farmacologia", "Dr. Zabala");
        melina.addSubject("Anatomia", "Dr. Rojas");
        daniel.displayInformation();
        melina.displayInformation();

    }
}
