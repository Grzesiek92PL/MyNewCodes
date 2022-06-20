package Zad1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is you height: ");
        int height = scanner.nextInt();
        System.out.println("What is your weight: ");
        float weight = scanner.nextFloat();

        BMI Bmi = new BMI(height , weight);

        Bmi.calculateBMI();




    }


}
