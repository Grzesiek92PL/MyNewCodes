package GetterAndSetter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Uzywskiwanie danych za pomocą skanera

        System.out.println("What is your dog name: ");
        String nameDog = scanner.nextLine();
        System.out.println("What is your dog age: ");
        int ageDog = scanner.nextInt();
        System.out.println("What is your dog weight: ");
        float weightDog = scanner.nextFloat();

        System.out.println("Your dog is " + nameDog + " and he is " + ageDog + " years old. His weight is : " + weightDog);
        System.out.printf("Your dog is %s and he is %d years old. His Weight is: %f %n", nameDog, ageDog, weightDog);

// Przypisana klasa "Dog" pobieranie prywatnych danych z klasy "Dog" za pomocą getterów i wyswietlanie za pomocą setterów.

        Dog dog = new Dog("Korek", 1, 12.5f);

        // gettery i settery użycie
        String name = dog.getName();
        int age = dog.getAge();
        float weight = dog.getWeight();

        System.out.println("Dog name: " + name);
        dog.setName("Koreczek");
        System.out.println("New dog name: " + dog.getName());

        System.out.println("Dog age: " + age);
        dog.setAge(2);
        System.out.println("Now his age is: " + dog.getAge());

        System.out.println("Dog weight " + weight);
        dog.setWeight(13);
        System.out.println("Now his weight is: " + dog.getWeight());


    }


}

