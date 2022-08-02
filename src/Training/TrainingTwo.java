package Training;

public class TrainingTwo {

    public static void main(String[] args) {

        //Operatory arytmetyczno logiczne


        double a = 5.5;
        double b = 6.2;
        double c = 4.3;
        double z = (a + b) * c;
        double y = (a - b) / c;

        System.out.println(z + 1);
        System.out.println(y + 1);
        System.out.printf("(%.2f + %.2f)*%.2f = %.2f" , a,b,c, ((a+b)*c)); // %.2f - Zapis %.2f oznacza liczbę zmiennoprzecinkową, zaokrągloną do dwóch miejsc po przecinku.

        boolean d = (a + b) > c;
        boolean e = a == b;

        System.out.println(d);
        System.out.println(e);
    }
}
