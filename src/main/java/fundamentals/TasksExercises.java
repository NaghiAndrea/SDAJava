package fundamentals;

import java.util.Scanner;

public class TasksExercises {
    static float pi = (float) Math.PI;
    int x = 10;
    static int y = 1;
    //Write an application that will read diameter of a circle (variable of type float) and
    //calculate perimeter of given circle.
    //Firstly, assume π = 3.14. Later, use value of π from built-in Math class.
    public static void circlePerimeter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Insert diameter / Introduceti diametrul cercului: ");
        float diameter = input.nextFloat();
        //  float pi = 3.14f;

        System.out.print("The perimeter: " + (diameter * pi));
    }
}
