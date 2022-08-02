package Training.TrainingFive;

public class Firma {

    //Utwórz klasę Pracownik i Firma

    /*
    Napisz klasę Pracownik, która przechowuje trzy pola:

Imię
Nazwisko
Wiek
Następnie utwórz klasę Firma, w której wykorzystasz klasę pracownik do utworzenia dwóch obiektów przechowujących dane pracowników (wymyśl sobie jakieś) i później wyświetlasz je na ekran.
     */

    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik();
        Pracownik pracownik2 = new Pracownik();

        pracownik1.name = "Darek";
        pracownik1.surname = "Sikorski";
        pracownik1.age = 30;


        pracownik2.name = "Alicja";
        pracownik2.surname = "Kowalska";
        pracownik2.age = 24;

        System.out.println("Pracownicy firmy to: ");

        System.out.println(pracownik1.name + " " + pracownik1.surname + " " + pracownik1.age + " lat");
        System.out.println(pracownik2.name + " " + pracownik2.surname + " " + pracownik2.age + " lata");


    }
}
