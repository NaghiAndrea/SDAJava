package fundamentals;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
/*     Varianta 1:
        //Write an application that will read diameter of a circle (variable of type float) and
        //calculate perimeter of given circle.
        //Firstly, assume π = 3.14. Later, use value of π from built-in Math class.
        Scanner input = new Scanner(System.in);
        System.out.print("Insert diameter / Introduceti diametrul cercului: ");
        float diameter = input.nextFloat();
      //  float pi = 3.14f;
        float pi = (float) Math.PI;
        System.out.println("The perimeter: " + (diameter * pi));


         TasksExercises tasksExercises1 = new TasksExercises();
         TasksExercises tasksExercises2 = new TasksExercises();
        System.out.println(("x = " + tasksExercises1.x));
        System.out.println(("y = " + tasksExercises1.y));
        System.out.println(("y = " + tasksExercises2.y));
        tasksExercises1.x = 22;
        TasksExercises.y = 3;
        System.out.println(("x1 = " + tasksExercises1.x));
        System.out.println(("x2 = " + tasksExercises2.x));
        System.out.println(("y1 = " + tasksExercises1.y));
        System.out.println(("y2 = " + tasksExercises2.y));

        //      tasksExercises.circlePerimeter();

      //  TasksExercises.circlePerimeter(); //se poate face asa pt ca este static
      */

TasksExercises.bmiCalculator();
    }
}
