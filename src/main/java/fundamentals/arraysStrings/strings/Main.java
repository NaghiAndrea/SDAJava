package fundamentals.arraysStrings.strings;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  StringExercises.findCharByIndex();


        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the string: ");
//        String text = input.nextLine();
//        System.out.println("Enter the char sequence: ");
//        String toFind = input.next();
//        if (StringExercises.charSeqInString(text,toFind))
//            System.out.println("The text contains the sequence of character.");
//        else System.out.println("The text doesn't contain the sequence of character.");

//        System.out.print("Enter the string: ");
//        String textB = input.nextLine();
//        System.out.print("Enter the character to be replaced: ");
//        char toFindB = input.next().charAt(0);
//        System.out.print("Enter the new character: ");
//        char newChar = input.next().charAt(0);
//        System.out.println("The new string: " + StringExercises.replaceCharacter(textB,toFindB,newChar));


//        System.out.print("Enter the string: ");
//        String textC = input.nextLine();
//
//        System.out.println("New text: " + StringExercises.uppCaseFstLetters(textC));

        System.out.print("Enter the first string: ");
        String string1 = input.next();
        System.out.print("Enter the second string: ");
        String string2 = input.next();

//        if (StringExercises.compareTwoStrings("dog", "DoG")) {
//            System.out.println("The strings are equal.");
//        }
//        else System.out.println("The strings are not equal.");

        if (StringExercises.compareTwoStrings(string1, string2)) {
            System.out.println("The strings are equal.");
        } else System.out.println("The strings are not equal.");

    }
}
