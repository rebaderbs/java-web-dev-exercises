package exercises;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles did you drive? ");
        Double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas did you use? ");
        Double gallonsOfGas = input.nextDouble();

        Double mpg = milesDriven / gallonsOfGas;
        System.out.println("You drove " + milesDriven + " miles and used " + gallonsOfGas + " gallons of gas. Your miles-per-gallon is " + mpg);
    }
}
