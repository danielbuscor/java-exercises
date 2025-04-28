package basics;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userInpt = userInput.nextLine();
        System.out.println("Hello, " + userInpt + "! Today is " + LocalDate.now());
    }
}
