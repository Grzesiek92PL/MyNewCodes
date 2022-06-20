package Zad2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Choose sign: ");
        char sign = scanner.next().charAt(0);
        System.out.println("Second number: ");
        float secondNumber = scanner.nextFloat();

        Calculator calculator = new Calculator(firstNumber, sign, secondNumber);

        System.out.println("Result: " + calculator.calculate());
    }
}

