package fundamentals.arraysStrings.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int[] myArray = {2, 3, 5 , 7, -7, 5 , 8 , -5};
        ArrayExercises.maxProductOfTwoInt(myArray);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        String[] myStrArray = text.split(" ");
        ArrayExercises.specificValInStringArray(myStrArray);
*/
        String[] myStringArray =  {"casa" , "masa" , "calculator", "casa"};
     //   ArrayExercises.specificValInStringArray(myStringArray);

        System.out.print("Enter the element you want to remove: ");
        String toRemove = scanner.next();

        String[] newStringArray;
        if (Arrays.asList(myStringArray).contains(toRemove)){
            newStringArray = ArrayExercises.removeElement(myStringArray,toRemove);
            System.out.print("New array: ");
            for (int i = 0; i < newStringArray.length; i++) {
                System.out.print(newStringArray[i] + " ");
            }
        }
        else System.out.println("The specified element is not in the array");
    }
/*
      //==================================================================
        int[] myArray2 = {8, 2, 3, 5, 7, -7, 5, 19, -5, 15, 17, 16, 18};
        //int[] myArray2 = {3, 2};
        if (ArrayExercises.secondMaxNo(myArray2) != 0)
            System.out.println("The second max number in array: " + ArrayExercises.secondMaxNo(myArray2));
    }

       String[] myEStringArray = {"masa", "input", "casa", "calculator", "casa", "calc","masa"};
       // String[] myEStringArray = {"masa", "input", "casa", "calculator", "calc"};
       //String[] myEStringArray = {"masa"};

        //ArrayExercises.findDuplicateValues(myEStringArray);
        ArrayExercises.findDuplicateValues2(myEStringArray);

    }
    */
}
