package basics;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) ((Math.random() * 100) + 1);
        int userAttempts = 3;
        System.out.println("Please enter a number between 1 - 100");
        int userNum = scanner.nextInt();
        while (userNum != randomNum && userAttempts > 0){
            if (userNum > randomNum){
                userAttempts--;
                System.out.println("Too high! " + userAttempts + " attempts remaining");
                userNum = scanner.nextInt();
            } else if (userNum < randomNum) {
                userAttempts--;
                System.out.println("Too low! " + userAttempts + " attempts remaining.");
                userNum = scanner.nextInt();
            }
        }
        if (userNum == randomNum) {
            System.out.println("Congratulations! You guessed the number!");
        } else {
            System.out.println("Game over! The number was " + randomNum);
        }

    }
}
