package basics;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userOption = 0;
        double celsius = 0;
        double fahrenheit = 0;
        System.out.println("Please select an option: \n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");
        userOption = scanner.nextInt();
        if (userOption == 1){
            System.out.println("Please enter the Celsius degrees you want to convert");
            celsius = scanner.nextDouble();
            double celsiusToFahrenheit = ((celsius * 9) / 5) + 32;
            System.out.println(celsius + " Celsius degrees are " + celsiusToFahrenheit + " Fahrenheit degrees");
        }else if (userOption == 2){
            System.out.println("Please enter the Fahrenheit degrees you want to convert");
            fahrenheit = scanner.nextDouble();
            double fahrenheitToCelsius = ((fahrenheit - 32) * 5) / 9;
            System.out.println(fahrenheit + " Fahrenheit degrees are " + fahrenheitToCelsius + " Celsius degrees");
        }else {
            System.out.println("Invalid option");
        }
        scanner.close();
    }
}
