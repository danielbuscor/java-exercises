package basics;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter operator:");
            String operator = scanner.nextLine();
            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();
            double result = 0;
            switch (operator){
                case "+":
                    result = (num1 + num2);
                    break;
                case "-":
                    result = (num1 - num2);
                    break;
                case "*":
                    result = (num1 * num2);
                    break;
                case "/":
                    if (num2 != 0){
                        result = (num1 / num2);
                    }else {
                        System.out.println("Cannot divide by 0");
                    }
            }
            System.out.println("Result: " + result);
        }
    }
}
