package basics;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) ((Math.random() * 100) + 1);
        int userAttempts = 0;
        System.out.println("Please enter a number between 1 - 100");
        int userNum = scanner.nextInt();
        if(userNum > 0 && userNum <= 100 ){
            if (userNum == randomNum){
                System.out.println("Congratulations you guessed the number!");
            } else if (userNum > randomNum && userAttempts < 10) {
                System.out.println("Too high!");
                userAttempts++;
                System.out.println("Try again!");
            } else if (userNum < randomNum && userAttempts < 10) {
                System.out.println("Too low!");
                userAttempts++;
                System.out.println("Try again!");
            }else {
                System.out.println("You loose!");
            }
        }else {
            System.out.println("The number must be one between 1 and 100!");
        }

    }
}
