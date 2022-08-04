package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of your circle: ");
        int radius = input.nextInt();
//        double pi = 3.14;
        Double areaOfCircle = Circle.getArea((double) radius);
//        double areaOfCircle = pi * radius * radius;
//        System.out.println(areaOfCircle);
//        System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
        System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);

    }
}

//    Add a second Java file to your program to delegate the area calculation away from the printing task.

//
//        Create a method called getArea inside of Circle that takes a Double radius as its only parameter and returns another Double, the result of the area calculation.

//        Back in Area, replace your area calculation line with a call to Circle.getArea().
