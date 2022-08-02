package Training.TrainingFive;

public class Firma2 {

// Pracownik i Firma - Rozszerzenie o pętle

    /*
    Chodzi o to ze w danej tablicy nie musimy przechowywac tylko i wylacznie liczb czy stringow, nic nie stoi na przeszkodzie by w tablicy umiescic jeszcze inna tablice. Najpierw tworzymy klase Pracownik. Potem tablice ktora bedzie przechowywala obiekty typu pracownik. Pracownik[] pracownicy = new Pracownik[3]; Powyzsza linia mowi nam o tym ze bedziemy miec tablice w ktorej beda sie znajdowalay 3 obiekta typu pracownik. Innymi slowy bedziemy miec 3 pracownikow. Kazdy pracownik ma imie nazwisko i wiek. Skad to wiemy? Bo klasa pracownik sklada sie z 3 zmiennych: String imie; String nazwisko; int wiek; Kazde pole tej klasy bedzie u nas tablica, czyli bedziemy miec tablice z imionami, nazwiskami i liczba lat pracownikow. String[] imiona = {"Wlodek", "Staszek", "Lukasz"}; Powyzszy kod twiorzy nam tablice 3 elementowa z imionami pracownikow. Tak samo jest dla pozostalych pol klasy Pracownik. Natomiast jesli chodzi o zapis pracownicy[i] = new Pracownik(); to jest to nic innego jak poinformowanie program o tym ze tworzymy nowy obiekt w odpowiedniej komórce tablicy pracownicy. Musimy utowrzyc nowy obiekt bo bez tego nie bedzemy mogli sie odwolywac do tej tablicy. Czyli program wie ze teraz w komorce tablicy o zadanym indeksie bedzie wpisywal dane. Jakie dane? No takie jakie znajduja sie w tablicach poszczegolnych pol klas: pracownicy[i].imie = imiona[i]; pracownicy[i].nazwisko = nazwiska[i]; pracownicy[i].wiek = wiek[i]; Program(a dokladniej kompilator) teraz wie iz ma w komorce tablicy o indeksie i wpisac imie pochodzace z tablicy imiona o indeksie i oraz nazwisko pochodzace z tablicy nazwiska o indeksie i oraz wiek pochodzacy z tablicy wiek o indeksie i.
     */
    public static void main(String[] args) {
        Pracownik[] pracownicy = new Pracownik[3];

        String[] imiona = {"Wlodek", "Staszek", "Lukasz"};
        String[] nazwiska = {"Zieba", "Kowalski", "Zietek"};
        int[] wiek = {45, 34, 56};

        for(int i=0; i< pracownicy.length; i++){
            pracownicy[i] = new Pracownik();
            pracownicy[i].name = imiona[i];
            pracownicy[i].surname = nazwiska[i];
            pracownicy[i].age = wiek[i];
        }

        System.out.println("Pracownicy firmy to:");
        for(int i=0; i< pracownicy.length; i++)
            System.out.println(pracownicy[i].name+" "+pracownicy[i].surname+", "+pracownicy[i].age+" lat");
    }
}
