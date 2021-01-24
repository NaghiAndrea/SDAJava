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

    //Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
    // Your application should read two variables: weight (in kilograms, type float) and height
    // (in centimeters, type int). BMI should be calculated given following formula: weight/height(m)^2
    // The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal values.
    // Your program should write "BMI optimal" or "BMI not optimal", according to the assumptions above.

    public static void bmiCalculator() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti inaltimea (cm): ");
        int height = input.nextInt();

        System.out.print("Introduceti greutatea (kg): ");
        float weight = input.nextFloat();

        float bmi = weight / ((float) height * (float) height / 10000);
        System.out.println("BMI = " + bmi);
        if ((bmi >= 18.5) && (bmi <= 24.9)) {
            System.out.println("BMI optimal");
        } else
            System.out.println("BMI not optimal");
    }
    //   float bmi = weight / ((float)hight/100)

}



