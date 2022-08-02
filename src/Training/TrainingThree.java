package Training;

import java.util.Scanner;

public class TrainingThree {

    public static void main(String[] args) {

        // Porównywanie liczb z pobranych z konsoli

        /*
        Pobierz w konsoli dwie liczby całkowite, następnie porównaj je i wyświetl stosowny komunikat z wynikiem.


         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");

        int firstNumber = scanner.nextInt();

        System.out.println("Podaj drugą liczbę: ");

        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {

            System.out.println("This number are same");

        } else if (firstNumber < secondNumber) {

            System.out.println("First number is smaller than second number");

        } else {

            System.out.println("First number is bigger than second number");

        }


    }
}
