package Welcome;

import java.util.Scanner;

public class SayHello {

    public static void main(String[] args) {

        System.out.println("Write your name: ");
        String name = getString();
        System.out.println("Hello " + name);
    }
    public static String getString() {

        return new Scanner(System.in).next();
    }

}








