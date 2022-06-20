package Zad2;

public class Calculator {

    private final float firstNumber;
    private final char sign;
    private final float secondNumber;

    public Calculator(float firstNumber, char sign, float secondNumber) {
        this.firstNumber = firstNumber;
        this.sign = sign;
        this.secondNumber = secondNumber;
    }

    public float calculate() {

        switch (sign) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("You can't divide by 0, try again");
                    return 0;
                }
                return firstNumber / secondNumber;
            default:
                System.out.println("Wrong sing");
                return 0;
        }
    }


}





