package fundamentals;

import java.util.Scanner;


public class Main {
    public static void main (String[]args) {
        System.out.println("Hello world!");

        //Write an application that will read diameter of a circle (variable of type float) and
        //calculate perimeter of given circle.
        //Firstly, assume π = 3.14. Later, use value of π from built-in Math class.
        Scanner input = new Scanner(System.in);
        System.out.print("Insert diameter / Introduceti diametrul cercului: ");
        float diameter = input.nextFloat();
      //  float pi = 3.14f;
        float pi = (float) Math.PI;
        System.out.println("The perimeter: " + (diameter * pi));



    }
}
