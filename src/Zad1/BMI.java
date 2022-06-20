package Zad1;

public class BMI {

    private final int height;
    private final float weight;

    public BMI(int height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    void calculateBMI() {
        float heightInMeters = height / 100.0f;
        double bmi = weight / Math.pow(heightInMeters, 2);

        if(bmi >= 18.5 && bmi <= 24.9) {
            System.out.printf("BMI is optimal - %f%n", bmi);
        } else {
            System.out.printf("BMI is not optimal - %f%n", bmi);
        }

    }



}
