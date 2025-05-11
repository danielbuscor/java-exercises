package oop.practice3;

public class Admin {
    String name;
    int adminId;

    public Admin(String name) {
        this.name = name;
        this.adminId = adminIdGenerator();
    }

    public int adminIdGenerator() {
        return (int) (Math.random() * 1000);
    }

    public void adminInfo() {
        System.out.println("Admin name: " + name + "\nAdmin Id: " + adminId);
    }
}
