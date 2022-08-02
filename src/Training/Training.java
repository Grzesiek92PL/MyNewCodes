package Training;


import java.io.Console;

public class Training {

    public static void main(String[] args) {


        // Definiowanie zmiennych

        /*
Napisz program, w którym zadeklarujesz kilka zmiennych finalnych, lub zmiennych różnych typów o dowolnych nazwach, a następnie wyświetlisz je w kolejnych wierszach.
W tym samym programie zadeklaruj cztery zmienne typu String. Trzy z nich zainicjuj jakimiś wyrazami, a czwartemu przypisz ciąg znaków utworzony z połączenia trzech wcześniejszych zmiennych. Następnie wyświetl czwartą zmienną na ekranie.
Przy użyciu metody substring wyświetl na ekranie dwa pierwsze wyrazy wykorzystując odwołując się wyłącznie do czwartej zmiennej typu String.
         */

        int a = 5;
        double b = 5.6;
        final char c = 'G';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String name = "Ala";
        String have = "ma";
        String animal = "kota";
        String zadanie = name + " " + have + " " + animal;
        System.out.println(zadanie);
        System.out.println(zadanie.substring(0, 7));


        String[] info = {"Name: Grzegorz ", "Surname: Kołudzki ", "Age: 30 ", "Gender: M "};

    }
}
