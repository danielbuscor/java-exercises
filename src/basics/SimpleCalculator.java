package basics;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter first number:");
            double firstNumber = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter operator:");
            String operator = scanner.nextLine();
            System.out.println("Enter second number:");
            double secondNumber = scanner.nextDouble();
            double result = 0;
            switch (operator){
                case "+":
                    result = (firstNumber + secondNumber);
                    break;
                case "-":
                    result = (firstNumber - secondNumber);
                    break;
                case "*":
                    result = (firstNumber * secondNumber);
                    break;
                case "/":
                    if (secondNumber != 0){
                        result = (firstNumber / secondNumber);
                    }else {
                        System.out.println("Cannot divide by 0");
                    }
            }
            System.out.println("Result: " + result);
        }
    }
}
