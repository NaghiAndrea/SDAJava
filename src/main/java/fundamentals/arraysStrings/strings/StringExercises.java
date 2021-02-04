package fundamentals.arraysStrings.strings;

import java.util.Scanner;

public class StringExercises {
    public static void findCharByIndex() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = input.nextLine();
        System.out.println("Enter the index: ");
        int index = input.nextInt();
        if (index < text.length()) {
            System.out.println("La indexul " + index + " se afla caracterul " + text.charAt(index));
            return;
        }
        System.out.println("Prea mare indexul.");
    }

    public static boolean charSeqInString(String text, String toFind) {
        if (text.contains(toFind)) return true;
        return false;
    }

    public static String replaceCharacter(String text, char oldchar, char newChar) {
        return text.replace(oldchar, newChar);
    }

    public static String uppCaseFstLetters(String text) {
        String newString = "";
        String[] wordArray = text.split(" ");
        for (int i = 0; i < wordArray.length; i++) {
            newString = newString + " " + wordArray[i].substring(0, 1).toUpperCase() + wordArray[i].substring(1);
            //text.substring(0,1) -first letter -index 0 to 1
            //text.substring(1) - from index 1 to the end of string
        }
        return newString;
    }

    public static boolean compareTwoStrings(String string1, String string2) {
        if (string1.toUpperCase().equals(string2.toUpperCase())) {
            return true;
        }
        return false;
    }
}
