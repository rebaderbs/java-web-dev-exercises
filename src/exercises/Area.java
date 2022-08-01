package exercises;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");
        Double length = input.nextDouble();

        System.out.println("Enter width of rectangle: ");
        Double width = input.nextDouble();

        Double area = length * width;
        System.out.println("The area of your rectangle is " + area);
    }
}
