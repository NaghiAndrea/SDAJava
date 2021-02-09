package fundamentals.arraysStrings.arrays;

import java.net.BindException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays: For these exercises implement them as methods in a class: ArrayExercises and test them in Main
 * Write a Java program to find maximum product of two integers in a given array of integers.
 * Example: nums = { 2, 3, 5, 7, -7, 5, 8, -5 } => Pair is (7, 8), Maximum Product: 56
 * Write a Java program to test if an array of strings contains a specific value.
 * Write a Java program to remove a specific element from an array.
 * Write a Java program to find the max number (harder: the second max number) in an array of integers.
 * Write a Java program to find the duplicate values of an array of string values.
 * Strings: For these exercises implement them as methods in a class: StringExercises and test them in Main
 * Write a Java program to get the character at the given index within the String
 * Write a Java program to test if a given string contains the specified sequence of char values (another string).
 * Write a Java program to replace a specified character with another character in a string.
 * Write a Java program to uppercase first letter of every word in a text(string).
 * Write a Java program to compare 2 strings ignoring case consideration.  (e.g: “Dog” is equal to “dOG”)
 * <p>
 * *Use String’s methods to implement the string exercises!
 * *After all the exercises are implemented by you, you will receive the solutions for them!
 */


public class ArrayExercises {

    //Write a Java program to find maximum product of two integers in a given array of integers.
    // * Example: nums = { 2, 3, 5, 7, -7, 5, 8, -5 } => Pair is (7, 8), Maximum Product: 56
    public static void maxProductOfTwoInt(int[] myArray) {
        int num1 = 0, num2 = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int k = i + 1; k < myArray.length; k++) {
                if (myArray[i] * myArray[k] > num1 * num2) {
                    num1 = myArray[i];
                    num2 = myArray[k];
                }
            }
        }
        System.out.println("Pair is (" + num1 + ", " + num2 + ")");
        System.out.println("Maximum Product: " + num1 * num2);
    }

    // Write a Java program to test if an array of strings contains a specific value.
    public static void specificValInStringArray(String[] myArray) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value: ");
        String value = input.next();
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].contains(value)) {
                System.out.println("The array of strings contains the value.");
                return;
            }
        }
        System.out.println("The array doesn't contain the value.");
    }
//* Write a Java program to remove a specific element from an array.
    public static String[] removeElement(String[] myArray, String toRemove) {
        int n = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equals(toRemove)) {
                n++;
            }
        }
        String[] newArray = new String[myArray.length - n];
        int k = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (!myArray[i].equals(toRemove)) {
                newArray[k++] = myArray[i];
            }
        }
        return newArray;
    }
/*
     public static String[] removeElement2(String[] myArray, String toRemove) {

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equals(null)) break;
            if (myArray[i].equals(toRemove)) {

                int j = i;
                while (j < myArray.length-1) {
                    myArray[j] = myArray[j + 1];
                    j++;
                    if ((j+1== myArray.length) || (myArray[j+1] == null)) {
                        myArray[j] = null;
                        break;
                    }
                }
            }
        }
       return myArray;
    }
*/

//* Write a Java program to find the max number (harder: the second max number) in an array of integers.
    public static int secondMaxNo(int[] myArray) {
        int max1 = 0, max2 = 0;
        if (myArray.length < 2) {
            System.out.println("Error: not enough elements in array.");
            return 0;
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max1) {
                max2 = max1;
                max1 = myArray[i];
                continue;
            }
            if (myArray[i] > max2) {
                max2 = myArray[i];
            }
        }
        return max2;
    }

// Write a Java program to find the duplicate values of an array of string values.
    public static void findDuplicateValues(String[] myArray) {
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int k = i + 1; k < myArray.length; k++) {
                if (myArray[k].equals(myArray[i])) {
                    System.out.println(myArray[k] + " ");
                }
            }
        }
    }

    public static void findDuplicateValues2(String[] myArray) {
        String[] newArray = new String[myArray.length];
        int[] countArray = new int[myArray.length];
        int index = 0;

        for (int i = 0; i < myArray.length; i++) {
            boolean inNewArray = false;
            for (int j = 0; j < index; j++) {
                        if (newArray[j].equals(myArray[i])) {
                            countArray[j]++;
                            inNewArray = true;
                            break;
                        }
                    }
            if (inNewArray == false) {
                      newArray[index] = myArray[i];
                      countArray[index]++;
                      index++;
                    }
                }

        boolean foundDuplicates = false;
        System.out.println("Duplicatele: ");
        for (int i = 0; i < index; i++) {
            if (countArray[i] > 1) {
                System.out.println(newArray[i]);
                foundDuplicates = true;
            }
        }
        if (!foundDuplicates) {
            System.out.println("Nu sunt duplicate");
        }
    }
}
